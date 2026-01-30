package org.openapitools.server.model


/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `conversation.item.truncated`. for example: ''null''
 * @param itemId The ID of the assistant message item that was truncated. for example: ''null''
 * @param contentIndex The index of the content part that was truncated. for example: ''null''
 * @param audioEndMs The duration up to which the audio was truncated, in milliseconds.  for example: ''null''
*/
final case class RealtimeServerEventConversationItemTruncated (
  eventId: String,
  `type`: String,
  itemId: String,
  contentIndex: Int,
  audioEndMs: Int
)

