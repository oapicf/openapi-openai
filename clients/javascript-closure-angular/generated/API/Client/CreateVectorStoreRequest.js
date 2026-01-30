goog.provide('API.Client.CreateVectorStoreRequest');

/**
 * @record
 */
API.Client.CreateVectorStoreRequest = function() {}

/**
 * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateVectorStoreRequest.prototype.fileIds;

/**
 * The name of the vector store.
 * @type {!string}
 * @export
 */
API.Client.CreateVectorStoreRequest.prototype.name;

/**
 * @type {!API.Client.VectorStoreExpirationAfter}
 * @export
 */
API.Client.CreateVectorStoreRequest.prototype.expiresAfter;

/**
 * @type {!API.Client.CreateVectorStoreRequest_chunking_strategy}
 * @export
 */
API.Client.CreateVectorStoreRequest.prototype.chunkingStrategy;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreateVectorStoreRequest.prototype.metadata;

