package org.openapitools.server.model


/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `conversation.item.created`. for example: ''null''
 * @param previousItemId The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  for example: ''null''
 * @param item  for example: ''null''
*/
final case class RealtimeServerEventConversationItemCreated (
  eventId: String,
  `type`: String,
  previousItemId: String,
  item: RealtimeConversationItem
)

