goog.provide('API.Client.AssistantsNamedToolChoice');

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 * @record
 */
API.Client.AssistantsNamedToolChoice = function() {}

/**
 * The type of the tool. If type is `function`, the function name must be set
 * @type {!string}
 * @export
 */
API.Client.AssistantsNamedToolChoice.prototype.type;

/**
 * @type {!API.Client.AssistantsNamedToolChoice_function}
 * @export
 */
API.Client.AssistantsNamedToolChoice.prototype.function;

/** @enum {string} */
API.Client.AssistantsNamedToolChoice.TypeEnum = { 
  function: 'function',
  code_interpreter: 'code_interpreter',
  file_search: 'file_search',
}
