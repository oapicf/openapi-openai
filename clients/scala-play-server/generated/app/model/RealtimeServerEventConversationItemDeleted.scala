package model

import play.api.libs.json._

/**
  * Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `conversation.item.deleted`.
  * @param itemId The ID of the item that was deleted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventConversationItemDeleted(
  eventId: String,
  `type`: RealtimeServerEventConversationItemDeleted.Type.Value,
  itemId: String
)

object RealtimeServerEventConversationItemDeleted {
  implicit lazy val realtimeServerEventConversationItemDeletedJsonFormat: Format[RealtimeServerEventConversationItemDeleted] = Json.format[RealtimeServerEventConversationItemDeleted]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemDeleted = Value("conversation.item.deleted")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

