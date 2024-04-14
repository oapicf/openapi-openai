goog.provide('API.Client.CreateModerationResponse');

/**
 * Represents if a given text input is potentially harmful.
 * @record
 */
API.Client.CreateModerationResponse = function() {}

/**
 * The unique identifier for the moderation request.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationResponse.prototype.id;

/**
 * The model used to generate the moderation results.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationResponse.prototype.model;

/**
 * A list of moderation objects.
 * @type {!Array<!API.Client.CreateModerationResponse_results_inner>}
 * @export
 */
API.Client.CreateModerationResponse.prototype.results;

