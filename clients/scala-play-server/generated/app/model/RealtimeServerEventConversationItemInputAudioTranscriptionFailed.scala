package model

import play.api.libs.json._

/**
  * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `conversation.item.input_audio_transcription.failed`. 
  * @param itemId The ID of the user message item.
  * @param contentIndex The index of the content part containing the audio.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventConversationItemInputAudioTranscriptionFailed(
  eventId: String,
  `type`: RealtimeServerEventConversationItemInputAudioTranscriptionFailed.Type.Value,
  itemId: String,
  contentIndex: Int,
  error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
)

object RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
  implicit lazy val realtimeServerEventConversationItemInputAudioTranscriptionFailedJsonFormat: Format[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = Json.format[RealtimeServerEventConversationItemInputAudioTranscriptionFailed]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemInputAudioTranscriptionFailed = Value("conversation.item.input_audio_transcription.failed")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

