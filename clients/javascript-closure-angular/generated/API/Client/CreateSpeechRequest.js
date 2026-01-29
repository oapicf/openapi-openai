goog.provide('API.Client.CreateSpeechRequest');

/**
 * @record
 */
API.Client.CreateSpeechRequest = function() {}

/**
 * @type {!API.Client.CreateSpeechRequest_model}
 * @export
 */
API.Client.CreateSpeechRequest.prototype.model;

/**
 * The text to generate audio for. The maximum length is 4096 characters.
 * @type {!string}
 * @export
 */
API.Client.CreateSpeechRequest.prototype.input;

/**
 * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
 * @type {!string}
 * @export
 */
API.Client.CreateSpeechRequest.prototype.voice;

/**
 * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
 * @type {!string}
 * @export
 */
API.Client.CreateSpeechRequest.prototype.responseFormat;

/**
 * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
 * @type {!number}
 * @export
 */
API.Client.CreateSpeechRequest.prototype.speed;

/** @enum {string} */
API.Client.CreateSpeechRequest.VoiceEnum = { 
  alloy: 'alloy',
  echo: 'echo',
  fable: 'fable',
  onyx: 'onyx',
  nova: 'nova',
  shimmer: 'shimmer',
}
/** @enum {string} */
API.Client.CreateSpeechRequest.ResponseFormatEnum = { 
  mp3: 'mp3',
  opus: 'opus',
  aac: 'aac',
  flac: 'flac',
  wav: 'wav',
  pcm: 'pcm',
}
