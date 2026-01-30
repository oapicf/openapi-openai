goog.provide('API.Client.CreateChatCompletionRequest_audio');

/**
 * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 * @record
 */
API.Client.CreateChatCompletionRequestAudio = function() {}

/**
 * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionRequestAudio.prototype.voice;

/**
 * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionRequestAudio.prototype.format;

/** @enum {string} */
API.Client.CreateChatCompletionRequestAudio.VoiceEnum = { 
  alloy: 'alloy',
  ash: 'ash',
  ballad: 'ballad',
  coral: 'coral',
  echo: 'echo',
  sage: 'sage',
  shimmer: 'shimmer',
  verse: 'verse',
}
/** @enum {string} */
API.Client.CreateChatCompletionRequestAudio.FormatEnum = { 
  wav: 'wav',
  mp3: 'mp3',
  flac: 'flac',
  opus: 'opus',
  pcm16: 'pcm16',
}
