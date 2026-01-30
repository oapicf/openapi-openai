goog.provide('API.Client.RealtimeServerEventResponseAudioDelta');

/**
 * Returned when the model-generated audio is updated.
 * @record
 */
API.Client.RealtimeServerEventResponseAudioDelta = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.eventId;

/**
 * The event type, must be `response.audio.delta`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.contentIndex;

/**
 * Base64-encoded audio data delta.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDelta.prototype.delta;

/** @enum {string} */
API.Client.RealtimeServerEventResponseAudioDelta.TypeEnum = { 
  response.audio.delta: 'response.audio.delta',
}
