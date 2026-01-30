package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateVectorStoreFileRequest.
  * @param fileId A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateVectorStoreFileRequest(
  fileId: String,
  chunkingStrategy: Option[ChunkingStrategyRequestParam]
)

object CreateVectorStoreFileRequest {
  implicit lazy val createVectorStoreFileRequestJsonFormat: Format[CreateVectorStoreFileRequest] = Json.format[CreateVectorStoreFileRequest]
}

