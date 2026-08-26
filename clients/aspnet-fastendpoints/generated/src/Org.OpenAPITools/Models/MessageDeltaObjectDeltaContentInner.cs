namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MessageDeltaObjectDeltaContentInner 
{
    public int Index { get; set; }
    
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
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 2,
        
        /// <summary>
        /// Enum RefusalEnum for refusal
        /// </summary>
        RefusalEnum = 3,
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 4
    }

    public TypeEnum Type { get; set; }
    public MessageDeltaContentImageFileObjectImageFile ImageFile { get; set; }
    public MessageDeltaContentTextObjectText Text { get; set; }
    public string Refusal { get; set; }
    public MessageDeltaContentImageUrlObjectImageUrl ImageUrl { get; set; }
}


