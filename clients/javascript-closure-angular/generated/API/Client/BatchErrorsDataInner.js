goog.provide('API.Client.Batch_errors_data_inner');

/**
 * @record
 */
API.Client.BatchErrorsDataInner = function() {}

/**
 * An error code identifying the error type.
 * @type {!string}
 * @export
 */
API.Client.BatchErrorsDataInner.prototype.code;

/**
 * A human-readable message providing more details about the error.
 * @type {!string}
 * @export
 */
API.Client.BatchErrorsDataInner.prototype.message;

/**
 * The name of the parameter that caused the error, if applicable.
 * @type {!string}
 * @export
 */
API.Client.BatchErrorsDataInner.prototype.param;

/**
 * The line number of the input file where the error occurred, if applicable.
 * @type {!number}
 * @export
 */
API.Client.BatchErrorsDataInner.prototype.line;

