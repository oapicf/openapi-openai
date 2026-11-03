package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateVectorStoreFileBatchRequest.
  * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateVectorStoreFileBatchRequest(
  fileIds: List[String],
  chunkingStrategy: Option[ChunkingStrategyRequestParam]
)

object CreateVectorStoreFileBatchRequest {
  implicit lazy val createVectorStoreFileBatchRequestJsonFormat: Format[CreateVectorStoreFileBatchRequest] = Json.format[CreateVectorStoreFileBatchRequest]
}

