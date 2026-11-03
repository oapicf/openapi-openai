package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsFileSearch.
  * @param `type` The type of tool being defined: `file_search`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

