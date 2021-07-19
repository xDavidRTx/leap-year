import pureconfig.ConfigSource
import pureconfig.generic.auto._

case class Secret(authKey: String)

object ConfigLoader {
  //TODO - ERROR Handling
  implicit val authKey: String = ConfigSource.default.loadOrThrow[Secret].authKey
}
