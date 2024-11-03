goog.provide('API.Client.RunStepDeltaObject_delta_step_details');

/**
 * The details of the run step.
 * @record
 */
API.Client.RunStepDeltaObjectDeltaStepDetails = function() {}

/**
 * Always `message_creation`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaObjectDeltaStepDetails.prototype.type;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsMessageCreationObject_message_creation}
 * @export
 */
API.Client.RunStepDeltaObjectDeltaStepDetails.prototype.messageCreation;

/**
 * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 * @type {!Array<!API.Client.RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>}
 * @export
 */
API.Client.RunStepDeltaObjectDeltaStepDetails.prototype.toolCalls;

/** @enum {string} */
API.Client.RunStepDeltaObjectDeltaStepDetails.TypeEnum = { 
  message_creation: 'message_creation',
  tool_calls: 'tool_calls',
}
