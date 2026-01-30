goog.provide('API.Client.VectorStoreFileObject_chunking_strategy');

/**
 * The strategy used to chunk the file.
 * @record
 */
API.Client.VectorStoreFileObjectChunkingStrategy = function() {}

/**
 * Always `static`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObjectChunkingStrategy.prototype.type;

/**
 * @type {!API.Client.StaticChunkingStrategy}
 * @export
 */
API.Client.VectorStoreFileObjectChunkingStrategy.prototype._static;

/** @enum {string} */
API.Client.VectorStoreFileObjectChunkingStrategy.TypeEnum = { 
  static: 'static',
  other: 'other',
}
