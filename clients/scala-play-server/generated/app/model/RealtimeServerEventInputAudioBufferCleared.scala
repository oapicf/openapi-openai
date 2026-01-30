package model

import play.api.libs.json._

/**
  * Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `input_audio_buffer.cleared`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventInputAudioBufferCleared(
  eventId: String,
  `type`: RealtimeServerEventInputAudioBufferCleared.Type.Value
)

object RealtimeServerEventInputAudioBufferCleared {
  implicit lazy val realtimeServerEventInputAudioBufferClearedJsonFormat: Format[RealtimeServerEventInputAudioBufferCleared] = Json.format[RealtimeServerEventInputAudioBufferCleared]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudioBufferCleared = Value("input_audio_buffer.cleared")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

