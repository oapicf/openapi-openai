package org.openapitools.server.model


/**
 * Returned when a new content part is added to an assistant message item during response generation. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.content_part.added`. for example: ''null''
 * @param responseId The ID of the response. for example: ''null''
 * @param itemId The ID of the item to which the content part was added. for example: ''null''
 * @param outputIndex The index of the output item in the response. for example: ''null''
 * @param contentIndex The index of the content part in the item's content array. for example: ''null''
 * @param part  for example: ''null''
*/
final case class RealtimeServerEventResponseContentPartAdded (
  eventId: String,
  `type`: String,
  responseId: String,
  itemId: String,
  outputIndex: Int,
  contentIndex: Int,
  part: RealtimeServerEventResponseContentPartAddedPart
)

