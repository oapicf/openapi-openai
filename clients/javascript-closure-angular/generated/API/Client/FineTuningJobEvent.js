goog.provide('API.Client.FineTuningJobEvent');

/**
 * Fine-tuning job event object
 * @record
 */
API.Client.FineTuningJobEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.id;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.level;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.message;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.object;

/** @enum {string} */
API.Client.FineTuningJobEvent.LevelEnum = { 
  info: 'info',
  warn: 'warn',
  error: 'error',
}
/** @enum {string} */
API.Client.FineTuningJobEvent.ObjectEnum = { 
  fine_tuning.job.event: 'fine_tuning.job.event',
}
