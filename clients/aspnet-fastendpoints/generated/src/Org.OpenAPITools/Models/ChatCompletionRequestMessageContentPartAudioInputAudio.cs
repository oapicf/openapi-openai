namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestMessageContentPartAudioInputAudio 
{
    public string Data { get; set; }
    
    /// <summary>
    /// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
    /// </summary>
    /// <value>The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". </value>
    public enum FormatEnum
    {
        
        /// <summary>
        /// Enum WavEnum for wav
        /// </summary>
        WavEnum = 1,
        
        /// <summary>
        /// Enum Mp3Enum for mp3
        /// </summary>
        Mp3Enum = 2
    }

    public FormatEnum Format { get; set; }
}


