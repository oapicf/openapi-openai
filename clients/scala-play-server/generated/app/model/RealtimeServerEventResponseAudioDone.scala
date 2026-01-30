package model

import play.api.libs.json._

/**
  * Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.audio.done`.
  * @param responseId The ID of the response.
  * @param itemId The ID of the item.
  * @param outputIndex The index of the output item in the response.
  * @param contentIndex The index of the content part in the item's content array.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseAudioDone(
  eventId: String,
  `type`: RealtimeServerEventResponseAudioDone.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int
)

object RealtimeServerEventResponseAudioDone {
  implicit lazy val realtimeServerEventResponseAudioDoneJsonFormat: Format[RealtimeServerEventResponseAudioDone] = Json.format[RealtimeServerEventResponseAudioDone]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseAudioDone = Value("response.audio.done")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

