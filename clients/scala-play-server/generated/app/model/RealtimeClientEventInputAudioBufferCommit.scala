package model

import play.api.libs.json._

/**
  * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `input_audio_buffer.commit`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventInputAudioBufferCommit(
  eventId: Option[String],
  `type`: RealtimeClientEventInputAudioBufferCommit.Type.Value
)

object RealtimeClientEventInputAudioBufferCommit {
  implicit lazy val realtimeClientEventInputAudioBufferCommitJsonFormat: Format[RealtimeClientEventInputAudioBufferCommit] = Json.format[RealtimeClientEventInputAudioBufferCommit]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudioBufferCommit = Value("input_audio_buffer.commit")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

