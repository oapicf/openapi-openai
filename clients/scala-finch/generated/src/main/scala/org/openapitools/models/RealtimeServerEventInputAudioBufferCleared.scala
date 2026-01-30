package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `input_audio_buffer.cleared`.
 */
case class RealtimeServerEventInputAudioBufferCleared(eventUnderscoreid: String,
                _type: String
                )

object RealtimeServerEventInputAudioBufferCleared {
    /**
     * Creates the codec for converting RealtimeServerEventInputAudioBufferCleared from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventInputAudioBufferCleared] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventInputAudioBufferCleared] = deriveEncoder
}
