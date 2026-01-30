package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `input_audio_buffer.speech_started`.
 * @param audioUnderscorestartUnderscorems Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
 * @param itemUnderscoreid The ID of the user message item that will be created when speech stops. 
 */
case class RealtimeServerEventInputAudioBufferSpeechStarted(eventUnderscoreid: String,
                _type: String,
                audioUnderscorestartUnderscorems: Int,
                itemUnderscoreid: String
                )

object RealtimeServerEventInputAudioBufferSpeechStarted {
    /**
     * Creates the codec for converting RealtimeServerEventInputAudioBufferSpeechStarted from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventInputAudioBufferSpeechStarted] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventInputAudioBufferSpeechStarted] = deriveEncoder
}
