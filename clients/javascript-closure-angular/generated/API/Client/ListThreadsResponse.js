goog.provide('API.Client.ListThreadsResponse');

/**
 * @record
 */
API.Client.ListThreadsResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListThreadsResponse.prototype.object;

/**
 * @type {!Array<!API.Client.ThreadObject>}
 * @export
 */
API.Client.ListThreadsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListThreadsResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListThreadsResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListThreadsResponse.prototype.hasMore;

