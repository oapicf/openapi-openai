goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner');

/**
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner = function() {}

/**
 * The index of the tool call in the tool calls array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype.index;

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype.id;

/**
 * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype.type;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype.codeInterpreter;

/**
 * For now, this is always going to be an empty object.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype.retrieval;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject_function}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype.function;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.TypeEnum = { 
  code_interpreter: 'code_interpreter',
  retrieval: 'retrieval',
  function: 'function',
}
