goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject');

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = function() {}

/**
 * The index of the output in the outputs array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.prototype.index;

/**
 * Always `logs`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.prototype.type;

/**
 * The text output from the Code Interpreter tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.prototype.logs;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum = { 
  logs: 'logs',
}
