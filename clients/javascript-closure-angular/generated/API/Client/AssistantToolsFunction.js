goog.provide('API.Client.AssistantToolsFunction');

/**
 * @record
 */
API.Client.AssistantToolsFunction = function() {}

/**
 * The type of tool being defined: `function`
 * @type {!string}
 * @export
 */
API.Client.AssistantToolsFunction.prototype.type;

/**
 * @type {!API.Client.FunctionObject}
 * @export
 */
API.Client.AssistantToolsFunction.prototype.function;

/** @enum {string} */
API.Client.AssistantToolsFunction.TypeEnum = { 
  function: 'function',
}
