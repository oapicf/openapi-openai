package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeResponse

/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.created`.
 * @param response 
 */
case class RealtimeServerEventResponseCreated(eventUnderscoreid: String,
                _type: String,
                response: RealtimeResponse
                )

object RealtimeServerEventResponseCreated {
    /**
     * Creates the codec for converting RealtimeServerEventResponseCreated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseCreated] = deriveEncoder
}
