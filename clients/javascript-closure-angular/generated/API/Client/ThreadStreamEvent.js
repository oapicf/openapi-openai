goog.provide('API.Client.ThreadStreamEvent');

/**
 * @record
 */
API.Client.ThreadStreamEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ThreadStreamEvent.prototype.event;

/**
 * @type {!API.Client.ThreadObject}
 * @export
 */
API.Client.ThreadStreamEvent.prototype.data;

/** @enum {string} */
API.Client.ThreadStreamEvent.EventEnum = { 
  thread.created: 'thread.created',
}
