goog.provide('API.Client.VectorStoreFileObject');

/**
 * A list of files attached to a vector store.
 * @record
 */
API.Client.VectorStoreFileObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.id;

/**
 * The object type, which is always `vector_store.file`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.object;

/**
 * The total vector store usage in bytes. Note that this may be different from the original file size.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.usageBytes;

/**
 * The Unix timestamp (in seconds) for when the vector store file was created.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.createdAt;

/**
 * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.vectorStoreId;

/**
 * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.status;

/**
 * @type {!API.Client.VectorStoreFileObject_last_error}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.lastError;

/**
 * @type {!API.Client.VectorStoreFileObject_chunking_strategy}
 * @export
 */
API.Client.VectorStoreFileObject.prototype.chunkingStrategy;

/** @enum {string} */
API.Client.VectorStoreFileObject.ObjectEnum = { 
  vector_store.file: 'vector_store.file',
}
/** @enum {string} */
API.Client.VectorStoreFileObject.StatusEnum = { 
  in_progress: 'in_progress',
  completed: 'completed',
  cancelled: 'cancelled',
  failed: 'failed',
}
