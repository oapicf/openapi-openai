package model

import play.api.libs.json._

/**
  * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
  * @param eventId The unique ID of the server event.
  * @param `type` The event type, must be `conversation.item.created`.
  * @param previousItemId The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeServerEventConversationItemCreated(
  eventId: String,
  `type`: RealtimeServerEventConversationItemCreated.Type.Value,
  previousItemId: String,
  item: RealtimeConversationItem
)

object RealtimeServerEventConversationItemCreated {
  implicit lazy val realtimeServerEventConversationItemCreatedJsonFormat: Format[RealtimeServerEventConversationItemCreated] = Json.format[RealtimeServerEventConversationItemCreated]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ConversationItemCreated = Value("conversation.item.created")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

