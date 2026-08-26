namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
/// </summary>
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.input_audio_transcription.failed`. 
    /// </summary>
    /// <value>The event type, must be `conversation.item.input_audio_transcription.failed`. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemInputAudioTranscriptionFailedEnum for conversation.item.input_audio_transcription.failed
        /// </summary>
        ConversationItemInputAudioTranscriptionFailedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ItemId { get; set; }
    public int ContentIndex { get; set; }
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError Error { get; set; }
}


