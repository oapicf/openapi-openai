goog.provide('API.Client.RealtimeServerEventConversationCreated');

/**
 * Returned when a conversation is created. Emitted right after session creation. 
 * @record
 */
API.Client.RealtimeServerEventConversationCreated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationCreated.prototype.eventId;

/**
 * The event type, must be `conversation.created`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationCreated.prototype.type;

/**
 * @type {!API.Client.RealtimeServerEventConversationCreated_conversation}
 * @export
 */
API.Client.RealtimeServerEventConversationCreated.prototype.conversation;

/** @enum {string} */
API.Client.RealtimeServerEventConversationCreated.TypeEnum = { 
  conversation.created: 'conversation.created',
}
