goog.provide('API.Client.RealtimeServerEventResponseAudioTranscriptDelta');

/**
 * Returned when the model-generated transcription of audio output is updated. 
 * @record
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.eventId;

/**
 * The event type, must be `response.audio_transcript.delta`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.contentIndex;

/**
 * The transcript delta.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.prototype.delta;

/** @enum {string} */
API.Client.RealtimeServerEventResponseAudioTranscriptDelta.TypeEnum = { 
  response.audio_transcript.delta: 'response.audio_transcript.delta',
}
