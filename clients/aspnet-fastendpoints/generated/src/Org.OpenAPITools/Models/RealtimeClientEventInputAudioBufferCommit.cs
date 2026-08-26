namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an &#x60;input_audio_buffer.committed&#x60;  event. 
/// </summary>
public class RealtimeClientEventInputAudioBufferCommit 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `input_audio_buffer.commit`.
    /// </summary>
    /// <value>The event type, must be `input_audio_buffer.commit`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioBufferCommitEnum for input_audio_buffer.commit
        /// </summary>
        InputAudioBufferCommitEnum = 1
    }

    public TypeEnum Type { get; set; }
}


