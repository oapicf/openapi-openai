package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `input_audio_buffer.clear`.
 */
case class RealtimeClientEventInputAudioBufferClear(eventUnderscoreid: Option[String],
                _type: String
                )

object RealtimeClientEventInputAudioBufferClear {
    /**
     * Creates the codec for converting RealtimeClientEventInputAudioBufferClear from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventInputAudioBufferClear] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventInputAudioBufferClear] = deriveEncoder
}
