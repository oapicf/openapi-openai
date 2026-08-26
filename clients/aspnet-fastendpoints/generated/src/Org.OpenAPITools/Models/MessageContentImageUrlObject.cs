namespace Org.OpenAPITools.Models;


/// <summary>
/// References an image URL in the content of a message.
/// </summary>
public class MessageContentImageUrlObject 
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
    public MessageContentImageUrlObjectImageUrl ImageUrl { get; set; }
}


