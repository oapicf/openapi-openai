goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsFunctionObject_function');

/**
 * The definition of the function that was called.
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction = function() {}

/**
 * The name of the function.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.prototype.name;

/**
 * The arguments passed to the function.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.prototype.arguments;

/**
 * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.prototype.output;

