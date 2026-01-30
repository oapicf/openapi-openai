package org.openapitools.server.model


/**
 * Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.text.done`. for example: ''null''
 * @param responseId The ID of the response. for example: ''null''
 * @param itemId The ID of the item. for example: ''null''
 * @param outputIndex The index of the output item in the response. for example: ''null''
 * @param contentIndex The index of the content part in the item's content array. for example: ''null''
 * @param text The final text content. for example: ''null''
*/
final case class RealtimeServerEventResponseTextDone (
  eventId: String,
  `type`: String,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  text: String
)

