namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateUploadRequest 
{
    public string Filename { get; set; }
    
    /// <summary>
    /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
    /// </summary>
    /// <value>The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). </value>
    public enum PurposeEnum
    {
        
        /// <summary>
        /// Enum AssistantsEnum for assistants
        /// </summary>
        AssistantsEnum = 1,
        
        /// <summary>
        /// Enum BatchEnum for batch
        /// </summary>
        BatchEnum = 2,
        
        /// <summary>
        /// Enum FineTuneEnum for fine-tune
        /// </summary>
        FineTuneEnum = 3,
        
        /// <summary>
        /// Enum VisionEnum for vision
        /// </summary>
        VisionEnum = 4
    }

    public PurposeEnum Purpose { get; set; }
    public int Bytes { get; set; }
    public string MimeType { get; set; }
}


