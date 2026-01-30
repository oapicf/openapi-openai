goog.provide('API.Client.ResponseFormatText');

/**
 * @record
 */
API.Client.ResponseFormatText = function() {}

/**
 * The type of response format being defined: `text`
 * @type {!string}
 * @export
 */
API.Client.ResponseFormatText.prototype.type;

/** @enum {string} */
API.Client.ResponseFormatText.TypeEnum = { 
  text: 'text',
}
