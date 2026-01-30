package org.openapitools.server.model


/**
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `input_audio_buffer.committed`. for example: ''null''
 * @param previousItemId The ID of the preceding item after which the new item will be inserted.  for example: ''null''
 * @param itemId The ID of the user message item that will be created. for example: ''null''
*/
final case class RealtimeServerEventInputAudioBufferCommitted (
  eventId: String,
  `type`: String,
  previousItemId: String,
  itemId: String
)

