goog.provide('API.Client.ChatCompletionRequestMessageContentPartImage_image_url');

/**
 * @record
 */
API.Client.ChatCompletionRequestMessageContentPartImageImageUrl = function() {}

/**
 * Either a URL of the image or the base64 encoded image data.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartImageImageUrl.prototype.url;

/**
 * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartImageImageUrl.prototype.detail;

/** @enum {string} */
API.Client.ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum = { 
  auto: 'auto',
  low: 'low',
  high: 'high',
}
