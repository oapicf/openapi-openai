goog.provide('API.Client.ResponseFormatJsonObject');

/**
 * @record
 */
API.Client.ResponseFormatJsonObject = function() {}

/**
 * The type of response format being defined: `json_object`
 * @type {!string}
 * @export
 */
API.Client.ResponseFormatJsonObject.prototype.type;

/** @enum {string} */
API.Client.ResponseFormatJsonObject.TypeEnum = { 
  json_object: 'json_object',
}
