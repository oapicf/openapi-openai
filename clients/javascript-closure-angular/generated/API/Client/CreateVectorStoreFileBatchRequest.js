goog.provide('API.Client.CreateVectorStoreFileBatchRequest');

/**
 * @record
 */
API.Client.CreateVectorStoreFileBatchRequest = function() {}

/**
 * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateVectorStoreFileBatchRequest.prototype.fileIds;

/**
 * @type {!API.Client.ChunkingStrategyRequestParam}
 * @export
 */
API.Client.CreateVectorStoreFileBatchRequest.prototype.chunkingStrategy;

