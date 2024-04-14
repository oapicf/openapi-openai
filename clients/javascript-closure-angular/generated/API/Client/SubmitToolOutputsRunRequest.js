goog.provide('API.Client.SubmitToolOutputsRunRequest');

/**
 * @record
 */
API.Client.SubmitToolOutputsRunRequest = function() {}

/**
 * A list of tools for which the outputs are being submitted.
 * @type {!Array<!API.Client.SubmitToolOutputsRunRequest_tool_outputs_inner>}
 * @export
 */
API.Client.SubmitToolOutputsRunRequest.prototype.toolOutputs;

/**
 * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @type {!boolean}
 * @export
 */
API.Client.SubmitToolOutputsRunRequest.prototype.stream;

