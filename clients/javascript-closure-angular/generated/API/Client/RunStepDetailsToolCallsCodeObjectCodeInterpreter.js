goog.provide('API.Client.RunStepDetailsToolCallsCodeObject_code_interpreter');

/**
 * The Code Interpreter tool call definition.
 * @record
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreter = function() {}

/**
 * The input to the Code Interpreter tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreter.prototype.input;

/**
 * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
 * @type {!Array<!API.Client.RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreter.prototype.outputs;

