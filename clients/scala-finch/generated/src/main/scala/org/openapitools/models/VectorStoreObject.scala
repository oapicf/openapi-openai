package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VectorStoreExpirationAfter
import org.openapitools.models.VectorStoreObjectFileCounts

/**
 * A vector store is a collection of processed files can be used by the `file_search` tool.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param _object The object type, which is always `vector_store`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the vector store was created.
 * @param name The name of the vector store.
 * @param usageUnderscorebytes The total number of bytes used by the files in the vector store.
 * @param fileUnderscorecounts 
 * @param status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
 * @param expiresUnderscoreafter 
 * @param expiresUnderscoreat The Unix timestamp (in seconds) for when the vector store will expire.
 * @param lastUnderscoreactiveUnderscoreat The Unix timestamp (in seconds) for when the vector store was last active.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
case class VectorStoreObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                name: String,
                usageUnderscorebytes: Int,
                fileUnderscorecounts: VectorStoreObjectFileCounts,
                status: String,
                expiresUnderscoreafter: Option[VectorStoreExpirationAfter],
                expiresUnderscoreat: Option[Int],
                lastUnderscoreactiveUnderscoreat: Int,
                metadata: Object
                )

object VectorStoreObject {
    /**
     * Creates the codec for converting VectorStoreObject from and to JSON.
     */
    implicit val decoder: Decoder[VectorStoreObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[VectorStoreObject] = deriveEncoder
}
