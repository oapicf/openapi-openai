package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantObject_tool_resources_file_search.
  * @param vectorStoreIds The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantObjectToolResourcesFileSearch(
  vectorStoreIds: Option[List[String]]
)

object AssistantObjectToolResourcesFileSearch {
  implicit lazy val assistantObjectToolResourcesFileSearchJsonFormat: Format[AssistantObjectToolResourcesFileSearch] = Json.format[AssistantObjectToolResourcesFileSearch]
}

