goog.provide('API.Client.MessageDeltaContentImageUrlObject_image_url');

/**
 * @record
 */
API.Client.MessageDeltaContentImageUrlObjectImageUrl = function() {}

/**
 * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentImageUrlObjectImageUrl.prototype.url;

/**
 * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentImageUrlObjectImageUrl.prototype.detail;

/** @enum {string} */
API.Client.MessageDeltaContentImageUrlObjectImageUrl.DetailEnum = { 
  auto: 'auto',
  low: 'low',
  high: 'high',
}
