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
case class DeleteVectorStoreFileResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteVectorStoreFileResponse {
    /**
     * Creates the codec for converting DeleteVectorStoreFileResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteVectorStoreFileResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteVectorStoreFileResponse] = deriveEncoder
}
