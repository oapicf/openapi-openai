package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Error

/**
 * 
 * @param error 
 */
case class ErrorResponse(error: Error
                )

object ErrorResponse {
    /**
     * Creates the codec for converting ErrorResponse from and to JSON.
     */
    implicit val decoder: Decoder[ErrorResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ErrorResponse] = deriveEncoder
}
