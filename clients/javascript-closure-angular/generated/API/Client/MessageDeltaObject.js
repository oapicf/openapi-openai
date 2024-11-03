goog.provide('API.Client.MessageDeltaObject');

/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 * @record
 */
API.Client.MessageDeltaObject = function() {}

/**
 * The identifier of the message, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaObject.prototype.id;

/**
 * The object type, which is always `thread.message.delta`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaObject.prototype.object;

/**
 * @type {!API.Client.MessageDeltaObject_delta}
 * @export
 */
API.Client.MessageDeltaObject.prototype.delta;

/** @enum {string} */
API.Client.MessageDeltaObject.ObjectEnum = { 
  thread.message.delta: 'thread.message.delta',
}
