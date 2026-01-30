package org.openapitools.server.model


/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.output_item.done`. for example: ''null''
 * @param responseId The ID of the Response to which the item belongs. for example: ''null''
 * @param outputIndex The index of the output item in the Response. for example: ''null''
 * @param item  for example: ''null''
*/
final case class RealtimeServerEventResponseOutputItemDone (
  eventId: String,
  `type`: String,
  responseId: String,
  outputIndex: Int,
  item: RealtimeConversationItem
)

