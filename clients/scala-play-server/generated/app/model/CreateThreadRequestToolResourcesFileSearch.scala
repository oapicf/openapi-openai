package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateThreadRequest_tool_resources_file_search.
  * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  * @param vectorStores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateThreadRequestToolResourcesFileSearch(
  vectorStoreIds: Option[List[String]],
  vectorStores: Option[List[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]]
)

object CreateThreadRequestToolResourcesFileSearch {
  implicit lazy val createThreadRequestToolResourcesFileSearchJsonFormat: Format[CreateThreadRequestToolResourcesFileSearch] = Json.format[CreateThreadRequestToolResourcesFileSearch]
}

