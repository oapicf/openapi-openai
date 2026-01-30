package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `conversation.item.input_audio_transcription.completed`. 
 * @param itemUnderscoreid The ID of the user message item containing the audio.
 * @param contentUnderscoreindex The index of the content part containing the audio.
 * @param transcript The transcribed text.
 */
case class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(eventUnderscoreid: String,
                _type: String,
                itemUnderscoreid: String,
                contentUnderscoreindex: Int,
                transcript: String
                )

object RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {
    /**
     * Creates the codec for converting RealtimeServerEventConversationItemInputAudioTranscriptionCompleted from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = deriveEncoder
}
