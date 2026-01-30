goog.provide('API.Client.CreateAssistantRequest_tool_resources_file_search_vector_stores_inner');

/**
 * @record
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner = function() {}

/**
 * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.prototype.fileIds;

/**
 * @type {!API.Client.CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.prototype.chunkingStrategy;

/**
 * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.prototype.metadata;

