goog.provide('API.Client.RealtimeServerEventError');

/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 * @record
 */
API.Client.RealtimeServerEventError = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventError.prototype.eventId;

/**
 * The event type, must be `error`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventError.prototype.type;

/**
 * @type {!API.Client.RealtimeServerEventError_error}
 * @export
 */
API.Client.RealtimeServerEventError.prototype.error;

/** @enum {string} */
API.Client.RealtimeServerEventError.TypeEnum = { 
  error: 'error',
}
