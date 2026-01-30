package org.openapitools.server.model


/**
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.done`. for example: ''null''
 * @param response  for example: ''null''
*/
final case class RealtimeServerEventResponseDone (
  eventId: String,
  `type`: String,
  response: RealtimeResponse
)

