goog.provide('API.Client.ChatCompletionFunctions');

/**
 * @record
 */
API.Client.ChatCompletionFunctions = function() {}

/**
 * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionFunctions.prototype.name;

/**
 * The description of what the function does.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionFunctions.prototype.description;

/**
 * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
 * @type {!Object<!string, API.Client.AnyType>}
 * @export
 */
API.Client.ChatCompletionFunctions.prototype.parameters;

