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
case class DeleteModelResponse(id: String,
                deleted: Boolean,
                _object: String
                )

object DeleteModelResponse {
    /**
     * Creates the codec for converting DeleteModelResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteModelResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteModelResponse] = deriveEncoder
}
