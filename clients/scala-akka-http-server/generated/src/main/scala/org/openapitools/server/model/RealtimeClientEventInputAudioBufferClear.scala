package org.openapitools.server.model


/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
 *
 * @param eventId Optional client-generated ID used to identify this event. for example: ''null''
 * @param `type` The event type, must be `input_audio_buffer.clear`. for example: ''null''
*/
final case class RealtimeClientEventInputAudioBufferClear (
  eventId: Option[String] = None,
  `type`: String
)

