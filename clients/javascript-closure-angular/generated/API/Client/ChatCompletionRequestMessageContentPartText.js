goog.provide('API.Client.ChatCompletionRequestMessageContentPartText');

/**
 * Learn about [text inputs](/docs/guides/text-generation). 
 * @record
 */
API.Client.ChatCompletionRequestMessageContentPartText = function() {}

/**
 * The type of the content part.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartText.prototype.type;

/**
 * The text content.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartText.prototype.text;

/** @enum {string} */
API.Client.ChatCompletionRequestMessageContentPartText.TypeEnum = { 
  text: 'text',
}
