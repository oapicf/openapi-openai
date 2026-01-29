goog.provide('API.Client.MessageObject');

/**
 * Represents a message within a [thread](/docs/api-reference/threads).
 * @record
 */
API.Client.MessageObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.id;

/**
 * The object type, which is always `thread.message`.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the message was created.
 * @type {!number}
 * @export
 */
API.Client.MessageObject.prototype.createdAt;

/**
 * The [thread](/docs/api-reference/threads) ID that this message belongs to.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.threadId;

/**
 * The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.status;

/**
 * @type {!API.Client.MessageObject_incomplete_details}
 * @export
 */
API.Client.MessageObject.prototype.incompleteDetails;

/**
 * The Unix timestamp (in seconds) for when the message was completed.
 * @type {!number}
 * @export
 */
API.Client.MessageObject.prototype.completedAt;

/**
 * The Unix timestamp (in seconds) for when the message was marked as incomplete.
 * @type {!number}
 * @export
 */
API.Client.MessageObject.prototype.incompleteAt;

/**
 * The entity that produced the message. One of `user` or `assistant`.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.role;

/**
 * The content of the message in array of text and/or images.
 * @type {!Array<!API.Client.MessageObject_content_inner>}
 * @export
 */
API.Client.MessageObject.prototype.content;

/**
 * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.assistantId;

/**
 * The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
 * @type {!string}
 * @export
 */
API.Client.MessageObject.prototype.runId;

/**
 * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
 * @type {!Array<!string>}
 * @export
 */
API.Client.MessageObject.prototype.fileIds;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.MessageObject.prototype.metadata;

/** @enum {string} */
API.Client.MessageObject.ObjectEnum = { 
  thread.message: 'thread.message',
}
/** @enum {string} */
API.Client.MessageObject.StatusEnum = { 
  in_progress: 'in_progress',
  incomplete: 'incomplete',
  completed: 'completed',
}
/** @enum {string} */
API.Client.MessageObject.RoleEnum = { 
  user: 'user',
  assistant: 'assistant',
}
