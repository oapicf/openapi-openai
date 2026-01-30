package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VectorStoreExpirationAfter

/**
 * 
 * @param name The name of the vector store.
 * @param expiresUnderscoreafter 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
case class UpdateVectorStoreRequest(name: Option[String],
                expiresUnderscoreafter: Option[VectorStoreExpirationAfter],
                metadata: Option[Object]
                )

object UpdateVectorStoreRequest {
    /**
     * Creates the codec for converting UpdateVectorStoreRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateVectorStoreRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateVectorStoreRequest] = deriveEncoder
}
