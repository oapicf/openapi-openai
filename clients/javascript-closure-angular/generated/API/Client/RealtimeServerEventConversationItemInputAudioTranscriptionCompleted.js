goog.provide('API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted');

/**
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
 * @record
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.prototype.eventId;

/**
 * The event type, must be `conversation.item.input_audio_transcription.completed`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.prototype.type;

/**
 * The ID of the user message item containing the audio.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.prototype.itemId;

/**
 * The index of the content part containing the audio.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.prototype.contentIndex;

/**
 * The transcribed text.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.prototype.transcript;

/** @enum {string} */
API.Client.RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.TypeEnum = { 
  conversation.item.input_audio_transcription.completed: 'conversation.item.input_audio_transcription.completed',
}
