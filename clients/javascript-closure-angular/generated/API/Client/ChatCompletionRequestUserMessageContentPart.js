goog.provide('API.Client.ChatCompletionRequestUserMessageContentPart');

/**
 * @record
 */
API.Client.ChatCompletionRequestUserMessageContentPart = function() {}

/**
 * The type of the content part.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestUserMessageContentPart.prototype.type;

/**
 * The text content.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestUserMessageContentPart.prototype.text;

/**
 * @type {!API.Client.ChatCompletionRequestMessageContentPartImage_image_url}
 * @export
 */
API.Client.ChatCompletionRequestUserMessageContentPart.prototype.imageUrl;

/**
 * @type {!API.Client.ChatCompletionRequestMessageContentPartAudio_input_audio}
 * @export
 */
API.Client.ChatCompletionRequestUserMessageContentPart.prototype.inputAudio;

/** @enum {string} */
API.Client.ChatCompletionRequestUserMessageContentPart.TypeEnum = { 
  text: 'text',
  image_url: 'image_url',
  input_audio: 'input_audio',
}
