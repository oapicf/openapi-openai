namespace Org.OpenAPITools.Models;


/// <summary>
/// References an image [File](/docs/api-reference/files) in the content of a message.
/// </summary>
public class MessageDeltaContentImageFileObject 
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
        ImageFileEnum = 1
    }

    public TypeEnum Type { get; set; }
    public MessageDeltaContentImageFileObjectImageFile ImageFile { get; set; }
}


