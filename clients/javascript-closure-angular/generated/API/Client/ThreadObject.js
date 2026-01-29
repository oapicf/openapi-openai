goog.provide('API.Client.ThreadObject');

/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 * @record
 */
API.Client.ThreadObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.ThreadObject.prototype.id;

/**
 * The object type, which is always `thread`.
 * @type {!string}
 * @export
 */
API.Client.ThreadObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the thread was created.
 * @type {!number}
 * @export
 */
API.Client.ThreadObject.prototype.createdAt;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ThreadObject.prototype.metadata;

/** @enum {string} */
API.Client.ThreadObject.ObjectEnum = { 
  thread: 'thread',
}
