goog.provide('API.Client.RealtimeServerEventResponseTextDone');

/**
 * Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @record
 */
API.Client.RealtimeServerEventResponseTextDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.eventId;

/**
 * The event type, must be `response.text.done`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.contentIndex;

/**
 * The final text content.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDone.prototype.text;

/** @enum {string} */
API.Client.RealtimeServerEventResponseTextDone.TypeEnum = { 
  response.text.done: 'response.text.done',
}
