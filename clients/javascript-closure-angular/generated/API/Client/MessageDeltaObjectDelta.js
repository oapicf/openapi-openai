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

/**
 * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
 * @type {!Array<!string>}
 * @export
 */
API.Client.MessageDeltaObjectDelta.prototype.fileIds;

/** @enum {string} */
API.Client.MessageDeltaObjectDelta.RoleEnum = { 
  user: 'user',
  assistant: 'assistant',
}
