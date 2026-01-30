package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeServerEventResponseContentPartAddedPart

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.content_part.added`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item to which the content part was added.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 * @param part 
 */
case class RealtimeServerEventResponseContentPartAdded(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int,
                part: RealtimeServerEventResponseContentPartAddedPart
                )

object RealtimeServerEventResponseContentPartAdded {
    /**
     * Creates the codec for converting RealtimeServerEventResponseContentPartAdded from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseContentPartAdded] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseContentPartAdded] = deriveEncoder
}
