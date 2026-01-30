goog.provide('API.Client.BatchRequestOutput');

/**
 * The per-line object of the batch output and error files
 * @record
 */
API.Client.BatchRequestOutput = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BatchRequestOutput.prototype.id;

/**
 * A developer-provided per-request id that will be used to match outputs to inputs.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestOutput.prototype.customId;

/**
 * @type {!API.Client.BatchRequestOutput_response}
 * @export
 */
API.Client.BatchRequestOutput.prototype.response;

/**
 * @type {!API.Client.BatchRequestOutput_error}
 * @export
 */
API.Client.BatchRequestOutput.prototype.error;

