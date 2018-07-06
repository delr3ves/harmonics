import Dependencies.Versions._

name := "harmonics-server"


libraryDependencies ++= Dependencies.LoggingBackend ++ Seq(
  "com.twitter" %% "finatra-http" % FinatraVersion,

  "com.twitter" %% "finatra-http" % FinatraVersion % "test" classifier "tests"
)

mainClass in assembly := Some("com.emaginalabs.harmonics.server.HarmonicsServerMain")

assemblyJarName in assembly := "harmonics-server.jar"

addArtifact(artifact in(Compile, assembly), assembly)

assemblyMergeStrategy in assembly := {
  case "BUILD" => MergeStrategy.discard
  case PathList("application.conf") => MergeStrategy.concat
  case PathList("javax", _ *) => MergeStrategy.first
  case PathList("org", "aopalliance", _ *) => MergeStrategy.first
  case PathList("org", "joda", _ *) => MergeStrategy.first
  case other => (assemblyMergeStrategy in assembly).value(other)
}