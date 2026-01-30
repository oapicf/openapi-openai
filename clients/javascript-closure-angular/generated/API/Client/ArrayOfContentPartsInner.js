goog.provide('API.Client.Array_of_content_parts_inner');

/**
 * @record
 */
API.Client.ArrayOfContentPartsInner = function() {}

/**
 * Always `image_file`.
 * @type {!string}
 * @export
 */
API.Client.ArrayOfContentPartsInner.prototype.type;

/**
 * @type {!API.Client.MessageContentImageFileObject_image_file}
 * @export
 */
API.Client.ArrayOfContentPartsInner.prototype.imageFile;

/**
 * @type {!API.Client.MessageContentImageUrlObject_image_url}
 * @export
 */
API.Client.ArrayOfContentPartsInner.prototype.imageUrl;

/**
 * Text content to be sent to the model
 * @type {!string}
 * @export
 */
API.Client.ArrayOfContentPartsInner.prototype.text;

/** @enum {string} */
API.Client.ArrayOfContentPartsInner.TypeEnum = { 
  image_file: 'image_file',
  image_url: 'image_url',
  text: 'text',
}
