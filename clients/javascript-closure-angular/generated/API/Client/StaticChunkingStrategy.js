goog.provide('API.Client.Static_Chunking_Strategy');

/**
 * @record
 */
API.Client.StaticChunkingStrategy = function() {}

/**
 * Always `static`.
 * @type {!string}
 * @export
 */
API.Client.StaticChunkingStrategy.prototype.type;

/**
 * @type {!API.Client.Static_Chunking_Strategy_static}
 * @export
 */
API.Client.StaticChunkingStrategy.prototype._static;

/** @enum {string} */
API.Client.StaticChunkingStrategy.TypeEnum = { 
  static: 'static',
}
