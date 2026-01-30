package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeServerEventErrorError

/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `error`.
 * @param error 
 */
case class RealtimeServerEventError(eventUnderscoreid: String,
                _type: String,
                error: RealtimeServerEventErrorError
                )

object RealtimeServerEventError {
    /**
     * Creates the codec for converting RealtimeServerEventError from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventError] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventError] = deriveEncoder
}
