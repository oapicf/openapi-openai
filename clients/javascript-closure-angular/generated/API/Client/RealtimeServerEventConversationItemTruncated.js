goog.provide('API.Client.RealtimeServerEventConversationItemTruncated');

/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 * @record
 */
API.Client.RealtimeServerEventConversationItemTruncated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemTruncated.prototype.eventId;

/**
 * The event type, must be `conversation.item.truncated`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemTruncated.prototype.type;

/**
 * The ID of the assistant message item that was truncated.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemTruncated.prototype.itemId;

/**
 * The index of the content part that was truncated.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventConversationItemTruncated.prototype.contentIndex;

/**
 * The duration up to which the audio was truncated, in milliseconds. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventConversationItemTruncated.prototype.audioEndMs;

/** @enum {string} */
API.Client.RealtimeServerEventConversationItemTruncated.TypeEnum = { 
  conversation.item.truncated: 'conversation.item.truncated',
}
