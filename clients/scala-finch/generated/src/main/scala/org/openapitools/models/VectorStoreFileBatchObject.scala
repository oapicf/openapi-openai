package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VectorStoreFileBatchObjectFileCounts

/**
 * A batch of files attached to a vector store.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `vector_store.file_batch`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the vector store files batch was created.
 * @param vectorUnderscorestoreUnderscoreid The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
 * @param fileUnderscorecounts 
 */
case class VectorStoreFileBatchObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                vectorUnderscorestoreUnderscoreid: String,
                status: String,
                fileUnderscorecounts: VectorStoreFileBatchObjectFileCounts
                )

object VectorStoreFileBatchObject {
    /**
     * Creates the codec for converting VectorStoreFileBatchObject from and to JSON.
     */
    implicit val decoder: Decoder[VectorStoreFileBatchObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[VectorStoreFileBatchObject] = deriveEncoder
}
