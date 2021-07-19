import sbt._

object Version {
  final val ScalaTest = "3.1.0"
  final val PureConfig = "0.12.2"
  final val Http4s = "0.18.0-M2+4048-2c21e66d-SNAPSHOT"
  final val Circe = "0.15.0-M1"
  final val LogBack = "1.2.3"
  final val ScalaLogging = "3.9.4"
}

object Library {
  val PureConfig = "com.github.pureconfig" %% "pureconfig" % Version.PureConfig
  val ScalaTest = "org.scalatest" %% "scalatest" % Version.ScalaTest % "test"
  val Http4sDsl = "org.http4s" %% "http4s-dsl" % Version.Http4s
  val Http4sBlazeServer = "org.http4s" %% "http4s-blaze-server" % Version.Http4s
  val Http4sBlazeClient = "org.http4s" %% "http4s-blaze-client" % Version.Http4s
  val Http4sCirce = "org.http4s" %% "http4s-circe" % Version.Http4s
  val CirceGeneric = "io.circe" %% "circe-generic" % Version.Circe
  val CirceLiteral = "io.circe" %% "circe-literal" % Version.Circe
  val LogBack = "ch.qos.logback" % "logback-classic" % Version.LogBack
  val ScalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.ScalaLogging
}
