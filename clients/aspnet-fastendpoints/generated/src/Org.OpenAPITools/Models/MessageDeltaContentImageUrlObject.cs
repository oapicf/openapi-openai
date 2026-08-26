namespace Org.OpenAPITools.Models;


/// <summary>
/// References an image URL in the content of a message.
/// </summary>
public class MessageDeltaContentImageUrlObject 
{
    public int Index { get; set; }
    
    /// <summary>
    /// Always `image_url`.
    /// </summary>
    /// <value>Always `image_url`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 1
    }

    public TypeEnum Type { get; set; }
    public MessageDeltaContentImageUrlObjectImageUrl ImageUrl { get; set; }
}


