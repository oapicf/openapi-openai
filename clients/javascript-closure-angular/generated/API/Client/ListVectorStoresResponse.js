goog.provide('API.Client.ListVectorStoresResponse');

/**
 * @record
 */
API.Client.ListVectorStoresResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListVectorStoresResponse.prototype.object;

/**
 * @type {!Array<!API.Client.VectorStoreObject>}
 * @export
 */
API.Client.ListVectorStoresResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListVectorStoresResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListVectorStoresResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListVectorStoresResponse.prototype.hasMore;

