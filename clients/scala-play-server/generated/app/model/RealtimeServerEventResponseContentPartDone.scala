package model

import play.api.libs.json._

/**
  * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.content_part.done`.
  * @param responseId The ID of the response.
  * @param itemId The ID of the item.
  * @param outputIndex The index of the output item in the response.
  * @param contentIndex The index of the content part in the item's content array.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseContentPartDone(
  eventId: String,
  `type`: RealtimeServerEventResponseContentPartDone.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  part: RealtimeServerEventResponseContentPartDonePart
)

object RealtimeServerEventResponseContentPartDone {
  implicit lazy val realtimeServerEventResponseContentPartDoneJsonFormat: Format[RealtimeServerEventResponseContentPartDone] = Json.format[RealtimeServerEventResponseContentPartDone]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseContentPartDone = Value("response.content_part.done")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

