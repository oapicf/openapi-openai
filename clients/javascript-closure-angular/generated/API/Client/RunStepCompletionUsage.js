goog.provide('API.Client.RunStepCompletionUsage');

/**
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 * @record
 */
API.Client.RunStepCompletionUsage = function() {}

/**
 * Number of completion tokens used over the course of the run step.
 * @type {!number}
 * @export
 */
API.Client.RunStepCompletionUsage.prototype.completionTokens;

/**
 * Number of prompt tokens used over the course of the run step.
 * @type {!number}
 * @export
 */
API.Client.RunStepCompletionUsage.prototype.promptTokens;

/**
 * Total number of tokens used (prompt + completion).
 * @type {!number}
 * @export
 */
API.Client.RunStepCompletionUsage.prototype.totalTokens;

