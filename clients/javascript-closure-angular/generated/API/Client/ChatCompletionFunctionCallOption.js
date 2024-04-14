goog.provide('API.Client.ChatCompletionFunctionCallOption');

/**
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 * @record
 */
API.Client.ChatCompletionFunctionCallOption = function() {}

/**
 * The name of the function to call.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionFunctionCallOption.prototype.name;

