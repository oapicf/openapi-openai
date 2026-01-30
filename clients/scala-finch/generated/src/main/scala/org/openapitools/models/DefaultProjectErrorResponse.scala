package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code 
 * @param message 
 */
case class DefaultProjectErrorResponse(code: Int,
                message: String
                )

object DefaultProjectErrorResponse {
    /**
     * Creates the codec for converting DefaultProjectErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[DefaultProjectErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[DefaultProjectErrorResponse] = deriveEncoder
}
