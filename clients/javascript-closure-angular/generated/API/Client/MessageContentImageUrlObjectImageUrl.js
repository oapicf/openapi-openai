goog.provide('API.Client.MessageContentImageUrlObject_image_url');

/**
 * @record
 */
API.Client.MessageContentImageUrlObjectImageUrl = function() {}

/**
 * The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.MessageContentImageUrlObjectImageUrl.prototype.url;

/**
 * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
 * @type {!string}
 * @export
 */
API.Client.MessageContentImageUrlObjectImageUrl.prototype.detail;

/** @enum {string} */
API.Client.MessageContentImageUrlObjectImageUrl.DetailEnum = { 
  auto: 'auto',
  low: 'low',
  high: 'high',
}
