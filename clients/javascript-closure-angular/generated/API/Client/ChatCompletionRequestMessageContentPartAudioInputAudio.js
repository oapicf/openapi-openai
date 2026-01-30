goog.provide('API.Client.ChatCompletionRequestMessageContentPartAudio_input_audio');

/**
 * @record
 */
API.Client.ChatCompletionRequestMessageContentPartAudioInputAudio = function() {}

/**
 * Base64 encoded audio data.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartAudioInputAudio.prototype.data;

/**
 * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessageContentPartAudioInputAudio.prototype.format;

/** @enum {string} */
API.Client.ChatCompletionRequestMessageContentPartAudioInputAudio.FormatEnum = { 
  wav: 'wav',
  mp3: 'mp3',
}
