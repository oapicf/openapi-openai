goog.provide('API.Client.ListBatchesResponse');

/**
 * @record
 */
API.Client.ListBatchesResponse = function() {}

/**
 * @type {!Array<!API.Client.Batch>}
 * @export
 */
API.Client.ListBatchesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListBatchesResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListBatchesResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListBatchesResponse.prototype.hasMore;

/**
 * @type {!string}
 * @export
 */
API.Client.ListBatchesResponse.prototype.object;

/** @enum {string} */
API.Client.ListBatchesResponse.ObjectEnum = { 
  list: 'list',
}
