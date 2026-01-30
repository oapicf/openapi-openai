goog.provide('API.Client.AssistantObject_tools_inner');

/**
 * @record
 */
API.Client.AssistantObjectToolsInner = function() {}

/**
 * The type of tool being defined: `code_interpreter`
 * @type {!string}
 * @export
 */
API.Client.AssistantObjectToolsInner.prototype.type;

/**
 * @type {!API.Client.AssistantToolsFileSearch_file_search}
 * @export
 */
API.Client.AssistantObjectToolsInner.prototype.fileSearch;

/**
 * @type {!API.Client.FunctionObject}
 * @export
 */
API.Client.AssistantObjectToolsInner.prototype.function;

/** @enum {string} */
API.Client.AssistantObjectToolsInner.TypeEnum = { 
  code_interpreter: 'code_interpreter',
  file_search: 'file_search',
  function: 'function',
}
