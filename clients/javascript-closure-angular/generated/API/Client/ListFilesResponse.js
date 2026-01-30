goog.provide('API.Client.ListFilesResponse');

/**
 * @record
 */
API.Client.ListFilesResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListFilesResponse.prototype.object;

/**
 * @type {!Array<!API.Client.OpenAIFile>}
 * @export
 */
API.Client.ListFilesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFilesResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFilesResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListFilesResponse.prototype.hasMore;

