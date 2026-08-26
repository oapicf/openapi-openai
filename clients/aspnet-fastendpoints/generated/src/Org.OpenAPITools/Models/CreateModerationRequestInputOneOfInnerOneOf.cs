namespace Org.OpenAPITools.Models;


/// <summary>
/// An object describing an image to classify.
/// </summary>
public class CreateModerationRequestInputOneOfInnerOneOf 
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
        ImageUrlEnum = 1
    }

    public TypeEnum Type { get; set; }
    public CreateModerationRequestInputOneOfInnerOneOfImageUrl ImageUrl { get; set; }
}


