goog.provide('API.Client.RealtimeServerEventConversationItemCreated');

/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 * @record
 */
API.Client.RealtimeServerEventConversationItemCreated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemCreated.prototype.eventId;

/**
 * The event type, must be `conversation.item.created`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemCreated.prototype.type;

/**
 * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemCreated.prototype.previousItemId;

/**
 * @type {!API.Client.RealtimeConversationItem}
 * @export
 */
API.Client.RealtimeServerEventConversationItemCreated.prototype.item;

/** @enum {string} */
API.Client.RealtimeServerEventConversationItemCreated.TypeEnum = { 
  conversation.item.created: 'conversation.item.created',
}
