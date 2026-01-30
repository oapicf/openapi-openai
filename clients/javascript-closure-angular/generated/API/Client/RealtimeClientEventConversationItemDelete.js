goog.provide('API.Client.RealtimeClientEventConversationItemDelete');

/**
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 * @record
 */
API.Client.RealtimeClientEventConversationItemDelete = function() {}

/**
 * Optional client-generated ID used to identify this event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventConversationItemDelete.prototype.eventId;

/**
 * The event type, must be `conversation.item.delete`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventConversationItemDelete.prototype.type;

/**
 * The ID of the item to delete.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventConversationItemDelete.prototype.itemId;

/** @enum {string} */
API.Client.RealtimeClientEventConversationItemDelete.TypeEnum = { 
  conversation.item.delete: 'conversation.item.delete',
}
