goog.provide('API.Client.AssistantObject');

/**
 * Represents an `assistant` that can call the model and use tools.
 * @record
 */
API.Client.AssistantObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.AssistantObject.prototype.id;

/**
 * The object type, which is always `assistant`.
 * @type {!string}
 * @export
 */
API.Client.AssistantObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the assistant was created.
 * @type {!number}
 * @export
 */
API.Client.AssistantObject.prototype.createdAt;

/**
 * The name of the assistant. The maximum length is 256 characters. 
 * @type {!string}
 * @export
 */
API.Client.AssistantObject.prototype.name;

/**
 * The description of the assistant. The maximum length is 512 characters. 
 * @type {!string}
 * @export
 */
API.Client.AssistantObject.prototype.description;

/**
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 * @type {!string}
 * @export
 */
API.Client.AssistantObject.prototype.model;

/**
 * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @type {!string}
 * @export
 */
API.Client.AssistantObject.prototype.instructions;

/**
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.AssistantObject.prototype.tools;

/**
 * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.AssistantObject.prototype.fileIds;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AssistantObject.prototype.metadata;

/** @enum {string} */
API.Client.AssistantObject.ObjectEnum = { 
  assistant: 'assistant',
}
