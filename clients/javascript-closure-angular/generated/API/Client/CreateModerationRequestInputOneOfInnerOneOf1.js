goog.provide('API.Client.CreateModerationRequest_input_oneOf_inner_oneOf_1');

/**
 * An object describing text to classify.
 * @record
 */
API.Client.CreateModerationRequestInputOneOfInnerOneOf1 = function() {}

/**
 * Always `text`.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInnerOneOf1.prototype.type;

/**
 * A string of text to classify.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInnerOneOf1.prototype.text;

/** @enum {string} */
API.Client.CreateModerationRequestInputOneOfInnerOneOf1.TypeEnum = { 
  text: 'text',
}
