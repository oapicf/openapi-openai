namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateModerationRequestInputOneOfInner 
{
    
    /// <summary>
    /// Always `image_url`.
    /// </summary>
    /// <value>Always `image_url`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ImageUrlEnum for image_url
        /// </summary>
        ImageUrlEnum = 1,
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 2
    }

    public TypeEnum Type { get; set; }
    public CreateModerationRequestInputOneOfInnerOneOfImageUrl ImageUrl { get; set; }
    public string Text { get; set; }
}


