namespace Org.OpenAPITools.Models;


/// <summary>
/// This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in &#x60;server_vad&#x60; mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always &#x60;whisper-1&#x60;. Thus the transcript may diverge somewhat from  the model&#39;s interpretation, and should be treated as a rough guide. 
/// </summary>
public class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.input_audio_transcription.completed`. 
    /// </summary>
    /// <value>The event type, must be `conversation.item.input_audio_transcription.completed`. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemInputAudioTranscriptionCompletedEnum for conversation.item.input_audio_transcription.completed
        /// </summary>
        ConversationItemInputAudioTranscriptionCompletedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ItemId { get; set; }
    public int ContentIndex { get; set; }
    public string Transcript { get; set; }
}


