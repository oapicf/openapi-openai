goog.provide('API.Client.SubmitToolOutputsRunRequest_tool_outputs_inner');

/**
 * @record
 */
API.Client.SubmitToolOutputsRunRequestToolOutputsInner = function() {}

/**
 * The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
 * @type {!string}
 * @export
 */
API.Client.SubmitToolOutputsRunRequestToolOutputsInner.prototype.toolCallId;

/**
 * The output of the tool call to be submitted to continue the run.
 * @type {!string}
 * @export
 */
API.Client.SubmitToolOutputsRunRequestToolOutputsInner.prototype.output;

