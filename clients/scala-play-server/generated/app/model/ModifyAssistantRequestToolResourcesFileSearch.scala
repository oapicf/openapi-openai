package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ModifyAssistantRequest_tool_resources_file_search.
  * @param vectorStoreIds Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ModifyAssistantRequestToolResourcesFileSearch(
  vectorStoreIds: Option[List[String]]
)

object ModifyAssistantRequestToolResourcesFileSearch {
  implicit lazy val modifyAssistantRequestToolResourcesFileSearchJsonFormat: Format[ModifyAssistantRequestToolResourcesFileSearch] = Json.format[ModifyAssistantRequestToolResourcesFileSearch]
}

