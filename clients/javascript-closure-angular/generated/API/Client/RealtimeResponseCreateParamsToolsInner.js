goog.provide('API.Client.RealtimeResponseCreateParams_tools_inner');

/**
 * @record
 */
API.Client.RealtimeResponseCreateParamsToolsInner = function() {}

/**
 * The type of the tool, i.e. `function`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParamsToolsInner.prototype.type;

/**
 * The name of the function.
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParamsToolsInner.prototype.name;

/**
 * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseCreateParamsToolsInner.prototype.description;

/**
 * Parameters of the function in JSON Schema.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RealtimeResponseCreateParamsToolsInner.prototype.parameters;

/** @enum {string} */
API.Client.RealtimeResponseCreateParamsToolsInner.TypeEnum = { 
  function: 'function',
}
