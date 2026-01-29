goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter');

/**
 * The Code Interpreter tool call definition.
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = function() {}

/**
 * The input to the Code Interpreter tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.prototype.input;

/**
 * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
 * @type {!Array<!API.Client.RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.prototype.outputs;

