goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsCodeObject');

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObject = function() {}

/**
 * The index of the tool call in the tool calls array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObject.prototype.index;

/**
 * The ID of the tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObject.prototype.id;

/**
 * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObject.prototype.type;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObject.prototype.codeInterpreter;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObject.TypeEnum = { 
  code_interpreter: 'code_interpreter',
}
