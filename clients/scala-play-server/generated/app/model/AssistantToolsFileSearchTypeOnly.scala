package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsFileSearchTypeOnly.
  * @param `type` The type of tool being defined: `file_search`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssistantToolsFileSearchTypeOnly(
  `type`: AssistantToolsFileSearchTypeOnly.Type.Value
)

object AssistantToolsFileSearchTypeOnly {
  implicit lazy val assistantToolsFileSearchTypeOnlyJsonFormat: Format[AssistantToolsFileSearchTypeOnly] = Json.format[AssistantToolsFileSearchTypeOnly]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FileSearch = Value("file_search")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

