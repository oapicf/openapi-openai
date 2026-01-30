goog.provide('API.Client.RealtimeServerEventSessionUpdated');

/**
 * Returned when a session is updated with a `session.update` event, unless  there is an error. 
 * @record
 */
API.Client.RealtimeServerEventSessionUpdated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventSessionUpdated.prototype.eventId;

/**
 * The event type, must be `session.updated`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventSessionUpdated.prototype.type;

/**
 * @type {!API.Client.RealtimeSession}
 * @export
 */
API.Client.RealtimeServerEventSessionUpdated.prototype.session;

/** @enum {string} */
API.Client.RealtimeServerEventSessionUpdated.TypeEnum = { 
  session.updated: 'session.updated',
}
