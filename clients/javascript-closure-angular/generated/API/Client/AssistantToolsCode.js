goog.provide('API.Client.AssistantToolsCode');

/**
 * @record
 */
API.Client.AssistantToolsCode = function() {}

/**
 * The type of tool being defined: `code_interpreter`
 * @type {!string}
 * @export
 */
API.Client.AssistantToolsCode.prototype.type;

/** @enum {string} */
API.Client.AssistantToolsCode.TypeEnum = { 
  code_interpreter: 'code_interpreter',
}
