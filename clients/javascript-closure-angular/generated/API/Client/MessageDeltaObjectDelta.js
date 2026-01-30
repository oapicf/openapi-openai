goog.provide('API.Client.MessageDeltaObject_delta');

/**
 * The delta containing the fields that have changed on the Message.
 * @record
 */
API.Client.MessageDeltaObjectDelta = function() {}

/**
 * The entity that produced the message. One of `user` or `assistant`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaObjectDelta.prototype.role;

/**
 * The content of the message in array of text and/or images.
 * @type {!Array<!API.Client.MessageDeltaObject_delta_content_inner>}
 * @export
 */
API.Client.MessageDeltaObjectDelta.prototype.content;

/** @enum {string} */
API.Client.MessageDeltaObjectDelta.RoleEnum = { 
  user: 'user',
  assistant: 'assistant',
}
