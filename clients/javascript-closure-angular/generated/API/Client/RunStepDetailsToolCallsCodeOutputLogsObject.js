goog.provide('API.Client.RunStepDetailsToolCallsCodeOutputLogsObject');

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 * @record
 */
API.Client.RunStepDetailsToolCallsCodeOutputLogsObject = function() {}

/**
 * Always `logs`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeOutputLogsObject.prototype.type;

/**
 * The text output from the Code Interpreter tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeOutputLogsObject.prototype.logs;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum = { 
  logs: 'logs',
}
