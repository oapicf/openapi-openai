namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MessageObjectContentInner 
{
    
    /// <summary>
    /// Always `image_file`.
    /// </summary>
    /// <value>Always `image_file`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ImageFileEnum for image_file
        /// </summary>
        ImageFileEnum = 1,
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 2,
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 3,
        
        /// <summary>
        /// Enum RefusalEnum for refusal
        /// </summary>
        RefusalEnum = 4
    }

    public TypeEnum Type { get; set; }
    public MessageContentImageFileObjectImageFile ImageFile { get; set; }
    public MessageContentImageUrlObjectImageUrl ImageUrl { get; set; }
    public MessageContentTextObjectText Text { get; set; }
    public string Refusal { get; set; }
}


