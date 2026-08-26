namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
/// </summary>
public class RealtimeServerEventInputAudioBufferSpeechStopped 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.speech_stopped`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.speech_stopped`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferSpeechStoppedEnum for input_audio_buffer.speech_stopped
        /// </summary>
        InputAudioBufferSpeechStoppedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public int AudioEndMs { get; set; }
    public string ItemId { get; set; }
}


