goog.provide('API.Client.VectorStoreObject');

/**
 * A vector store is a collection of processed files can be used by the `file_search` tool.
 * @record
 */
API.Client.VectorStoreObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreObject.prototype.id;

/**
 * The object type, which is always `vector_store`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the vector store was created.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObject.prototype.createdAt;

/**
 * The name of the vector store.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreObject.prototype.name;

/**
 * The total number of bytes used by the files in the vector store.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObject.prototype.usageBytes;

/**
 * @type {!API.Client.VectorStoreObject_file_counts}
 * @export
 */
API.Client.VectorStoreObject.prototype.fileCounts;

/**
 * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreObject.prototype.status;

/**
 * @type {!API.Client.VectorStoreExpirationAfter}
 * @export
 */
API.Client.VectorStoreObject.prototype.expiresAfter;

/**
 * The Unix timestamp (in seconds) for when the vector store will expire.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObject.prototype.expiresAt;

/**
 * The Unix timestamp (in seconds) for when the vector store was last active.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreObject.prototype.lastActiveAt;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.VectorStoreObject.prototype.metadata;

/** @enum {string} */
API.Client.VectorStoreObject.ObjectEnum = { 
  vector_store: 'vector_store',
}
/** @enum {string} */
API.Client.VectorStoreObject.StatusEnum = { 
  expired: 'expired',
  in_progress: 'in_progress',
  completed: 'completed',
}
