goog.provide('API.Client.ListRunStepsResponse');

/**
 * @record
 */
API.Client.ListRunStepsResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListRunStepsResponse.prototype.object;

/**
 * @type {!Array<!API.Client.RunStepObject>}
 * @export
 */
API.Client.ListRunStepsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListRunStepsResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListRunStepsResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListRunStepsResponse.prototype.hasMore;

