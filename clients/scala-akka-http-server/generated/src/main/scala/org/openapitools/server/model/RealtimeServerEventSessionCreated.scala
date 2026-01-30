package org.openapitools.server.model


/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `session.created`. for example: ''null''
 * @param session  for example: ''null''
*/
final case class RealtimeServerEventSessionCreated (
  eventId: String,
  `type`: String,
  session: RealtimeSession
)

