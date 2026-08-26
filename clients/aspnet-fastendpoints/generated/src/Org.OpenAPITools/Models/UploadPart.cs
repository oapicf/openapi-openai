namespace Org.OpenAPITools.Models;


/// <summary>
/// The upload Part represents a chunk of bytes we can add to an Upload object. 
/// </summary>
public class UploadPart 
{
    public string Id { get; set; }
    public int CreatedAt { get; set; }
    public string UploadId { get; set; }
    
    /// <summary>
    /// The object type, which is always `upload.part`.
    /// </summary>
    /// <value>The object type, which is always `upload.part`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum UploadPartEnum for upload.part
        /// </summary>
        UploadPartEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


