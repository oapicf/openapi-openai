namespace Org.OpenAPITools.Models;


/// <summary>
/// Learn about [audio inputs](/docs/guides/audio). 
/// </summary>
public class ChatCompletionRequestMessageContentPartAudio 
{
    
    /// <summary>
    /// The type of the content part. Always `input_audio`.
    /// </summary>
    /// <value>The type of the content part. Always `input_audio`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioEnum for input_audio
        /// </summary>
        InputAudioEnum = 1
    }

    public TypeEnum Type { get; set; }
    public ChatCompletionRequestMessageContentPartAudioInputAudio InputAudio { get; set; }
}


