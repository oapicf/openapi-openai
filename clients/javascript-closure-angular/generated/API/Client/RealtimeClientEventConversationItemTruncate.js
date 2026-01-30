goog.provide('API.Client.RealtimeClientEventConversationItemTruncate');

/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
 * @record
 */
API.Client.RealtimeClientEventConversationItemTruncate = function() {}

/**
 * Optional client-generated ID used to identify this event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventConversationItemTruncate.prototype.eventId;

/**
 * The event type, must be `conversation.item.truncate`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventConversationItemTruncate.prototype.type;

/**
 * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventConversationItemTruncate.prototype.itemId;

/**
 * The index of the content part to truncate. Set this to 0.
 * @type {!number}
 * @export
 */
API.Client.RealtimeClientEventConversationItemTruncate.prototype.contentIndex;

/**
 * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeClientEventConversationItemTruncate.prototype.audioEndMs;

/** @enum {string} */
API.Client.RealtimeClientEventConversationItemTruncate.TypeEnum = { 
  conversation.item.truncate: 'conversation.item.truncate',
}
