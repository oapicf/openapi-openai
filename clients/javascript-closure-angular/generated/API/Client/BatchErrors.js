goog.provide('API.Client.Batch_errors');

/**
 * @record
 */
API.Client.BatchErrors = function() {}

/**
 * The object type, which is always `list`.
 * @type {!string}
 * @export
 */
API.Client.BatchErrors.prototype.object;

/**
 * @type {!Array<!API.Client.Batch_errors_data_inner>}
 * @export
 */
API.Client.BatchErrors.prototype.data;

