goog.provide('API.Client.ResponseFormatJsonSchema');

/**
 * @record
 */
API.Client.ResponseFormatJsonSchema = function() {}

/**
 * The type of response format being defined: `json_schema`
 * @type {!string}
 * @export
 */
API.Client.ResponseFormatJsonSchema.prototype.type;

/**
 * @type {!API.Client.ResponseFormatJsonSchema_json_schema}
 * @export
 */
API.Client.ResponseFormatJsonSchema.prototype.jsonSchema;

/** @enum {string} */
API.Client.ResponseFormatJsonSchema.TypeEnum = { 
  json_schema: 'json_schema',
}
