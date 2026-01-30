goog.provide('API.Client.ChunkingStrategyRequestParam');

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @record
 */
API.Client.ChunkingStrategyRequestParam = function() {}

/**
 * Always `auto`.
 * @type {!string}
 * @export
 */
API.Client.ChunkingStrategyRequestParam.prototype.type;

/**
 * @type {!API.Client.StaticChunkingStrategy}
 * @export
 */
API.Client.ChunkingStrategyRequestParam.prototype._static;

/** @enum {string} */
API.Client.ChunkingStrategyRequestParam.TypeEnum = { 
  auto: 'auto',
  static: 'static',
}
