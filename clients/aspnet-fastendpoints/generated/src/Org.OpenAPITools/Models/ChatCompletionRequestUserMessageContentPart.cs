namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestUserMessageContentPart 
{
    
    /// <summary>
    /// The type of the content part.
    /// </summary>
    /// <value>The type of the content part.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 1,
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 2,
        
        /// <summary>
        /// Enum InputAudioEnum for input_audio
        /// </summary>
        InputAudioEnum = 3
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public ChatCompletionRequestMessageContentPartImageImageUrl ImageUrl { get; set; }
    public ChatCompletionRequestMessageContentPartAudioInputAudio InputAudio { get; set; }
}


