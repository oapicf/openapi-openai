goog.provide('API.Client.BatchRequestOutput_error');

/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 * @record
 */
API.Client.BatchRequestOutputError = function() {}

/**
 * A machine-readable error code.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestOutputError.prototype.code;

/**
 * A human-readable error message.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestOutputError.prototype.message;

