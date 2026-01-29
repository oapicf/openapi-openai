goog.provide('API.Client.ListMessageFilesResponse');

/**
 * @record
 */
API.Client.ListMessageFilesResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListMessageFilesResponse.prototype.object;

/**
 * @type {!Array<!API.Client.MessageFileObject>}
 * @export
 */
API.Client.ListMessageFilesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListMessageFilesResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListMessageFilesResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListMessageFilesResponse.prototype.hasMore;

