package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeSession

/**
 * Returned when a session is updated with a `session.update` event, unless  there is an error. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `session.updated`.
 * @param session 
 */
case class RealtimeServerEventSessionUpdated(eventUnderscoreid: String,
                _type: String,
                session: RealtimeSession
                )

object RealtimeServerEventSessionUpdated {
    /**
     * Creates the codec for converting RealtimeServerEventSessionUpdated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventSessionUpdated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventSessionUpdated] = deriveEncoder
}
