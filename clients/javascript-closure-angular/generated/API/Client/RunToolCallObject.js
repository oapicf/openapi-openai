goog.provide('API.Client.RunToolCallObject');

/**
 * Tool call objects
 * @record
 */
API.Client.RunToolCallObject = function() {}

/**
 * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
 * @type {!string}
 * @export
 */
API.Client.RunToolCallObject.prototype.id;

/**
 * The type of tool call the output is required for. For now, this is always `function`.
 * @type {!string}
 * @export
 */
API.Client.RunToolCallObject.prototype.type;

/**
 * @type {!API.Client.RunToolCallObject_function}
 * @export
 */
API.Client.RunToolCallObject.prototype.function;

/** @enum {string} */
API.Client.RunToolCallObject.TypeEnum = { 
  function: 'function',
}
