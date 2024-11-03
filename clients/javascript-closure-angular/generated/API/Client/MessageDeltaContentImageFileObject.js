goog.provide('API.Client.MessageDeltaContentImageFileObject');

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @record
 */
API.Client.MessageDeltaContentImageFileObject = function() {}

/**
 * The index of the content part in the message.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentImageFileObject.prototype.index;

/**
 * Always `image_file`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentImageFileObject.prototype.type;

/**
 * @type {!API.Client.MessageDeltaContentImageFileObject_image_file}
 * @export
 */
API.Client.MessageDeltaContentImageFileObject.prototype.imageFile;

/** @enum {string} */
API.Client.MessageDeltaContentImageFileObject.TypeEnum = { 
  image_file: 'image_file',
}
