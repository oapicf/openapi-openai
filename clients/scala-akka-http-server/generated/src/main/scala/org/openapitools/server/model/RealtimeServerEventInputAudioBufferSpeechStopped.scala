package org.openapitools.server.model


/**
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 *
 * @param eventId The unique ID of the server event. for example: ''null''
 * @param `type` The event type, must be `input_audio_buffer.speech_stopped`. for example: ''null''
 * @param audioEndMs Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  for example: ''null''
 * @param itemId The ID of the user message item that will be created. for example: ''null''
*/
final case class RealtimeServerEventInputAudioBufferSpeechStopped (
  eventId: String,
  `type`: String,
  audioEndMs: Int,
  itemId: String
)

