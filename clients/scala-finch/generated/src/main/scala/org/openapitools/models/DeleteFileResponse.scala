package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id 
 * @param _object 
 * @param deleted 
 */
case class DeleteFileResponse(id: String,
                _object: String,
                deleted: Boolean
                )

object DeleteFileResponse {
    /**
     * Creates the codec for converting DeleteFileResponse from and to JSON.
     */
    implicit val decoder: Decoder[DeleteFileResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteFileResponse] = deriveEncoder
}
