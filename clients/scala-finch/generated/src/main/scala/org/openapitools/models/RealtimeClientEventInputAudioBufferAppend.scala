package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `input_audio_buffer.append`.
 * @param audio Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
 */
case class RealtimeClientEventInputAudioBufferAppend(eventUnderscoreid: Option[String],
                _type: String,
                audio: String
                )

object RealtimeClientEventInputAudioBufferAppend {
    /**
     * Creates the codec for converting RealtimeClientEventInputAudioBufferAppend from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventInputAudioBufferAppend] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventInputAudioBufferAppend] = deriveEncoder
}
