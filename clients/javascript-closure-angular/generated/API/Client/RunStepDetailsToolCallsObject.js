goog.provide('API.Client.RunStepDetailsToolCallsObject');

/**
 * Details of the tool call.
 * @record
 */
API.Client.RunStepDetailsToolCallsObject = function() {}

/**
 * Always `tool_calls`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsObject.prototype.type;

/**
 * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 * @type {!Array<!API.Client.RunStepDetailsToolCallsObject_tool_calls_inner>}
 * @export
 */
API.Client.RunStepDetailsToolCallsObject.prototype.toolCalls;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsObject.TypeEnum = { 
  tool_calls: 'tool_calls',
}
