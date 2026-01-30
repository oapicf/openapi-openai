goog.provide('API.Client.MessageObject_content_inner');

/**
 * @record
 */
API.Client.MessageObjectContentInner = function() {}

/**
 * Always `image_file`.
 * @type {!string}
 * @export
 */
API.Client.MessageObjectContentInner.prototype.type;

/**
 * @type {!API.Client.MessageContentImageFileObject_image_file}
 * @export
 */
API.Client.MessageObjectContentInner.prototype.imageFile;

/**
 * @type {!API.Client.MessageContentImageUrlObject_image_url}
 * @export
 */
API.Client.MessageObjectContentInner.prototype.imageUrl;

/**
 * @type {!API.Client.MessageContentTextObject_text}
 * @export
 */
API.Client.MessageObjectContentInner.prototype.text;

/**
 * @type {!string}
 * @export
 */
API.Client.MessageObjectContentInner.prototype.refusal;

/** @enum {string} */
API.Client.MessageObjectContentInner.TypeEnum = { 
  image_file: 'image_file',
  image_url: 'image_url',
  text: 'text',
  refusal: 'refusal',
}
