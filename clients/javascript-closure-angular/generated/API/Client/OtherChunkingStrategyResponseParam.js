goog.provide('API.Client.OtherChunkingStrategyResponseParam');

/**
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 * @record
 */
API.Client.OtherChunkingStrategyResponseParam = function() {}

/**
 * Always `other`.
 * @type {!string}
 * @export
 */
API.Client.OtherChunkingStrategyResponseParam.prototype.type;

/** @enum {string} */
API.Client.OtherChunkingStrategyResponseParam.TypeEnum = { 
  other: 'other',
}
