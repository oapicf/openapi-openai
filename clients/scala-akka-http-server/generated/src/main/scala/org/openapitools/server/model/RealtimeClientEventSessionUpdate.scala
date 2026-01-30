package org.openapitools.server.model


/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 *
 * @param eventId Optional client-generated ID used to identify this event. for example: ''null''
 * @param `type` The event type, must be `session.update`. for example: ''null''
 * @param session  for example: ''null''
*/
final case class RealtimeClientEventSessionUpdate (
  eventId: Option[String] = None,
  `type`: String,
  session: RealtimeSessionCreateRequest
)

