goog.provide('API.Client.AssistantToolsFileSearchTypeOnly');

/**
 * @record
 */
API.Client.AssistantToolsFileSearchTypeOnly = function() {}

/**
 * The type of tool being defined: `file_search`
 * @type {!string}
 * @export
 */
API.Client.AssistantToolsFileSearchTypeOnly.prototype.type;

/** @enum {string} */
API.Client.AssistantToolsFileSearchTypeOnly.TypeEnum = { 
  file_search: 'file_search',
}
