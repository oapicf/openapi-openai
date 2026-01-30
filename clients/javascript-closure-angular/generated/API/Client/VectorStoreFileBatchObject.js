goog.provide('API.Client.VectorStoreFileBatchObject');

/**
 * A batch of files attached to a vector store.
 * @record
 */
API.Client.VectorStoreFileBatchObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileBatchObject.prototype.id;

/**
 * The object type, which is always `vector_store.file_batch`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileBatchObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the vector store files batch was created.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreFileBatchObject.prototype.createdAt;

/**
 * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileBatchObject.prototype.vectorStoreId;

/**
 * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileBatchObject.prototype.status;

/**
 * @type {!API.Client.VectorStoreFileBatchObject_file_counts}
 * @export
 */
API.Client.VectorStoreFileBatchObject.prototype.fileCounts;

/** @enum {string} */
API.Client.VectorStoreFileBatchObject.ObjectEnum = { 
  vector_store.files_batch: 'vector_store.files_batch',
}
/** @enum {string} */
API.Client.VectorStoreFileBatchObject.StatusEnum = { 
  in_progress: 'in_progress',
  completed: 'completed',
  cancelled: 'cancelled',
  failed: 'failed',
}
