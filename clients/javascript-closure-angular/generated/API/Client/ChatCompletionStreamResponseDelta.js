goog.provide('API.Client.ChatCompletionStreamResponseDelta');

/**
 * A chat completion delta generated by streamed model responses.
 * @record
 */
API.Client.ChatCompletionStreamResponseDelta = function() {}

/**
 * The contents of the chunk message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.content;

/**
 * @type {!API.Client.ChatCompletionStreamResponseDelta_function_call}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.functionCall;

/**
 * @type {!Array<!API.Client.ChatCompletionMessageToolCallChunk>}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.toolCalls;

/**
 * The role of the author of this message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.role;

/** @enum {string} */
API.Client.ChatCompletionStreamResponseDelta.RoleEnum = { 
  system: 'system',
  user: 'user',
  assistant: 'assistant',
  tool: 'tool',
}