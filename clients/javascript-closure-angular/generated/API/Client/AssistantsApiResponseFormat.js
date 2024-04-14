goog.provide('API.Client.AssistantsApiResponseFormat');

/**
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 * @record
 */
API.Client.AssistantsApiResponseFormat = function() {}

/**
 * Must be one of `text` or `json_object`.
 * @type {!string}
 * @export
 */
API.Client.AssistantsApiResponseFormat.prototype.type;

/** @enum {string} */
API.Client.AssistantsApiResponseFormat.TypeEnum = { 
  text: 'text',
  json_object: 'json_object',
}
