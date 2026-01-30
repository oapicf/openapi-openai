goog.provide('API.Client.Batch');

/**
 * @record
 */
API.Client.Batch = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.id;

/**
 * The object type, which is always `batch`.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.object;

/**
 * The OpenAI API endpoint used by the batch.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.endpoint;

/**
 * @type {!API.Client.Batch_errors}
 * @export
 */
API.Client.Batch.prototype.errors;

/**
 * The ID of the input file for the batch.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.inputFileId;

/**
 * The time frame within which the batch should be processed.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.completionWindow;

/**
 * The current status of the batch.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.status;

/**
 * The ID of the file containing the outputs of successfully executed requests.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.outputFileId;

/**
 * The ID of the file containing the outputs of requests with errors.
 * @type {!string}
 * @export
 */
API.Client.Batch.prototype.errorFileId;

/**
 * The Unix timestamp (in seconds) for when the batch was created.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.createdAt;

/**
 * The Unix timestamp (in seconds) for when the batch started processing.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.inProgressAt;

/**
 * The Unix timestamp (in seconds) for when the batch will expire.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.expiresAt;

/**
 * The Unix timestamp (in seconds) for when the batch started finalizing.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.finalizingAt;

/**
 * The Unix timestamp (in seconds) for when the batch was completed.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.completedAt;

/**
 * The Unix timestamp (in seconds) for when the batch failed.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.failedAt;

/**
 * The Unix timestamp (in seconds) for when the batch expired.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.expiredAt;

/**
 * The Unix timestamp (in seconds) for when the batch started cancelling.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.cancellingAt;

/**
 * The Unix timestamp (in seconds) for when the batch was cancelled.
 * @type {!number}
 * @export
 */
API.Client.Batch.prototype.cancelledAt;

/**
 * @type {!API.Client.Batch_request_counts}
 * @export
 */
API.Client.Batch.prototype.requestCounts;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Batch.prototype.metadata;

/** @enum {string} */
API.Client.Batch.ObjectEnum = { 
  batch: 'batch',
}
/** @enum {string} */
API.Client.Batch.StatusEnum = { 
  validating: 'validating',
  failed: 'failed',
  in_progress: 'in_progress',
  finalizing: 'finalizing',
  completed: 'completed',
  expired: 'expired',
  cancelling: 'cancelling',
  cancelled: 'cancelled',
}
