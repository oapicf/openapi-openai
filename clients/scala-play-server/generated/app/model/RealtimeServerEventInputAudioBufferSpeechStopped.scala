package model

import play.api.libs.json._

/**
  * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `input_audio_buffer.speech_stopped`.
  * @param audioEndMs Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
  * @param itemId The ID of the user message item that will be created.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventInputAudioBufferSpeechStopped(
  eventId: String,
  `type`: RealtimeServerEventInputAudioBufferSpeechStopped.Type.Value,
  audioEndMs: Int,
  itemId: String
)

object RealtimeServerEventInputAudioBufferSpeechStopped {
  implicit lazy val realtimeServerEventInputAudioBufferSpeechStoppedJsonFormat: Format[RealtimeServerEventInputAudioBufferSpeechStopped] = Json.format[RealtimeServerEventInputAudioBufferSpeechStopped]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudioBufferSpeechStopped = Value("input_audio_buffer.speech_stopped")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

