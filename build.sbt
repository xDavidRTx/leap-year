name := "leep_years_api"

version := "0.1"

scalaVersion := "2.13.6"

resolvers += Resolver.sonatypeRepo("snapshots")

herokuAppName in Compile := "leapyearapi"

libraryDependencies ++= Seq(
  Library.Http4sDsl,
  Library.Http4sBlazeServer,
  Library.Http4sBlazeClient,
  Library.Http4sCirce,
  Library.CirceGeneric,
  Library.CirceLiteral,
  Library.LogBack,
  Library.ScalaLogging,
  Library.ScalaTest,
  Library.PureConfig
)

enablePlugins(JavaAppPackaging)
