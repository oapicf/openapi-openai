goog.provide('API.Client.AssistantToolsFileSearch');

/**
 * @record
 */
API.Client.AssistantToolsFileSearch = function() {}

/**
 * The type of tool being defined: `file_search`
 * @type {!string}
 * @export
 */
API.Client.AssistantToolsFileSearch.prototype.type;

/**
 * @type {!API.Client.AssistantToolsFileSearch_file_search}
 * @export
 */
API.Client.AssistantToolsFileSearch.prototype.fileSearch;

/** @enum {string} */
API.Client.AssistantToolsFileSearch.TypeEnum = { 
  file_search: 'file_search',
}
