goog.provide('API.Client.CreateModerationRequest_input_oneOf_inner_oneOf');

/**
 * An object describing an image to classify.
 * @record
 */
API.Client.CreateModerationRequestInputOneOfInnerOneOf = function() {}

/**
 * Always `image_url`.
 * @type {!string}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInnerOneOf.prototype.type;

/**
 * @type {!API.Client.CreateModerationRequest_input_oneOf_inner_oneOf_image_url}
 * @export
 */
API.Client.CreateModerationRequestInputOneOfInnerOneOf.prototype.imageUrl;

/** @enum {string} */
API.Client.CreateModerationRequestInputOneOfInnerOneOf.TypeEnum = { 
  image_url: 'image_url',
}
