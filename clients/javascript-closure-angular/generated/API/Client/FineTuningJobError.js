goog.provide('API.Client.FineTuningJob_error');

/**
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 * @record
 */
API.Client.FineTuningJobError = function() {}

/**
 * A machine-readable error code.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobError.prototype.code;

/**
 * A human-readable error message.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobError.prototype.message;

/**
 * The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobError.prototype.param;

