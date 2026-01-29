goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject');

/**
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject = function() {}

/**
 * The index of the tool call in the tool calls array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject.prototype.index;

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject.prototype.id;

/**
 * The type of tool call. This is always going to be `function` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject.prototype.type;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject_function}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject.prototype.function;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject.TypeEnum = { 
  function: 'function',
}
