goog.provide('API.Client.RealtimeServerEventResponseCreated');

/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 * @record
 */
API.Client.RealtimeServerEventResponseCreated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseCreated.prototype.eventId;

/**
 * The event type, must be `response.created`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseCreated.prototype.type;

/**
 * @type {!API.Client.RealtimeResponse}
 * @export
 */
API.Client.RealtimeServerEventResponseCreated.prototype.response;

/** @enum {string} */
API.Client.RealtimeServerEventResponseCreated.TypeEnum = { 
  response.created: 'response.created',
}
