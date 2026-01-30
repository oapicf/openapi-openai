goog.provide('API.Client.RealtimeServerEventResponseAudioTranscriptDone');

/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @record
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.eventId;

/**
 * The event type, must be `response.audio_transcript.done`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.contentIndex;

/**
 * The final transcript of the audio.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.prototype.transcript;

/** @enum {string} */
API.Client.RealtimeServerEventResponseAudioTranscriptDone.TypeEnum = { 
  response.audio_transcript.done: 'response.audio_transcript.done',
}
