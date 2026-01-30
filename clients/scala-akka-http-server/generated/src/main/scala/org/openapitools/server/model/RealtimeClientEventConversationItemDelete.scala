package org.openapitools.server.model


/**
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 *
 * @param eventId Optional client-generated ID used to identify this event. for example: ''null''
 * @param `type` The event type, must be `conversation.item.delete`. for example: ''null''
 * @param itemId The ID of the item to delete. for example: ''null''
*/
final case class RealtimeClientEventConversationItemDelete (
  eventId: Option[String] = None,
  `type`: String,
  itemId: String
)

