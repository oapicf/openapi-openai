goog.provide('API.Client.CreateThreadRequest_tool_resources_file_search');

/**
 * @record
 */
API.Client.CreateThreadRequestToolResourcesFileSearch = function() {}

/**
 * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateThreadRequestToolResourcesFileSearch.prototype.vectorStoreIds;

/**
 * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
 * @type {!Array<!API.Client.CreateThreadRequest_tool_resources_file_search_vector_stores_inner>}
 * @export
 */
API.Client.CreateThreadRequestToolResourcesFileSearch.prototype.vectorStores;

