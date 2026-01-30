goog.provide('API.Client.StaticChunkingStrategyResponseParam');

/**
 * @record
 */
API.Client.StaticChunkingStrategyResponseParam = function() {}

/**
 * Always `static`.
 * @type {!string}
 * @export
 */
API.Client.StaticChunkingStrategyResponseParam.prototype.type;

/**
 * @type {!API.Client.StaticChunkingStrategy}
 * @export
 */
API.Client.StaticChunkingStrategyResponseParam.prototype._static;

/** @enum {string} */
API.Client.StaticChunkingStrategyResponseParam.TypeEnum = { 
  static: 'static',
}
