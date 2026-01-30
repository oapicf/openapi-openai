goog.provide('API.Client.ChatCompletionRequestMessageContentPartAudio');

/**
 * Learn about [audio inputs](/docs/guides/audio). 
 * @record
 */
API.Client.ChatCompletionRequestMessageContentPartAudio = function() {}

/**
 * The type of the content part. Always `input_audio`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartAudio.prototype.type;

/**
 * @type {!API.Client.ChatCompletionRequestMessageContentPartAudio_input_audio}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartAudio.prototype.inputAudio;

/** @enum {string} */
API.Client.ChatCompletionRequestMessageContentPartAudio.TypeEnum = { 
  input_audio: 'input_audio',
}
