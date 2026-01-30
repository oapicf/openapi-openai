goog.provide('API.Client.CreateChatCompletionStreamResponse_usage');

/**
 * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 * @record
 */
API.Client.CreateChatCompletionStreamResponseUsage = function() {}

/**
 * Number of tokens in the generated completion.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseUsage.prototype.completionTokens;

/**
 * Number of tokens in the prompt.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseUsage.prototype.promptTokens;

/**
 * Total number of tokens used in the request (prompt + completion).
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseUsage.prototype.totalTokens;

