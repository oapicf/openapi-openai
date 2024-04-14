goog.provide('API.Client.AssistantToolsRetrieval');

/**
 * @record
 */
API.Client.AssistantToolsRetrieval = function() {}

/**
 * The type of tool being defined: `retrieval`
 * @type {!string}
 * @export
 */
API.Client.AssistantToolsRetrieval.prototype.type;

/** @enum {string} */
API.Client.AssistantToolsRetrieval.TypeEnum = { 
  retrieval: 'retrieval',
}
