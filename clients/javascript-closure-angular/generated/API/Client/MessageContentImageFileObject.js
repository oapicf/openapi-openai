goog.provide('API.Client.MessageContentImageFileObject');

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @record
 */
API.Client.MessageContentImageFileObject = function() {}

/**
 * Always `image_file`.
 * @type {!string}
 * @export
 */
API.Client.MessageContentImageFileObject.prototype.type;

/**
 * @type {!API.Client.MessageContentImageFileObject_image_file}
 * @export
 */
API.Client.MessageContentImageFileObject.prototype.imageFile;

/** @enum {string} */
API.Client.MessageContentImageFileObject.TypeEnum = { 
  image_file: 'image_file',
}
