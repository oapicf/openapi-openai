goog.provide('API.Client.RunStepDetailsToolCallsFunctionObject');

/**
 * @record
 */
API.Client.RunStepDetailsToolCallsFunctionObject = function() {}

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFunctionObject.prototype.id;

/**
 * The type of tool call. This is always going to be `function` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFunctionObject.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsToolCallsFunctionObject_function}
 * @export
 */
API.Client.RunStepDetailsToolCallsFunctionObject.prototype.function;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsFunctionObject.TypeEnum = { 
  function: 'function',
}
