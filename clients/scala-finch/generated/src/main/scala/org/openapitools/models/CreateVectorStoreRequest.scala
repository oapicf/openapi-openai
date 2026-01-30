package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateVectorStoreRequestChunkingStrategy
import org.openapitools.models.VectorStoreExpirationAfter
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreids A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
 * @param name The name of the vector store.
 * @param expiresUnderscoreafter 
 * @param chunkingUnderscorestrategy 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
case class CreateVectorStoreRequest(fileUnderscoreids: Option[Seq[String]],
                name: Option[String],
                expiresUnderscoreafter: Option[VectorStoreExpirationAfter],
                chunkingUnderscorestrategy: Option[CreateVectorStoreRequestChunkingStrategy],
                metadata: Option[Object]
                )

object CreateVectorStoreRequest {
    /**
     * Creates the codec for converting CreateVectorStoreRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateVectorStoreRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateVectorStoreRequest] = deriveEncoder
}
