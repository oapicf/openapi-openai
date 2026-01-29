goog.provide('API.Client.CreateEmbeddingResponse_usage');

/**
 * The usage information for the request.
 * @record
 */
API.Client.CreateEmbeddingResponseUsage = function() {}

/**
 * The number of tokens used by the prompt.
 * @type {!number}
 * @export
 */
API.Client.CreateEmbeddingResponseUsage.prototype.promptTokens;

/**
 * The total number of tokens used by the request.
 * @type {!number}
 * @export
 */
API.Client.CreateEmbeddingResponseUsage.prototype.totalTokens;

