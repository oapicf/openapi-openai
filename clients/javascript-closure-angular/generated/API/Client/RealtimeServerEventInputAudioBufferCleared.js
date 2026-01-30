goog.provide('API.Client.RealtimeServerEventInputAudioBufferCleared');

/**
 * Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 * @record
 */
API.Client.RealtimeServerEventInputAudioBufferCleared = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferCleared.prototype.eventId;

/**
 * The event type, must be `input_audio_buffer.cleared`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferCleared.prototype.type;

/** @enum {string} */
API.Client.RealtimeServerEventInputAudioBufferCleared.TypeEnum = { 
  input_audio_buffer.cleared: 'input_audio_buffer.cleared',
}
