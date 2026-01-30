package model

import play.api.libs.json._

/**
  * Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `conversation.item.delete`.
  * @param itemId The ID of the item to delete.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventConversationItemDelete(
  eventId: Option[String],
  `type`: RealtimeClientEventConversationItemDelete.Type.Value,
  itemId: String
)

object RealtimeClientEventConversationItemDelete {
  implicit lazy val realtimeClientEventConversationItemDeleteJsonFormat: Format[RealtimeClientEventConversationItemDelete] = Json.format[RealtimeClientEventConversationItemDelete]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemDelete = Value("conversation.item.delete")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

