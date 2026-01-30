package org.openapitools.server.model


/**
 * Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `conversation.item.deleted`. for example: ''null''
 * @param itemId The ID of the item that was deleted. for example: ''null''
*/
final case class RealtimeServerEventConversationItemDeleted (
  eventId: String,
  `type`: String,
  itemId: String
)

