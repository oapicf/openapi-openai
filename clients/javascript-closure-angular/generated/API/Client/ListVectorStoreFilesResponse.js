goog.provide('API.Client.ListVectorStoreFilesResponse');

/**
 * @record
 */
API.Client.ListVectorStoreFilesResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListVectorStoreFilesResponse.prototype.object;

/**
 * @type {!Array<!API.Client.VectorStoreFileObject>}
 * @export
 */
API.Client.ListVectorStoreFilesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListVectorStoreFilesResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListVectorStoreFilesResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListVectorStoreFilesResponse.prototype.hasMore;

