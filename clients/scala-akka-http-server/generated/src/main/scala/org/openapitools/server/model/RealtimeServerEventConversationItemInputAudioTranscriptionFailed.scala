package org.openapitools.server.model


/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `conversation.item.input_audio_transcription.failed`.  for example: ''null''
 * @param itemId The ID of the user message item. for example: ''null''
 * @param contentIndex The index of the content part containing the audio. for example: ''null''
 * @param error  for example: ''null''
*/
final case class RealtimeServerEventConversationItemInputAudioTranscriptionFailed (
  eventId: String,
  `type`: String,
  itemId: String,
  contentIndex: Int,
  error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
)

