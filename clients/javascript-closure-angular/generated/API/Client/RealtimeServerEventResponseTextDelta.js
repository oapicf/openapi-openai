goog.provide('API.Client.RealtimeServerEventResponseTextDelta');

/**
 * Returned when the text value of a \"text\" content part is updated.
 * @record
 */
API.Client.RealtimeServerEventResponseTextDelta = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.eventId;

/**
 * The event type, must be `response.text.delta`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.contentIndex;

/**
 * The text delta.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseTextDelta.prototype.delta;

/** @enum {string} */
API.Client.RealtimeServerEventResponseTextDelta.TypeEnum = { 
  response.text.delta: 'response.text.delta',
}
