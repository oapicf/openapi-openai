goog.provide('API.Client.RealtimeServerEventResponseOutputItemDone');

/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 * @record
 */
API.Client.RealtimeServerEventResponseOutputItemDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemDone.prototype.eventId;

/**
 * The event type, must be `response.output_item.done`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemDone.prototype.type;

/**
 * The ID of the Response to which the item belongs.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemDone.prototype.responseId;

/**
 * The index of the output item in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemDone.prototype.outputIndex;

/**
 * @type {!API.Client.RealtimeConversationItem}
 * @export
 */
API.Client.RealtimeServerEventResponseOutputItemDone.prototype.item;

/** @enum {string} */
API.Client.RealtimeServerEventResponseOutputItemDone.TypeEnum = { 
  response.output_item.done: 'response.output_item.done',
}
