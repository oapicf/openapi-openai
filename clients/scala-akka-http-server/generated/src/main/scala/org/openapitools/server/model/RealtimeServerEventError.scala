package org.openapitools.server.model


/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `error`. for example: ''null''
 * @param error  for example: ''null''
*/
final case class RealtimeServerEventError (
  eventId: String,
  `type`: String,
  error: RealtimeServerEventErrorError
)

