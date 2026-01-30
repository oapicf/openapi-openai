goog.provide('API.Client.RealtimeServerEventInputAudioBufferCommitted');

/**
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 * @record
 */
API.Client.RealtimeServerEventInputAudioBufferCommitted = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferCommitted.prototype.eventId;

/**
 * The event type, must be `input_audio_buffer.committed`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferCommitted.prototype.type;

/**
 * The ID of the preceding item after which the new item will be inserted. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferCommitted.prototype.previousItemId;

/**
 * The ID of the user message item that will be created.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventInputAudioBufferCommitted.prototype.itemId;

/** @enum {string} */
API.Client.RealtimeServerEventInputAudioBufferCommitted.TypeEnum = { 
  input_audio_buffer.committed: 'input_audio_buffer.committed',
}
