goog.provide('API.Client.VectorStoreFileBatchObject_file_counts');

/**
 * @record
 */
API.Client.VectorStoreFileBatchObjectFileCounts = function() {}

/**
 * The number of files that are currently being processed.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileBatchObjectFileCounts.prototype.inProgress;

/**
 * The number of files that have been processed.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileBatchObjectFileCounts.prototype.completed;

/**
 * The number of files that have failed to process.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileBatchObjectFileCounts.prototype.failed;

/**
 * The number of files that where cancelled.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileBatchObjectFileCounts.prototype.cancelled;

/**
 * The total number of files.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileBatchObjectFileCounts.prototype.total;

