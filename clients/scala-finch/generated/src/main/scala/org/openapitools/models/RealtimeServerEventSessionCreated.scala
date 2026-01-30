package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeSession

/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `session.created`.
 * @param session 
 */
case class RealtimeServerEventSessionCreated(eventUnderscoreid: String,
                _type: String,
                session: RealtimeSession
                )

object RealtimeServerEventSessionCreated {
    /**
     * Creates the codec for converting RealtimeServerEventSessionCreated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventSessionCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventSessionCreated] = deriveEncoder
}
