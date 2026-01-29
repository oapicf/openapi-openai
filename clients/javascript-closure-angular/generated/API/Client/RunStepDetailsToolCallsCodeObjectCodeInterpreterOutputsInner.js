goog.provide('API.Client.RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner');

/**
 * @record
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = function() {}

/**
 * Always `logs`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.type;

/**
 * The text output from the Code Interpreter tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.logs;

/**
 * @type {!API.Client.RunStepDetailsToolCallsCodeOutputImageObject_image}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.prototype.image;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum = { 
  logs: 'logs',
  image: 'image',
}
