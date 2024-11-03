goog.provide('API.Client.MessageStreamEvent_oneOf');

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 * @record
 */
API.Client.MessageStreamEventOneOf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MessageStreamEventOneOf.prototype.event;

/**
 * @type {!API.Client.MessageObject}
 * @export
 */
API.Client.MessageStreamEventOneOf.prototype.data;

/** @enum {string} */
API.Client.MessageStreamEventOneOf.EventEnum = { 
  thread.message.created: 'thread.message.created',
}
