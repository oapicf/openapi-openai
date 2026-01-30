package org.openapitools.server.model


/**
 * Returned when the text value of a \"text\" content part is updated.
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.text.delta`. for example: ''null''
 * @param responseId The ID of the response. for example: ''null''
 * @param itemId The ID of the item. for example: ''null''
 * @param outputIndex The index of the output item in the response. for example: ''null''
 * @param contentIndex The index of the content part in the item's content array. for example: ''null''
 * @param delta The text delta. for example: ''null''
*/
final case class RealtimeServerEventResponseTextDelta (
  eventId: String,
  `type`: String,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  delta: String
)

