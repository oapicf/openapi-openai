package model

import play.api.libs.json._

/**
  * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `conversation.item.input_audio_transcription.completed`. 
  * @param itemId The ID of the user message item containing the audio.
  * @param contentIndex The index of the content part containing the audio.
  * @param transcript The transcribed text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(
  eventId: String,
  `type`: RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.Type.Value,
  itemId: String,
  contentIndex: Int,
  transcript: String
)

object RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {
  implicit lazy val realtimeServerEventConversationItemInputAudioTranscriptionCompletedJsonFormat: Format[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = Json.format[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemInputAudioTranscriptionCompleted = Value("conversation.item.input_audio_transcription.completed")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

