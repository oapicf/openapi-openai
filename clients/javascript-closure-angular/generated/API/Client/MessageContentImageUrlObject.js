goog.provide('API.Client.MessageContentImageUrlObject');

/**
 * References an image URL in the content of a message.
 * @record
 */
API.Client.MessageContentImageUrlObject = function() {}

/**
 * The type of the content part.
 * @type {!string}
 * @export
 */
API.Client.MessageContentImageUrlObject.prototype.type;

/**
 * @type {!API.Client.MessageContentImageUrlObject_image_url}
 * @export
 */
API.Client.MessageContentImageUrlObject.prototype.imageUrl;

/** @enum {string} */
API.Client.MessageContentImageUrlObject.TypeEnum = { 
  image_url: 'image_url',
}
