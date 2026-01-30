package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Error

/**
 * Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 * @param event 
 * @param data 
 */
case class ErrorEvent(event: String,
                data: Error
                )

object ErrorEvent {
    /**
     * Creates the codec for converting ErrorEvent from and to JSON.
     */
    implicit val decoder: Decoder[ErrorEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ErrorEvent] = deriveEncoder
}
