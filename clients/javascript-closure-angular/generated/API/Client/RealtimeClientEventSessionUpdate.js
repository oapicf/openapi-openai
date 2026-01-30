goog.provide('API.Client.RealtimeClientEventSessionUpdate');

/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 * @record
 */
API.Client.RealtimeClientEventSessionUpdate = function() {}

/**
 * Optional client-generated ID used to identify this event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventSessionUpdate.prototype.eventId;

/**
 * The event type, must be `session.update`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeClientEventSessionUpdate.prototype.type;

/**
 * @type {!API.Client.RealtimeSessionCreateRequest}
 * @export
 */
API.Client.RealtimeClientEventSessionUpdate.prototype.session;

/** @enum {string} */
API.Client.RealtimeClientEventSessionUpdate.TypeEnum = { 
  session.update: 'session.update',
}
