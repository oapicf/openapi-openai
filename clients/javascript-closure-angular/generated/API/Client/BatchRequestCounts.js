goog.provide('API.Client.Batch_request_counts');

/**
 * The request counts for different statuses within the batch.
 * @record
 */
API.Client.BatchRequestCounts = function() {}

/**
 * Total number of requests in the batch.
 * @type {!number}
 * @export
 */
API.Client.BatchRequestCounts.prototype.total;

/**
 * Number of requests that have been completed successfully.
 * @type {!number}
 * @export
 */
API.Client.BatchRequestCounts.prototype.completed;

/**
 * Number of requests that have failed.
 * @type {!number}
 * @export
 */
API.Client.BatchRequestCounts.prototype.failed;

