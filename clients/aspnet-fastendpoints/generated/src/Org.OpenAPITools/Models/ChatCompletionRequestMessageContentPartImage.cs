namespace Org.OpenAPITools.Models;


/// <summary>
/// Learn about [image inputs](/docs/guides/vision). 
/// </summary>
public class ChatCompletionRequestMessageContentPartImage 
{
    
    /// <summary>
    /// The type of the content part.
    /// </summary>
    /// <value>The type of the content part.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 1
    }

    public TypeEnum Type { get; set; }
    public ChatCompletionRequestMessageContentPartImageImageUrl ImageUrl { get; set; }
}


