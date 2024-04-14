goog.provide('API.Client.ChatCompletionRequestAssistantMessage_function_call');

/**
 * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
 * @record
 */
API.Client.ChatCompletionRequestAssistantMessageFunctionCall = function() {}

/**
 * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestAssistantMessageFunctionCall.prototype.arguments;

/**
 * The name of the function to call.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestAssistantMessageFunctionCall.prototype.name;

