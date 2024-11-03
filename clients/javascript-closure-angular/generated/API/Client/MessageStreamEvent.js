goog.provide('API.Client.MessageStreamEvent');

/**
 * @record
 */
API.Client.MessageStreamEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MessageStreamEvent.prototype.event;

/**
 * @type {!API.Client.MessageObject}
 * @export
 */
API.Client.MessageStreamEvent.prototype.data;

/** @enum {string} */
API.Client.MessageStreamEvent.EventEnum = { 
  thread.message.incomplete: 'thread.message.incomplete',
}
