package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsFileSearchTypeOnly.
  * @param `type` The type of tool being defined: `file_search`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

