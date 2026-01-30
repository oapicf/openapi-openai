package org.openapitools.server.model


/**
 * Returned when a session is updated with a `session.update` event, unless  there is an error. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `session.updated`. for example: ''null''
 * @param session  for example: ''null''
*/
final case class RealtimeServerEventSessionUpdated (
  eventId: String,
  `type`: String,
  session: RealtimeSession
)

