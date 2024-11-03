goog.provide('API.Client.RunObject_required_action');

/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 * @record
 */
API.Client.RunObjectRequiredAction = function() {}

/**
 * For now, this is always `submit_tool_outputs`.
 * @type {!string}
 * @export
 */
API.Client.RunObjectRequiredAction.prototype.type;

/**
 * @type {!API.Client.RunObject_required_action_submit_tool_outputs}
 * @export
 */
API.Client.RunObjectRequiredAction.prototype.submitToolOutputs;

/** @enum {string} */
API.Client.RunObjectRequiredAction.TypeEnum = { 
  submit_tool_outputs: 'submit_tool_outputs',
}
