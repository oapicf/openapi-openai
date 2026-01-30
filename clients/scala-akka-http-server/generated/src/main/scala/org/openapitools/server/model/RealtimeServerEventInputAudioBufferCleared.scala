package org.openapitools.server.model


/**
 * Returned when the input audio buffer is cleared by the client with a  `input_audio_buffer.clear` event. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `input_audio_buffer.cleared`. for example: ''null''
*/
final case class RealtimeServerEventInputAudioBufferCleared (
  eventId: String,
  `type`: String
)

