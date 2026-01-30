goog.provide('API.Client.CreateAssistantRequest_tool_resources_file_search');

/**
 * @record
 */
API.Client.CreateAssistantRequestToolResourcesFileSearch = function() {}

/**
 * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearch.prototype.vectorStoreIds;

/**
 * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 * @type {!Array<!API.Client.CreateAssistantRequest_tool_resources_file_search_vector_stores_inner>}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearch.prototype.vectorStores;

