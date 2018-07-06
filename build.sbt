lazy val commonSettings = Seq(
  organization := "com.emaginalabs",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.12.2"
)

CommandAliases.addCommandAliases()

lazy val root = (project in file("."))
  .aggregate(server, core)

lazy val core = (project in file("core"))
  .settings(
    commonSettings
  )

lazy val server = (project in file("server"))
  .settings(
    commonSettings
  ).dependsOn(core)
