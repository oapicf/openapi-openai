goog.provide('API.Client.RealtimeServerEventError_error');

/**
 * Details of the error.
 * @record
 */
API.Client.RealtimeServerEventErrorError = function() {}

/**
 * The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventErrorError.prototype.type;

/**
 * Error code, if any.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventErrorError.prototype.code;

/**
 * A human-readable error message.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventErrorError.prototype.message;

/**
 * Parameter related to the error, if any.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventErrorError.prototype.param;

/**
 * The event_id of the client event that caused the error, if applicable. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventErrorError.prototype.eventId;

