package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VectorStoreFileObjectChunkingStrategy
import org.openapitools.models.VectorStoreFileObjectLastError

/**
 * A list of files attached to a vector store.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `vector_store.file`.
 * @param usageUnderscorebytes The total vector store usage in bytes. Note that this may be different from the original file size.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the vector store file was created.
 * @param vectorUnderscorestoreUnderscoreid The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @param status The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
 * @param lastUnderscoreerror 
 * @param chunkingUnderscorestrategy 
 */
case class VectorStoreFileObject(id: String,
                _object: String,
                usageUnderscorebytes: Int,
                createdUnderscoreat: Int,
                vectorUnderscorestoreUnderscoreid: String,
                status: String,
                lastUnderscoreerror: VectorStoreFileObjectLastError,
                chunkingUnderscorestrategy: Option[VectorStoreFileObjectChunkingStrategy]
                )

object VectorStoreFileObject {
    /**
     * Creates the codec for converting VectorStoreFileObject from and to JSON.
     */
    implicit val decoder: Decoder[VectorStoreFileObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[VectorStoreFileObject] = deriveEncoder
}
