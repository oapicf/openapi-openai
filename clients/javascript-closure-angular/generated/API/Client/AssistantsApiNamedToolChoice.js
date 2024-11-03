goog.provide('API.Client.AssistantsApiNamedToolChoice');

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 * @record
 */
API.Client.AssistantsApiNamedToolChoice = function() {}

/**
 * The type of the tool. If type is `function`, the function name must be set
 * @type {!string}
 * @export
 */
API.Client.AssistantsApiNamedToolChoice.prototype.type;

/**
 * @type {!API.Client.ChatCompletionNamedToolChoice_function}
 * @export
 */
API.Client.AssistantsApiNamedToolChoice.prototype.function;

/** @enum {string} */
API.Client.AssistantsApiNamedToolChoice.TypeEnum = { 
  function: 'function',
  code_interpreter: 'code_interpreter',
  retrieval: 'retrieval',
}
