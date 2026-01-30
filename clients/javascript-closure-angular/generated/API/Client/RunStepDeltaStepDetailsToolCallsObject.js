goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsObject');

/**
 * Details of the tool call.
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsObject = function() {}

/**
 * Always `tool_calls`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObject.prototype.type;

/**
 * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 * @type {!Array<!API.Client.RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsObject.prototype.toolCalls;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsObject.TypeEnum = { 
  tool_calls: 'tool_calls',
}
