goog.provide('API.Client.RunStepDetailsToolCallsObject_tool_calls_inner');

/**
 * @record
 */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner = function() {}

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner.prototype.id;

/**
 * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsToolCallsCodeObject_code_interpreter}
 * @export
 */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner.prototype.codeInterpreter;

/**
 * @type {!API.Client.RunStepDetailsToolCallsFileSearchObject_file_search}
 * @export
 */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner.prototype.fileSearch;

/**
 * @type {!API.Client.RunStepDetailsToolCallsFunctionObject_function}
 * @export
 */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner.prototype.function;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsObjectToolCallsInner.TypeEnum = { 
  code_interpreter: 'code_interpreter',
  file_search: 'file_search',
  function: 'function',
}
