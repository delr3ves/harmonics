import sbt.internal.DslEntry
import sbt.addCommandAlias

object CommandAliases {

  def addCommandAliases(): DslEntry = {
    addCommandAlias("format", ";scalafmt;test:scalafmt")
  }

}