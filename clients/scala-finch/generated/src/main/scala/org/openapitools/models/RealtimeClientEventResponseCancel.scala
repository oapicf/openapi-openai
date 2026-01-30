package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `response.cancel`.
 * @param responseUnderscoreid A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
 */
case class RealtimeClientEventResponseCancel(eventUnderscoreid: Option[String],
                _type: String,
                responseUnderscoreid: Option[String]
                )

object RealtimeClientEventResponseCancel {
    /**
     * Creates the codec for converting RealtimeClientEventResponseCancel from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventResponseCancel] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventResponseCancel] = deriveEncoder
}
