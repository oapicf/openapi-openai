goog.provide('API.Client.RealtimeServerEventSessionCreated');

/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 * @record
 */
API.Client.RealtimeServerEventSessionCreated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventSessionCreated.prototype.eventId;

/**
 * The event type, must be `session.created`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventSessionCreated.prototype.type;

/**
 * @type {!API.Client.RealtimeSession}
 * @export
 */
API.Client.RealtimeServerEventSessionCreated.prototype.session;

/** @enum {string} */
API.Client.RealtimeServerEventSessionCreated.TypeEnum = { 
  session.created: 'session.created',
}
