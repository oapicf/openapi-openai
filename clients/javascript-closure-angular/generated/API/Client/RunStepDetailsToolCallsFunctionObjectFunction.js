goog.provide('API.Client.RunStepDetailsToolCallsFunctionObject_function');

/**
 * The definition of the function that was called.
 * @record
 */
API.Client.RunStepDetailsToolCallsFunctionObjectFunction = function() {}

/**
 * The name of the function.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFunctionObjectFunction.prototype.name;

/**
 * The arguments passed to the function.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFunctionObjectFunction.prototype.arguments;

/**
 * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFunctionObjectFunction.prototype.output;

