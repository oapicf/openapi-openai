goog.provide('API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed');

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 * @record
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed.prototype.eventId;

/**
 * The event type, must be `conversation.item.input_audio_transcription.failed`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed.prototype.type;

/**
 * The ID of the user message item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed.prototype.itemId;

/**
 * The index of the content part containing the audio.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed.prototype.contentIndex;

/**
 * @type {!API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed.prototype.error;

/** @enum {string} */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionFailed.TypeEnum = { 
  conversation.item.input_audio_transcription.failed: 'conversation.item.input_audio_transcription.failed',
}
