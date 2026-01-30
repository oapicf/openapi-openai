goog.provide('API.Client.RealtimeServerEventResponseAudioDone');

/**
 * Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @record
 */
API.Client.RealtimeServerEventResponseAudioDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDone.prototype.eventId;

/**
 * The event type, must be `response.audio.done`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDone.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDone.prototype.responseId;

/**
 * The ID of the item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDone.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDone.prototype.outputIndex;

/**
 * The index of the content part in the item's content array.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseAudioDone.prototype.contentIndex;

/** @enum {string} */
API.Client.RealtimeServerEventResponseAudioDone.TypeEnum = { 
  response.audio.done: 'response.audio.done',
}
