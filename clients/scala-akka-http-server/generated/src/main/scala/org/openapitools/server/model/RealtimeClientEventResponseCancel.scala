package org.openapitools.server.model


/**
 * Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 *
 * @param eventId Optional client-generated ID used to identify this event. for example: ''null''
 * @param `type` The event type, must be `response.cancel`. for example: ''null''
 * @param responseId A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  for example: ''null''
*/
final case class RealtimeClientEventResponseCancel (
  eventId: Option[String] = None,
  `type`: String,
  responseId: Option[String] = None
)

