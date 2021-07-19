import cats.effect._
import com.typesafe.scalalogging.LazyLogging
import org.http4s.Header
import org.http4s.client.Client
import org.http4s.client.dsl.io._
import org.http4s.dsl.io.GET
import org.http4s.implicits.http4sLiteralsSyntax

class TriviaClient(httpClient: Client[IO]) extends LazyLogging {

  def funFact(year: Int): String = {
    logger.debug(s"Fetching fun fact for year $year")
    val request = GET(
      uri"https://numbersapi.p.rapidapi.com/" / year.toString / "year",
      Header("X-RapidAPI-Key", ConfigLoader.authKey)
    )
    // TODO - Error Handling
    httpClient.expect[String](request).unsafeRunSync()
  }
}
