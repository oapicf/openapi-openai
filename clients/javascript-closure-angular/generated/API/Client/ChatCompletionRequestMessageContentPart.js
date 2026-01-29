goog.provide('API.Client.ChatCompletionRequestMessageContentPart');

/**
 * @record
 */
API.Client.ChatCompletionRequestMessageContentPart = function() {}

/**
 * The type of the content part.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPart.prototype.type;

/**
 * The text content.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPart.prototype.text;

/**
 * @type {!API.Client.ChatCompletionRequestMessageContentPartImage_image_url}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPart.prototype.imageUrl;

/** @enum {string} */
API.Client.ChatCompletionRequestMessageContentPart.TypeEnum = { 
  text: 'text',
  image_url: 'image_url',
}
