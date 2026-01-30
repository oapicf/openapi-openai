goog.provide('API.Client.CompletionUsage_prompt_tokens_details');

/**
 * Breakdown of tokens used in the prompt.
 * @record
 */
API.Client.CompletionUsagePromptTokensDetails = function() {}

/**
 * Audio input tokens present in the prompt.
 * @type {!number}
 * @export
 */
API.Client.CompletionUsagePromptTokensDetails.prototype.audioTokens;

/**
 * Cached tokens present in the prompt.
 * @type {!number}
 * @export
 */
API.Client.CompletionUsagePromptTokensDetails.prototype.cachedTokens;

