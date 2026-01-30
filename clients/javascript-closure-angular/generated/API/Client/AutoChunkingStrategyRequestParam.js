goog.provide('API.Client.AutoChunkingStrategyRequestParam');

/**
 * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 * @record
 */
API.Client.AutoChunkingStrategyRequestParam = function() {}

/**
 * Always `auto`.
 * @type {!string}
 * @export
 */
API.Client.AutoChunkingStrategyRequestParam.prototype.type;

/** @enum {string} */
API.Client.AutoChunkingStrategyRequestParam.TypeEnum = { 
  auto: 'auto',
}
