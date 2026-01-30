goog.provide('API.Client.RealtimeClientEventInputAudioBufferClear');

/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 * @record
 */
API.Client.RealtimeClientEventInputAudioBufferClear = function() {}

/**
 * Optional client-generated ID used to identify this event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventInputAudioBufferClear.prototype.eventId;

/**
 * The event type, must be `input_audio_buffer.clear`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventInputAudioBufferClear.prototype.type;

/** @enum {string} */
API.Client.RealtimeClientEventInputAudioBufferClear.TypeEnum = { 
  input_audio_buffer.clear: 'input_audio_buffer.clear',
}
