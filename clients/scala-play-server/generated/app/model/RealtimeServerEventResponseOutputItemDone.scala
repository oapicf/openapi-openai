package model

import play.api.libs.json._

/**
  * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `response.output_item.done`.
  * @param responseId The ID of the Response to which the item belongs.
  * @param outputIndex The index of the output item in the Response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventResponseOutputItemDone(
  eventId: String,
  `type`: RealtimeServerEventResponseOutputItemDone.Type.Value,
  responseId: String,
  outputIndex: Int,
  item: RealtimeConversationItem
)

object RealtimeServerEventResponseOutputItemDone {
  implicit lazy val realtimeServerEventResponseOutputItemDoneJsonFormat: Format[RealtimeServerEventResponseOutputItemDone] = Json.format[RealtimeServerEventResponseOutputItemDone]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ResponseOutputItemDone = Value("response.output_item.done")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

