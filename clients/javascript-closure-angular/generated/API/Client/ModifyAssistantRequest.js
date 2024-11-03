goog.provide('API.Client.ModifyAssistantRequest');

/**
 * @record
 */
API.Client.ModifyAssistantRequest = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.model;

/**
 * The name of the assistant. The maximum length is 256 characters. 
 * @type {!string}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.name;

/**
 * The description of the assistant. The maximum length is 512 characters. 
 * @type {!string}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.description;

/**
 * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @type {!string}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.instructions;

/**
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.tools;

/**
 * A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.fileIds;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.metadata;

