goog.provide('API.Client.AssistantFileObject');

/**
 * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 * @record
 */
API.Client.AssistantFileObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.AssistantFileObject.prototype.id;

/**
 * The object type, which is always `assistant.file`.
 * @type {!string}
 * @export
 */
API.Client.AssistantFileObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the assistant file was created.
 * @type {!number}
 * @export
 */
API.Client.AssistantFileObject.prototype.createdAt;

/**
 * The assistant ID that the file is attached to.
 * @type {!string}
 * @export
 */
API.Client.AssistantFileObject.prototype.assistantId;

/** @enum {string} */
API.Client.AssistantFileObject.ObjectEnum = { 
  assistant.file: 'assistant.file',
}
