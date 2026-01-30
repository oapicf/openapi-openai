goog.provide('API.Client.MessageDeltaContentImageUrlObject');

/**
 * References an image URL in the content of a message.
 * @record
 */
API.Client.MessageDeltaContentImageUrlObject = function() {}

/**
 * The index of the content part in the message.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentImageUrlObject.prototype.index;

/**
 * Always `image_url`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentImageUrlObject.prototype.type;

/**
 * @type {!API.Client.MessageDeltaContentImageUrlObject_image_url}
 * @export
 */
API.Client.MessageDeltaContentImageUrlObject.prototype.imageUrl;

/** @enum {string} */
API.Client.MessageDeltaContentImageUrlObject.TypeEnum = { 
  image_url: 'image_url',
}
