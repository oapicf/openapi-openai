goog.provide('API.Client.MessageStreamEvent_oneOf_1');

/**
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 * @record
 */
API.Client.MessageStreamEventOneOf1 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MessageStreamEventOneOf1.prototype.event;

/**
 * @type {!API.Client.MessageObject}
 * @export
 */
API.Client.MessageStreamEventOneOf1.prototype.data;

/** @enum {string} */
API.Client.MessageStreamEventOneOf1.EventEnum = { 
  thread.message.in_progress: 'thread.message.in_progress',
}
