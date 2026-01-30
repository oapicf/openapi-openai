package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssistantRequest_tool_resources_file_search_vector_stores_inner.
  * @param fileIds A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  * @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner(
  fileIds: Option[List[String]],
  chunkingStrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
  metadata: Option[JsObject]
)

object CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {
  implicit lazy val createAssistantRequestToolResourcesFileSearchVectorStoresInnerJsonFormat: Format[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] = Json.format[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]
}

