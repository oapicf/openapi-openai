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
case class DeleteMessageResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteMessageResponse {
    /**
     * Creates the codec for converting DeleteMessageResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteMessageResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteMessageResponse] = deriveEncoder
}
