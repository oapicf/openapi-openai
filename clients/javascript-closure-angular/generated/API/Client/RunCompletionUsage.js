goog.provide('API.Client.RunCompletionUsage');

/**
 * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 * @record
 */
API.Client.RunCompletionUsage = function() {}

/**
 * Number of completion tokens used over the course of the run.
 * @type {!number}
 * @export
 */
API.Client.RunCompletionUsage.prototype.completionTokens;

/**
 * Number of prompt tokens used over the course of the run.
 * @type {!number}
 * @export
 */
API.Client.RunCompletionUsage.prototype.promptTokens;

/**
 * Total number of tokens used (prompt + completion).
 * @type {!number}
 * @export
 */
API.Client.RunCompletionUsage.prototype.totalTokens;

