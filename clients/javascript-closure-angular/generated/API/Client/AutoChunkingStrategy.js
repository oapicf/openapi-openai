goog.provide('API.Client.Auto_Chunking_Strategy');

/**
 * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 * @record
 */
API.Client.AutoChunkingStrategy = function() {}

/**
 * Always `auto`.
 * @type {!string}
 * @export
 */
API.Client.AutoChunkingStrategy.prototype.type;

/** @enum {string} */
API.Client.AutoChunkingStrategy.TypeEnum = { 
  auto: 'auto',
}
