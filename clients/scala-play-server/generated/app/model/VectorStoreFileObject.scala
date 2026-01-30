package model

import play.api.libs.json._

/**
  * A list of files attached to a vector store.
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `vector_store.file`.
  * @param usageBytes The total vector store usage in bytes. Note that this may be different from the original file size.
  * @param createdAt The Unix timestamp (in seconds) for when the vector store file was created.
  * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  * @param status The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class VectorStoreFileObject(
  id: String,
  `object`: VectorStoreFileObject.Object.Value,
  usageBytes: Int,
  createdAt: Int,
  vectorStoreId: String,
  status: VectorStoreFileObject.Status.Value,
  lastError: VectorStoreFileObjectLastError,
  chunkingStrategy: Option[VectorStoreFileObjectChunkingStrategy]
)

object VectorStoreFileObject {
  implicit lazy val vectorStoreFileObjectJsonFormat: Format[VectorStoreFileObject] = Json.format[VectorStoreFileObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val VectorStoreFile = Value("vector_store.file")

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

