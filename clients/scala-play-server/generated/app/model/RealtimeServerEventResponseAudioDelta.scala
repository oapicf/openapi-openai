package model

import play.api.libs.json._

/**
  * Returned when the model-generated audio is updated.
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.audio.delta`.
  * @param responseId The ID of the response.
  * @param itemId The ID of the item.
  * @param outputIndex The index of the output item in the response.
  * @param contentIndex The index of the content part in the item's content array.
  * @param delta Base64-encoded audio data delta.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseAudioDelta(
  eventId: String,
  `type`: RealtimeServerEventResponseAudioDelta.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  delta: String
)

object RealtimeServerEventResponseAudioDelta {
  implicit lazy val realtimeServerEventResponseAudioDeltaJsonFormat: Format[RealtimeServerEventResponseAudioDelta] = Json.format[RealtimeServerEventResponseAudioDelta]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseAudioDelta = Value("response.audio.delta")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

