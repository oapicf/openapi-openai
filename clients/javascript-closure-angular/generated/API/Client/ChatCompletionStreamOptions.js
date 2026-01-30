goog.provide('API.Client.ChatCompletionStreamOptions');

/**
 * Options for streaming response. Only set this when you set `stream: true`. 
 * @record
 */
API.Client.ChatCompletionStreamOptions = function() {}

/**
 * If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
 * @type {!boolean}
 * @export
 */
API.Client.ChatCompletionStreamOptions.prototype.includeUsage;

