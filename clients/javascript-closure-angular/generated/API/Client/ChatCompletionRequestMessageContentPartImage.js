goog.provide('API.Client.ChatCompletionRequestMessageContentPartImage');

/**
 * Learn about [image inputs](/docs/guides/vision). 
 * @record
 */
API.Client.ChatCompletionRequestMessageContentPartImage = function() {}

/**
 * The type of the content part.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartImage.prototype.type;

/**
 * @type {!API.Client.ChatCompletionRequestMessageContentPartImage_image_url}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartImage.prototype.imageUrl;

/** @enum {string} */
API.Client.ChatCompletionRequestMessageContentPartImage.TypeEnum = { 
  image_url: 'image_url',
}
