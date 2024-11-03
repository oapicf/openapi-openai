goog.provide('API.Client.RunObject_required_action_submit_tool_outputs');

/**
 * Details on the tool outputs needed for this run to continue.
 * @record
 */
API.Client.RunObjectRequiredActionSubmitToolOutputs = function() {}

/**
 * A list of the relevant tool calls.
 * @type {!Array<!API.Client.RunToolCallObject>}
 * @export
 */
API.Client.RunObjectRequiredActionSubmitToolOutputs.prototype.toolCalls;

