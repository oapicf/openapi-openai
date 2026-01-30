goog.provide('API.Client.RealtimeServerEventConversationCreated_conversation');

/**
 * The conversation resource.
 * @record
 */
API.Client.RealtimeServerEventConversationCreatedConversation = function() {}

/**
 * The unique ID of the conversation.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationCreatedConversation.prototype.id;

/**
 * The object type, must be `realtime.conversation`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationCreatedConversation.prototype.object;

