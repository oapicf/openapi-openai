goog.provide('API.Client.StaticChunkingStrategyRequestParam');

/**
 * @record
 */
API.Client.StaticChunkingStrategyRequestParam = function() {}

/**
 * Always `static`.
 * @type {!string}
 * @export
 */
API.Client.StaticChunkingStrategyRequestParam.prototype.type;

/**
 * @type {!API.Client.StaticChunkingStrategy}
 * @export
 */
API.Client.StaticChunkingStrategyRequestParam.prototype._static;

/** @enum {string} */
API.Client.StaticChunkingStrategyRequestParam.TypeEnum = { 
  static: 'static',
}
