goog.provide('API.Client.ListRunsResponse');

/**
 * @record
 */
API.Client.ListRunsResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListRunsResponse.prototype.object;

/**
 * @type {!Array<!API.Client.RunObject>}
 * @export
 */
API.Client.ListRunsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListRunsResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListRunsResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListRunsResponse.prototype.hasMore;

