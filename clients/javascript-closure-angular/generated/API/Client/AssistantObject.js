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
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
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
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.AssistantObject.prototype.tools;

/**
 * @type {!API.Client.AssistantObject_tool_resources}
 * @export
 */
API.Client.AssistantObject.prototype.toolResources;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AssistantObject.prototype.metadata;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @type {!number}
 * @export
 */
API.Client.AssistantObject.prototype.temperature;

/**
 * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
 * @type {!number}
 * @export
 */
API.Client.AssistantObject.prototype.topP;

/**
 * @type {!API.Client.AssistantsApiResponseFormatOption}
 * @export
 */
API.Client.AssistantObject.prototype.responseFormat;

/** @enum {string} */
API.Client.AssistantObject.ObjectEnum = { 
  assistant: 'assistant',
}
