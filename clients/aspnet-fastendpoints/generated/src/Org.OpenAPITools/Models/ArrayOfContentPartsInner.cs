namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ArrayOfContentPartsInner 
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
        TextEnum = 3
    }

    public TypeEnum Type { get; set; }
    public MessageContentImageFileObjectImageFile ImageFile { get; set; }
    public MessageContentImageUrlObjectImageUrl ImageUrl { get; set; }
    public string Text { get; set; }
}


