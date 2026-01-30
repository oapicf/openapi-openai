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
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.tools;

/**
 * @type {!API.Client.ModifyAssistantRequest_tool_resources}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.toolResources;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.metadata;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @type {!number}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.temperature;

/**
 * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
 * @type {!number}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.topP;

/**
 * @type {!API.Client.AssistantsApiResponseFormatOption}
 * @export
 */
API.Client.ModifyAssistantRequest.prototype.responseFormat;

