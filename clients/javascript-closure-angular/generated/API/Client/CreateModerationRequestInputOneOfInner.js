goog.provide('API.Client.CreateModerationRequest_input_oneOf_inner');

/**
 * @record
 */
API.Client.CreateModerationRequestInputOneOfInner = function() {}

/**
 * Always `image_url`.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInner.prototype.type;

/**
 * @type {!API.Client.CreateModerationRequest_input_oneOf_inner_oneOf_image_url}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInner.prototype.imageUrl;

/**
 * A string of text to classify.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInner.prototype.text;

/** @enum {string} */
API.Client.CreateModerationRequestInputOneOfInner.TypeEnum = { 
  image_url: 'image_url',
  text: 'text',
}
