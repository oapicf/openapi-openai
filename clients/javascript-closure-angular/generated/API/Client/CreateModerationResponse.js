goog.provide('API.Client.CreateModerationResponse');

/**
 * @record
 */
API.Client.CreateModerationResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateModerationResponse.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateModerationResponse.prototype.model;

/**
 * @type {!Array<!API.Client.CreateModerationResponse_results_inner>}
 * @export
 */
API.Client.CreateModerationResponse.prototype.results;

