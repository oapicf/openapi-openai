goog.provide('API.Client.MessageFileObject');

/**
 * A list of files attached to a `message`.
 * @record
 */
API.Client.MessageFileObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.MessageFileObject.prototype.id;

/**
 * The object type, which is always `thread.message.file`.
 * @type {!string}
 * @export
 */
API.Client.MessageFileObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the message file was created.
 * @type {!number}
 * @export
 */
API.Client.MessageFileObject.prototype.createdAt;

/**
 * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
 * @type {!string}
 * @export
 */
API.Client.MessageFileObject.prototype.messageId;

/** @enum {string} */
API.Client.MessageFileObject.ObjectEnum = { 
  thread.message.file: 'thread.message.file',
}
