goog.provide('API.Client.RealtimeServerEventResponseContentPartAdded_part');

/**
 * The content part that was added.
 * @record
 */
API.Client.RealtimeServerEventResponseContentPartAddedPart = function() {}

/**
 * The content type (\"text\", \"audio\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAddedPart.prototype.type;

/**
 * The text content (if type is \"text\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAddedPart.prototype.text;

/**
 * Base64-encoded audio data (if type is \"audio\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAddedPart.prototype.audio;

/**
 * The transcript of the audio (if type is \"audio\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartAddedPart.prototype.transcript;

/** @enum {string} */
API.Client.RealtimeServerEventResponseContentPartAddedPart.TypeEnum = { 
  audio: 'audio',
  text: 'text',
}
