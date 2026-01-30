goog.provide('API.Client.RealtimeServerEventResponseContentPartDone');

/**
 * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @record
 */
API.Client.RealtimeServerEventResponseContentPartDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.eventId;

/**
 * The event type, must be `response.content_part.done`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.contentIndex;

/**
 * @type {!API.Client.RealtimeServerEventResponseContentPartDone_part}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDone.prototype.part;

/** @enum {string} */
API.Client.RealtimeServerEventResponseContentPartDone.TypeEnum = { 
  response.content_part.done: 'response.content_part.done',
}
