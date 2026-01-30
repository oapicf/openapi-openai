goog.provide('API.Client.CompletionUsage');

/**
 * Usage statistics for the completion request.
 * @record
 */
API.Client.CompletionUsage = function() {}

/**
 * Number of tokens in the generated completion.
 * @type {!number}
 * @export
 */
API.Client.CompletionUsage.prototype.completionTokens;

/**
 * Number of tokens in the prompt.
 * @type {!number}
 * @export
 */
API.Client.CompletionUsage.prototype.promptTokens;

/**
 * Total number of tokens used in the request (prompt + completion).
 * @type {!number}
 * @export
 */
API.Client.CompletionUsage.prototype.totalTokens;

/**
 * @type {!API.Client.CompletionUsage_completion_tokens_details}
 * @export
 */
API.Client.CompletionUsage.prototype.completionTokensDetails;

/**
 * @type {!API.Client.CompletionUsage_prompt_tokens_details}
 * @export
 */
API.Client.CompletionUsage.prototype.promptTokensDetails;

