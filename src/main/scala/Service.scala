import cats.effect._
import cats.implicits._
import io.circe.literal._
import org.http4s.HttpRoutes
import org.http4s.circe.CirceEntityCodec.circeEntityEncoder
import org.http4s.client.{Client, JavaNetClientBuilder}
import org.http4s.dsl.io._
import org.http4s.implicits._
import org.http4s.server.blaze._

import java.util.concurrent.Executors
import scala.util.Try

object Service extends IOApp {
  val blockingPool = Executors.newFixedThreadPool(5)
  val blocker = Blocker.liftExecutorService(blockingPool)
  val httpClient: Client[IO] = JavaNetClientBuilder[IO](blocker).create
  val trivia = new TriviaClient(httpClient)

  val service = HttpRoutes.of[IO] {
    case GET -> Root / "leap" / IntVar(year) =>
      Ok(s"The year $year ${YearTools.isLeapYear(year)} a leap year! Did you know that: ${trivia.funFact(year)}")
  }.orNotFound

  def run(args: List[String]): IO[ExitCode] =
    BlazeServerBuilder[IO]
      .bindHttp(Try(sys.env("PORT").toInt).getOrElse(8080), "0.0.0.0")
      .withHttpApp(service)
      .serve
      .compile
      .drain
      .as(ExitCode.Success)
}
