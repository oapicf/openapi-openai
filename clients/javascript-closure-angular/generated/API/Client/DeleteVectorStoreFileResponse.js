goog.provide('API.Client.DeleteVectorStoreFileResponse');

/**
 * @record
 */
API.Client.DeleteVectorStoreFileResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteVectorStoreFileResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteVectorStoreFileResponse.prototype.deleted;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteVectorStoreFileResponse.prototype.object;

/** @enum {string} */
API.Client.DeleteVectorStoreFileResponse.ObjectEnum = { 
  vector_store.file.deleted: 'vector_store.file.deleted',
}
