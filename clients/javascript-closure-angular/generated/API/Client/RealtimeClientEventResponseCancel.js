goog.provide('API.Client.RealtimeClientEventResponseCancel');

/**
 * Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 * @record
 */
API.Client.RealtimeClientEventResponseCancel = function() {}

/**
 * Optional client-generated ID used to identify this event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventResponseCancel.prototype.eventId;

/**
 * The event type, must be `response.cancel`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventResponseCancel.prototype.type;

/**
 * A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventResponseCancel.prototype.responseId;

/** @enum {string} */
API.Client.RealtimeClientEventResponseCancel.TypeEnum = { 
  response.cancel: 'response.cancel',
}
