import sbt._

object Dependencies {

  object Versions {
    val FinatraVersion = "18.6.0"
    val LogbackVersion = "1.3.0-alpha4"
  }

  val LoggingBackend = Seq(
    "com.tapstream" % "rollbar-logback" % "0.1",
    "ch.qos.logback" % "logback-classic" % Versions.LogbackVersion,
    "ch.qos.logback" % "logback-core" % Versions.LogbackVersion
  )

}