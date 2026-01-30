package model

import play.api.libs.json._

/**
  * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `input_audio_buffer.clear`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventInputAudioBufferClear(
  eventId: Option[String],
  `type`: RealtimeClientEventInputAudioBufferClear.Type.Value
)

object RealtimeClientEventInputAudioBufferClear {
  implicit lazy val realtimeClientEventInputAudioBufferClearJsonFormat: Format[RealtimeClientEventInputAudioBufferClear] = Json.format[RealtimeClientEventInputAudioBufferClear]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudioBufferClear = Value("input_audio_buffer.clear")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

