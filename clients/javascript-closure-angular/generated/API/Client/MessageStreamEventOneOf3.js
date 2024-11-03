goog.provide('API.Client.MessageStreamEvent_oneOf_3');

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 * @record
 */
API.Client.MessageStreamEventOneOf3 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MessageStreamEventOneOf3.prototype.event;

/**
 * @type {!API.Client.MessageObject}
 * @export
 */
API.Client.MessageStreamEventOneOf3.prototype.data;

/** @enum {string} */
API.Client.MessageStreamEventOneOf3.EventEnum = { 
  thread.message.completed: 'thread.message.completed',
}
