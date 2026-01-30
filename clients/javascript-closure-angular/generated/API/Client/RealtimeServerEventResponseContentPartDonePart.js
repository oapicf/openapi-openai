goog.provide('API.Client.RealtimeServerEventResponseContentPartDone_part');

/**
 * The content part that is done.
 * @record
 */
API.Client.RealtimeServerEventResponseContentPartDonePart = function() {}

/**
 * The content type (\"text\", \"audio\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDonePart.prototype.type;

/**
 * The text content (if type is \"text\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDonePart.prototype.text;

/**
 * Base64-encoded audio data (if type is \"audio\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDonePart.prototype.audio;

/**
 * The transcript of the audio (if type is \"audio\").
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseContentPartDonePart.prototype.transcript;

/** @enum {string} */
API.Client.RealtimeServerEventResponseContentPartDonePart.TypeEnum = { 
  audio: 'audio',
  text: 'text',
}
