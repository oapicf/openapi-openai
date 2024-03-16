goog.provide('API.Client.CreateCompletionResponse_usage');

/**
 * @record
 */
API.Client.CreateCompletionResponseUsage = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CreateCompletionResponseUsage.prototype.promptTokens;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateCompletionResponseUsage.prototype.completionTokens;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateCompletionResponseUsage.prototype.totalTokens;

