package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ModifyThreadRequest_tool_resources_file_search.
  * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ModifyThreadRequestToolResourcesFileSearch(
  vectorStoreIds: Option[List[String]]
)

object ModifyThreadRequestToolResourcesFileSearch {
  implicit lazy val modifyThreadRequestToolResourcesFileSearchJsonFormat: Format[ModifyThreadRequestToolResourcesFileSearch] = Json.format[ModifyThreadRequestToolResourcesFileSearch]
}

