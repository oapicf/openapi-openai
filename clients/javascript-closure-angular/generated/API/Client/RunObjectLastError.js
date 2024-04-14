goog.provide('API.Client.RunObject_last_error');

/**
 * The last error associated with this run. Will be `null` if there are no errors.
 * @record
 */
API.Client.RunObjectLastError = function() {}

/**
 * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
 * @type {!string}
 * @export
 */
API.Client.RunObjectLastError.prototype.code;

/**
 * A human-readable description of the error.
 * @type {!string}
 * @export
 */
API.Client.RunObjectLastError.prototype.message;

/** @enum {string} */
API.Client.RunObjectLastError.CodeEnum = { 
  server_error: 'server_error',
  rate_limit_exceeded: 'rate_limit_exceeded',
  invalid_prompt: 'invalid_prompt',
}
