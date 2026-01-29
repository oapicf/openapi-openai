goog.provide('API.Client.MessageStreamEvent_oneOf_2');

/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 * @record
 */
API.Client.MessageStreamEventOneOf2 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.MessageStreamEventOneOf2.prototype.event;

/**
 * @type {!API.Client.MessageDeltaObject}
 * @export
 */
API.Client.MessageStreamEventOneOf2.prototype.data;

/** @enum {string} */
API.Client.MessageStreamEventOneOf2.EventEnum = { 
  thread.message.delta: 'thread.message.delta',
}
