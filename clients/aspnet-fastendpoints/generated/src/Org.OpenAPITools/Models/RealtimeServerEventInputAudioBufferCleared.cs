namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the input audio buffer is cleared by the client with a  &#x60;input_audio_buffer.clear&#x60; event. 
/// </summary>
public class RealtimeServerEventInputAudioBufferCleared 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.cleared`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.cleared`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferClearedEnum for input_audio_buffer.cleared
        /// </summary>
        InputAudioBufferClearedEnum = 1
    }

    public TypeEnum Type { get; set; }
}


