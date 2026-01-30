package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `input_audio_buffer.committed`.
 * @param previousUnderscoreitemUnderscoreid The ID of the preceding item after which the new item will be inserted. 
 * @param itemUnderscoreid The ID of the user message item that will be created.
 */
case class RealtimeServerEventInputAudioBufferCommitted(eventUnderscoreid: String,
                _type: String,
                previousUnderscoreitemUnderscoreid: String,
                itemUnderscoreid: String
                )

object RealtimeServerEventInputAudioBufferCommitted {
    /**
     * Creates the codec for converting RealtimeServerEventInputAudioBufferCommitted from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventInputAudioBufferCommitted] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventInputAudioBufferCommitted] = deriveEncoder
}
