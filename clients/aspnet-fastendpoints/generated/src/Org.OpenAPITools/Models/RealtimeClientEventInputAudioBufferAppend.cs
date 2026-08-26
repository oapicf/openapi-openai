namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
/// </summary>
public class RealtimeClientEventInputAudioBufferAppend 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.append`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.append`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferAppendEnum for input_audio_buffer.append
        /// </summary>
        InputAudioBufferAppendEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Audio { get; set; }
}


