goog.provide('API.Client.AssistantsApiToolChoiceOption');

/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 * @record
 */
API.Client.AssistantsApiToolChoiceOption = function() {}

/**
 * The type of the tool. If type is `function`, the function name must be set
 * @type {!string}
 * @export
 */
API.Client.AssistantsApiToolChoiceOption.prototype.type;

/**
 * @type {!API.Client.AssistantsNamedToolChoice_function}
 * @export
 */
API.Client.AssistantsApiToolChoiceOption.prototype.function;

/** @enum {string} */
API.Client.AssistantsApiToolChoiceOption.TypeEnum = { 
  function: 'function',
  code_interpreter: 'code_interpreter',
  file_search: 'file_search',
}
