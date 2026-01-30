package model

import play.api.libs.json._

/**
  * Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
  * @param eventId Optional client-generated ID used to identify this event.
  * @param `type` The event type, must be `conversation.item.create`.
  * @param previousItemId The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeClientEventConversationItemCreate(
  eventId: Option[String],
  `type`: RealtimeClientEventConversationItemCreate.Type.Value,
  previousItemId: Option[String],
  item: RealtimeConversationItem
)

object RealtimeClientEventConversationItemCreate {
  implicit lazy val realtimeClientEventConversationItemCreateJsonFormat: Format[RealtimeClientEventConversationItemCreate] = Json.format[RealtimeClientEventConversationItemCreate]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemCreate = Value("conversation.item.create")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

