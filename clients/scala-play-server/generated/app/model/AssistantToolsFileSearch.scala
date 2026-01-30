package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsFileSearch.
  * @param `type` The type of tool being defined: `file_search`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantToolsFileSearch(
  `type`: AssistantToolsFileSearch.Type.Value,
  fileSearch: Option[AssistantToolsFileSearchFileSearch]
)

object AssistantToolsFileSearch {
  implicit lazy val assistantToolsFileSearchJsonFormat: Format[AssistantToolsFileSearch] = Json.format[AssistantToolsFileSearch]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FileSearch = Value("file_search")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

