package model

import play.api.libs.json._

/**
  * Returned when the model-generated transcription of audio output is updated. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.audio_transcript.delta`.
  * @param responseId The ID of the response.
  * @param itemId The ID of the item.
  * @param outputIndex The index of the output item in the response.
  * @param contentIndex The index of the content part in the item's content array.
  * @param delta The transcript delta.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseAudioTranscriptDelta(
  eventId: String,
  `type`: RealtimeServerEventResponseAudioTranscriptDelta.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  delta: String
)

object RealtimeServerEventResponseAudioTranscriptDelta {
  implicit lazy val realtimeServerEventResponseAudioTranscriptDeltaJsonFormat: Format[RealtimeServerEventResponseAudioTranscriptDelta] = Json.format[RealtimeServerEventResponseAudioTranscriptDelta]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseAudioTranscriptDelta = Value("response.audio_transcript.delta")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

