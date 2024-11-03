goog.provide('API.Client.CreateAssistantRequest');

/**
 * @record
 */
API.Client.CreateAssistantRequest = function() {}

/**
 * @type {!API.Client.CreateAssistantRequest_model}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.model;

/**
 * The name of the assistant. The maximum length is 256 characters. 
 * @type {!string}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.name;

/**
 * The description of the assistant. The maximum length is 512 characters. 
 * @type {!string}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.description;

/**
 * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @type {!string}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.instructions;

/**
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.tools;

/**
 * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.fileIds;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreateAssistantRequest.prototype.metadata;

