goog.provide('API.Client.RunStepDetailsToolCallsCodeObject');

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @record
 */
API.Client.RunStepDetailsToolCallsCodeObject = function() {}

/**
 * The ID of the tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObject.prototype.id;

/**
 * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObject.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsToolCallsCodeObject_code_interpreter}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObject.prototype.codeInterpreter;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsCodeObject.TypeEnum = { 
  code_interpreter: 'code_interpreter',
}
