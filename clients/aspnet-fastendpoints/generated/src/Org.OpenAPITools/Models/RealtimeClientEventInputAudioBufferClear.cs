namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
/// </summary>
public class RealtimeClientEventInputAudioBufferClear 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.clear`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.clear`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferClearEnum for input_audio_buffer.clear
        /// </summary>
        InputAudioBufferClearEnum = 1
    }

    public TypeEnum Type { get; set; }
}


