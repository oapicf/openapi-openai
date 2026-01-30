package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeResponse

/**
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.done`.
 * @param response 
 */
case class RealtimeServerEventResponseDone(eventUnderscoreid: String,
                _type: String,
                response: RealtimeResponse
                )

object RealtimeServerEventResponseDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseDone] = deriveEncoder
}
