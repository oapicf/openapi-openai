goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner');

/**
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = function() {}

/**
 * The index of the output in the outputs array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.index;

/**
 * Always `logs`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.type;

/**
 * The text output from the Code Interpreter tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.logs;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.image;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum = { 
  logs: 'logs',
  image: 'image',
}
