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
case class DeleteThreadResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteThreadResponse {
    /**
     * Creates the codec for converting DeleteThreadResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteThreadResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteThreadResponse] = deriveEncoder
}
