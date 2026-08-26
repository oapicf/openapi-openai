namespace Org.OpenAPITools.Models;


/// <summary>
/// Sent by the server when in &#x60;server_vad&#x60; mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a &#x60;input_audio_buffer.speech_stopped&#x60; event  when speech stops. The &#x60;item_id&#x60; property is the ID of the user message item  that will be created when speech stops and will also be included in the  &#x60;input_audio_buffer.speech_stopped&#x60; event (unless the client manually commits  the audio buffer during VAD activation). 
/// </summary>
public class RealtimeServerEventInputAudioBufferSpeechStarted 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.speech_started`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.speech_started`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferSpeechStartedEnum for input_audio_buffer.speech_started
        /// </summary>
        InputAudioBufferSpeechStartedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public int AudioStartMs { get; set; }
    public string ItemId { get; set; }
}


