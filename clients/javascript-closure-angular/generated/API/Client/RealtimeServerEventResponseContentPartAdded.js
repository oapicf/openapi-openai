goog.provide('API.Client.RealtimeServerEventResponseContentPartAdded');

/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 * @record
 */
API.Client.RealtimeServerEventResponseContentPartAdded = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.eventId;

/**
 * The event type, must be `response.content_part.added`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.responseId;

/**
 * The ID of the item to which the content part was added.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.contentIndex;

/**
 * @type {!API.Client.RealtimeServerEventResponseContentPartAdded_part}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAdded.prototype.part;

/** @enum {string} */
API.Client.RealtimeServerEventResponseContentPartAdded.TypeEnum = { 
  response.content_part.added: 'response.content_part.added',
}
