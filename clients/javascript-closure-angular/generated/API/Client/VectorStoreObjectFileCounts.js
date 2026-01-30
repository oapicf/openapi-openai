goog.provide('API.Client.VectorStoreObject_file_counts');

/**
 * @record
 */
API.Client.VectorStoreObjectFileCounts = function() {}

/**
 * The number of files that are currently being processed.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObjectFileCounts.prototype.inProgress;

/**
 * The number of files that have been successfully processed.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObjectFileCounts.prototype.completed;

/**
 * The number of files that have failed to process.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObjectFileCounts.prototype.failed;

/**
 * The number of files that were cancelled.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObjectFileCounts.prototype.cancelled;

/**
 * The total number of files.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObjectFileCounts.prototype.total;

