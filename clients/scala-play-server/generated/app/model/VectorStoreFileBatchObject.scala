package model

import play.api.libs.json._

/**
  * A batch of files attached to a vector store.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `vector_store.file_batch`.
  * @param createdAt The Unix timestamp (in seconds) for when the vector store files batch was created.
  * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  * @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VectorStoreFileBatchObject(
  id: String,
  `object`: VectorStoreFileBatchObject.Object.Value,
  createdAt: Int,
  vectorStoreId: String,
  status: VectorStoreFileBatchObject.Status.Value,
  fileCounts: VectorStoreFileBatchObjectFileCounts
)

object VectorStoreFileBatchObject {
  implicit lazy val vectorStoreFileBatchObjectJsonFormat: Format[VectorStoreFileBatchObject] = Json.format[VectorStoreFileBatchObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val VectorStoreFilesBatch = Value("vector_store.files_batch")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val InProgress = Value("in_progress")
    val Completed = Value("completed")
    val Cancelled = Value("cancelled")
    val Failed = Value("failed")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

