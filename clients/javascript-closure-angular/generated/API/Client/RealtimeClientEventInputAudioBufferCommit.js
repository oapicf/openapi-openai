goog.provide('API.Client.RealtimeClientEventInputAudioBufferCommit');

/**
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 * @record
 */
API.Client.RealtimeClientEventInputAudioBufferCommit = function() {}

/**
 * Optional client-generated ID used to identify this event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventInputAudioBufferCommit.prototype.eventId;

/**
 * The event type, must be `input_audio_buffer.commit`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventInputAudioBufferCommit.prototype.type;

/** @enum {string} */
API.Client.RealtimeClientEventInputAudioBufferCommit.TypeEnum = { 
  input_audio_buffer.commit: 'input_audio_buffer.commit',
}
