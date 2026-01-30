goog.provide('API.Client.ChatCompletionToolChoiceOption');

/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 
 * @record
 */
API.Client.ChatCompletionToolChoiceOption = function() {}

/**
 * The type of the tool. Currently, only `function` is supported.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionToolChoiceOption.prototype.type;

/**
 * @type {!API.Client.AssistantsNamedToolChoice_function}
 * @export
 */
API.Client.ChatCompletionToolChoiceOption.prototype.function;

/** @enum {string} */
API.Client.ChatCompletionToolChoiceOption.TypeEnum = { 
  function: 'function',
}
