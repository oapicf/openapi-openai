package org.openapitools.server.model


/**
 * Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
 *
 * @param eventId Optional client-generated ID used to identify this event. for example: ''null''
 * @param `type` The event type, must be `conversation.item.create`. for example: ''null''
 * @param previousItemId The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  for example: ''null''
 * @param item  for example: ''null''
*/
final case class RealtimeClientEventConversationItemCreate (
  eventId: Option[String] = None,
  `type`: String,
  previousItemId: Option[String] = None,
  item: RealtimeConversationItem
)

