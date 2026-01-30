package org.openapitools.server.model


/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.created`. for example: ''null''
 * @param response  for example: ''null''
*/
final case class RealtimeServerEventResponseCreated (
  eventId: String,
  `type`: String,
  response: RealtimeResponse
)

