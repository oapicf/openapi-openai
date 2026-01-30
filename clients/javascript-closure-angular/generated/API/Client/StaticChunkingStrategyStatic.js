goog.provide('API.Client.Static_Chunking_Strategy_static');

/**
 * @record
 */
API.Client.StaticChunkingStrategyStatic = function() {}

/**
 * The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
 * @type {!number}
 * @export
 */
API.Client.StaticChunkingStrategyStatic.prototype.maxChunkSizeTokens;

/**
 * The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
 * @type {!number}
 * @export
 */
API.Client.StaticChunkingStrategyStatic.prototype.chunkOverlapTokens;

