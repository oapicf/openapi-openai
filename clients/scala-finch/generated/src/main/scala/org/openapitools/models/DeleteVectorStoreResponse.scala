package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param deleted 
 * @param _object 
 */
case class DeleteVectorStoreResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteVectorStoreResponse {
    /**
     * Creates the codec for converting DeleteVectorStoreResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteVectorStoreResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteVectorStoreResponse] = deriveEncoder
}
