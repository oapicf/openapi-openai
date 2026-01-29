goog.provide('API.Client.RunStepObject_step_details');

/**
 * The details of the run step.
 * @record
 */
API.Client.RunStepObjectStepDetails = function() {}

/**
 * Always `message_creation`.
 * @type {!string}
 * @export
 */
API.Client.RunStepObjectStepDetails.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsMessageCreationObject_message_creation}
 * @export
 */
API.Client.RunStepObjectStepDetails.prototype.messageCreation;

/**
 * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 * @type {!Array<!API.Client.RunStepDetailsToolCallsObject_tool_calls_inner>}
 * @export
 */
API.Client.RunStepObjectStepDetails.prototype.toolCalls;

/** @enum {string} */
API.Client.RunStepObjectStepDetails.TypeEnum = { 
  message_creation: 'message_creation',
  tool_calls: 'tool_calls',
}
