goog.provide('API.Client.RunStepObject_last_error');

/**
 * The last error associated with this run step. Will be `null` if there are no errors.
 * @record
 */
API.Client.RunStepObjectLastError = function() {}

/**
 * One of `server_error` or `rate_limit_exceeded`.
 * @type {!string}
 * @export
 */
API.Client.RunStepObjectLastError.prototype.code;

/**
 * A human-readable description of the error.
 * @type {!string}
 * @export
 */
API.Client.RunStepObjectLastError.prototype.message;

/** @enum {string} */
API.Client.RunStepObjectLastError.CodeEnum = { 
  server_error: 'server_error',
  rate_limit_exceeded: 'rate_limit_exceeded',
}
