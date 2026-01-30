goog.provide('API.Client.CreateAssistantRequest_tool_resources_file_search_vector_stores_inner_chunking_strategy');

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @record
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy = function() {}

/**
 * Always `auto`.
 * @type {!string}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.prototype.type;

/**
 * @type {!API.Client.Static_Chunking_Strategy_static}
 * @export
 */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.prototype._static;

/** @enum {string} */
API.Client.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.TypeEnum = { 
  auto: 'auto',
  static: 'static',
}
