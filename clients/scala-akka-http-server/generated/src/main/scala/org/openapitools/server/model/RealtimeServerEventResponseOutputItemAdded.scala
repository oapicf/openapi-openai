package org.openapitools.server.model


/**
 * Returned when a new Item is created during Response generation.
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `response.output_item.added`. for example: ''null''
 * @param responseId The ID of the Response to which the item belongs. for example: ''null''
 * @param outputIndex The index of the output item in the Response. for example: ''null''
 * @param item  for example: ''null''
*/
final case class RealtimeServerEventResponseOutputItemAdded (
  eventId: String,
  `type`: String,
  responseId: String,
  outputIndex: Int,
  item: RealtimeConversationItem
)

