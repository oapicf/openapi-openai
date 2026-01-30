package model

import play.api.libs.json._

/**
  * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `input_audio_buffer.append`.
  * @param audio Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventInputAudioBufferAppend(
  eventId: Option[String],
  `type`: RealtimeClientEventInputAudioBufferAppend.Type.Value,
  audio: String
)

object RealtimeClientEventInputAudioBufferAppend {
  implicit lazy val realtimeClientEventInputAudioBufferAppendJsonFormat: Format[RealtimeClientEventInputAudioBufferAppend] = Json.format[RealtimeClientEventInputAudioBufferAppend]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudioBufferAppend = Value("input_audio_buffer.append")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

