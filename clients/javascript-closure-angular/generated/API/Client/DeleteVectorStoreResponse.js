goog.provide('API.Client.DeleteVectorStoreResponse');

/**
 * @record
 */
API.Client.DeleteVectorStoreResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteVectorStoreResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteVectorStoreResponse.prototype.deleted;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteVectorStoreResponse.prototype.object;

/** @enum {string} */
API.Client.DeleteVectorStoreResponse.ObjectEnum = { 
  vector_store.deleted: 'vector_store.deleted',
}
