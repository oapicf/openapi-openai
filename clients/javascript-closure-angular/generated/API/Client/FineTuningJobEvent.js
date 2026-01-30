goog.provide('API.Client.FineTuningJobEvent');

/**
 * Fine-tuning job event object
 * @record
 */
API.Client.FineTuningJobEvent = function() {}

/**
 * The object type, which is always \"fine_tuning.job.event\".
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.object;

/**
 * The object identifier.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.id;

/**
 * The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.createdAt;

/**
 * The log level of the event.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.level;

/**
 * The message of the event.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.message;

/**
 * The type of event.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.type;

/**
 * The data associated with the event.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.FineTuningJobEvent.prototype.data;

/** @enum {string} */
API.Client.FineTuningJobEvent.ObjectEnum = { 
  fine_tuning.job.event: 'fine_tuning.job.event',
}
/** @enum {string} */
API.Client.FineTuningJobEvent.LevelEnum = { 
  info: 'info',
  warn: 'warn',
  error: 'error',
}
/** @enum {string} */
API.Client.FineTuningJobEvent.TypeEnum = { 
  message: 'message',
  metrics: 'metrics',
}
