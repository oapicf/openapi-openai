namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The &#x60;item_id&#x60; property is the ID of the user message item that will be created, thus a &#x60;conversation.item.created&#x60; event  will also be sent to the client. 
/// </summary>
public class RealtimeServerEventInputAudioBufferCommitted 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.committed`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.committed`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferCommittedEnum for input_audio_buffer.committed
        /// </summary>
        InputAudioBufferCommittedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string PreviousItemId { get; set; }
    public string ItemId { get; set; }
}


