name := "harmonics-server"


mainClass in assembly := Some("com.emaginalabs.harmonics.server.Application")

assemblyJarName in assembly := "harmonics-server.jar"

addArtifact(artifact in (Compile, assembly), assembly)

assemblyMergeStrategy in assembly := {
  case "BUILD" => MergeStrategy.discard
  case PathList("application.conf") => MergeStrategy.concat
  case PathList("javax", _ *) => MergeStrategy.first
  case PathList("org", "aopalliance", _ *) => MergeStrategy.first
  case PathList("org", "joda", _ *) => MergeStrategy.first
  case other => (assemblyMergeStrategy in assembly).value(other)
}