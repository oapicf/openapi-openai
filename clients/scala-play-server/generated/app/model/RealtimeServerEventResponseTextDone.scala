package model

import play.api.libs.json._

/**
  * Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.text.done`.
  * @param responseId The ID of the response.
  * @param itemId The ID of the item.
  * @param outputIndex The index of the output item in the response.
  * @param contentIndex The index of the content part in the item's content array.
  * @param text The final text content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseTextDone(
  eventId: String,
  `type`: RealtimeServerEventResponseTextDone.Type.Value,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  text: String
)

object RealtimeServerEventResponseTextDone {
  implicit lazy val realtimeServerEventResponseTextDoneJsonFormat: Format[RealtimeServerEventResponseTextDone] = Json.format[RealtimeServerEventResponseTextDone]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseTextDone = Value("response.text.done")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

