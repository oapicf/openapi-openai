goog.provide('API.Client.CreateVectorStoreRequest_chunking_strategy');

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 * @record
 */
API.Client.CreateVectorStoreRequestChunkingStrategy = function() {}

/**
 * Always `auto`.
 * @type {!string}
 * @export
 */
API.Client.CreateVectorStoreRequestChunkingStrategy.prototype.type;

/**
 * @type {!API.Client.StaticChunkingStrategy}
 * @export
 */
API.Client.CreateVectorStoreRequestChunkingStrategy.prototype._static;

/** @enum {string} */
API.Client.CreateVectorStoreRequestChunkingStrategy.TypeEnum = { 
  auto: 'auto',
  static: 'static',
}
