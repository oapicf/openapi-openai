goog.provide('API.Client.CreateThreadAndRunRequest_tools_inner');

/**
 * @record
 */
API.Client.CreateThreadAndRunRequestToolsInner = function() {}

/**
 * The type of tool being defined: `code_interpreter`
 * @type {!string}
 * @export
 */
API.Client.CreateThreadAndRunRequestToolsInner.prototype.type;

/**
 * @type {!API.Client.AssistantToolsFileSearch_file_search}
 * @export
 */
API.Client.CreateThreadAndRunRequestToolsInner.prototype.fileSearch;

/**
 * @type {!API.Client.FunctionObject}
 * @export
 */
API.Client.CreateThreadAndRunRequestToolsInner.prototype.function;

/** @enum {string} */
API.Client.CreateThreadAndRunRequestToolsInner.TypeEnum = { 
  code_interpreter: 'code_interpreter',
  file_search: 'file_search',
  function: 'function',
}
