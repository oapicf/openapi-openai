package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateVectorStoreRequest.
  * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  * @param name The name of the vector store.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateVectorStoreRequest(
  fileIds: Option[List[String]],
  name: Option[String],
  expiresAfter: Option[VectorStoreExpirationAfter],
  chunkingStrategy: Option[CreateVectorStoreRequestChunkingStrategy],
  metadata: Option[JsObject]
)

object CreateVectorStoreRequest {
  implicit lazy val createVectorStoreRequestJsonFormat: Format[CreateVectorStoreRequest] = Json.format[CreateVectorStoreRequest]
}

