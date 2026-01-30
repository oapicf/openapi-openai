goog.provide('API.Client.MessageDeltaObject_delta_content_inner');

/**
 * @record
 */
API.Client.MessageDeltaObjectDeltaContentInner = function() {}

/**
 * The index of the content part in the message.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaObjectDeltaContentInner.prototype.index;

/**
 * Always `image_file`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaObjectDeltaContentInner.prototype.type;

/**
 * @type {!API.Client.MessageDeltaContentImageFileObject_image_file}
 * @export
 */
API.Client.MessageDeltaObjectDeltaContentInner.prototype.imageFile;

/**
 * @type {!API.Client.MessageDeltaContentTextObject_text}
 * @export
 */
API.Client.MessageDeltaObjectDeltaContentInner.prototype.text;

/**
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaObjectDeltaContentInner.prototype.refusal;

/**
 * @type {!API.Client.MessageDeltaContentImageUrlObject_image_url}
 * @export
 */
API.Client.MessageDeltaObjectDeltaContentInner.prototype.imageUrl;

/** @enum {string} */
API.Client.MessageDeltaObjectDeltaContentInner.TypeEnum = { 
  image_file: 'image_file',
  text: 'text',
  refusal: 'refusal',
  image_url: 'image_url',
}
