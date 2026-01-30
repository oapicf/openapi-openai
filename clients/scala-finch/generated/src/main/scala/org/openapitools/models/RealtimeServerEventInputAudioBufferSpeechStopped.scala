package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `input_audio_buffer.speech_stopped`.
 * @param audioUnderscoreendUnderscorems Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
 * @param itemUnderscoreid The ID of the user message item that will be created.
 */
case class RealtimeServerEventInputAudioBufferSpeechStopped(eventUnderscoreid: String,
                _type: String,
                audioUnderscoreendUnderscorems: Int,
                itemUnderscoreid: String
                )

object RealtimeServerEventInputAudioBufferSpeechStopped {
    /**
     * Creates the codec for converting RealtimeServerEventInputAudioBufferSpeechStopped from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventInputAudioBufferSpeechStopped] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventInputAudioBufferSpeechStopped] = deriveEncoder
}
