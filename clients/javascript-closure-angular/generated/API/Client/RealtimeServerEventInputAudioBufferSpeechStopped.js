goog.provide('API.Client.RealtimeServerEventInputAudioBufferSpeechStopped');

/**
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 * @record
 */
API.Client.RealtimeServerEventInputAudioBufferSpeechStopped = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferSpeechStopped.prototype.eventId;

/**
 * The event type, must be `input_audio_buffer.speech_stopped`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferSpeechStopped.prototype.type;

/**
 * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferSpeechStopped.prototype.audioEndMs;

/**
 * The ID of the user message item that will be created.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferSpeechStopped.prototype.itemId;

/** @enum {string} */
API.Client.RealtimeServerEventInputAudioBufferSpeechStopped.TypeEnum = { 
  input_audio_buffer.speech_stopped: 'input_audio_buffer.speech_stopped',
}
