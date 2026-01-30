goog.provide('API.Client.RealtimeServerEventResponseDone');

/**
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 * @record
 */
API.Client.RealtimeServerEventResponseDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseDone.prototype.eventId;

/**
 * The event type, must be `response.done`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseDone.prototype.type;

/**
 * @type {!API.Client.RealtimeResponse}
 * @export
 */
API.Client.RealtimeServerEventResponseDone.prototype.response;

/** @enum {string} */
API.Client.RealtimeServerEventResponseDone.TypeEnum = { 
  response.done: 'response.done',
}
