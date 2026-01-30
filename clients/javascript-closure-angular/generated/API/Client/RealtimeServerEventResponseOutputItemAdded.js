goog.provide('API.Client.RealtimeServerEventResponseOutputItemAdded');

/**
 * Returned when a new Item is created during Response generation.
 * @record
 */
API.Client.RealtimeServerEventResponseOutputItemAdded = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemAdded.prototype.eventId;

/**
 * The event type, must be `response.output_item.added`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemAdded.prototype.type;

/**
 * The ID of the Response to which the item belongs.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemAdded.prototype.responseId;

/**
 * The index of the output item in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemAdded.prototype.outputIndex;

/**
 * @type {!API.Client.RealtimeConversationItem}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemAdded.prototype.item;

/** @enum {string} */
API.Client.RealtimeServerEventResponseOutputItemAdded.TypeEnum = { 
  response.output_item.added: 'response.output_item.added',
}
