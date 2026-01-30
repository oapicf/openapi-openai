goog.provide('API.Client.CreateVectorStoreFileRequest');

/**
 * @record
 */
API.Client.CreateVectorStoreFileRequest = function() {}

/**
 * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
 * @type {!string}
 * @export
 */
API.Client.CreateVectorStoreFileRequest.prototype.fileId;

/**
 * @type {!API.Client.ChunkingStrategyRequestParam}
 * @export
 */
API.Client.CreateVectorStoreFileRequest.prototype.chunkingStrategy;

