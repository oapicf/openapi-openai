package model

import play.api.libs.json._

/**
  * A vector store is a collection of processed files can be used by the `file_search` tool.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `vector_store`.
  * @param createdAt The Unix timestamp (in seconds) for when the vector store was created.
  * @param name The name of the vector store.
  * @param usageBytes The total number of bytes used by the files in the vector store.
  * @param status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  * @param expiresAt The Unix timestamp (in seconds) for when the vector store will expire.
  * @param lastActiveAt The Unix timestamp (in seconds) for when the vector store was last active.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VectorStoreObject(
  id: String,
  `object`: VectorStoreObject.Object.Value,
  createdAt: Int,
  name: String,
  usageBytes: Int,
  fileCounts: VectorStoreObjectFileCounts,
  status: VectorStoreObject.Status.Value,
  expiresAfter: Option[VectorStoreExpirationAfter],
  expiresAt: Option[Int],
  lastActiveAt: Int,
  metadata: JsObject
)

object VectorStoreObject {
  implicit lazy val vectorStoreObjectJsonFormat: Format[VectorStoreObject] = Json.format[VectorStoreObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val VectorStore = Value("vector_store")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Expired = Value("expired")
    val InProgress = Value("in_progress")
    val Completed = Value("completed")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

