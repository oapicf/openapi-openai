goog.provide('API.Client.RealtimeServerEventConversationItemDeleted');

/**
 * Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 * @record
 */
API.Client.RealtimeServerEventConversationItemDeleted = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemDeleted.prototype.eventId;

/**
 * The event type, must be `conversation.item.deleted`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemDeleted.prototype.type;

/**
 * The ID of the item that was deleted.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemDeleted.prototype.itemId;

/** @enum {string} */
API.Client.RealtimeServerEventConversationItemDeleted.TypeEnum = { 
  conversation.item.deleted: 'conversation.item.deleted',
}
