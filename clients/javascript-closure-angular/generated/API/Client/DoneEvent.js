goog.provide('API.Client.DoneEvent');

/**
 * Occurs when a stream ends.
 * @record
 */
API.Client.DoneEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DoneEvent.prototype.event;

/**
 * @type {!string}
 * @export
 */
API.Client.DoneEvent.prototype.data;

/** @enum {string} */
API.Client.DoneEvent.EventEnum = { 
  done: 'done',
}
/** @enum {string} */
API.Client.DoneEvent.DataEnum = { 
  [DONE]: '[DONE]',
}
