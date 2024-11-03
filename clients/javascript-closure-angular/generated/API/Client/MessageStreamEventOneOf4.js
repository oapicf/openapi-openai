goog.provide('API.Client.MessageStreamEvent_oneOf_4');

/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 * @record
 */
API.Client.MessageStreamEventOneOf4 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MessageStreamEventOneOf4.prototype.event;

/**
 * @type {!API.Client.MessageObject}
 * @export
 */
API.Client.MessageStreamEventOneOf4.prototype.data;

/** @enum {string} */
API.Client.MessageStreamEventOneOf4.EventEnum = { 
  thread.message.incomplete: 'thread.message.incomplete',
}
