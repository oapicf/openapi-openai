goog.provide('API.Client.ErrorEvent');

/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 * @record
 */
API.Client.ErrorEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ErrorEvent.prototype.event;

/**
 * @type {!API.Client.Error}
 * @export
 */
API.Client.ErrorEvent.prototype.data;

/** @enum {string} */
API.Client.ErrorEvent.EventEnum = { 
  error: 'error',
}
