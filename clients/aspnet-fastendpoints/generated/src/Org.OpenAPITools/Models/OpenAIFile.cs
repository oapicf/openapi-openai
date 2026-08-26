namespace Org.OpenAPITools.Models;


/// <summary>
/// The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
/// </summary>
public class OpenAIFile 
{
    public string Id { get; set; }
    public int Bytes { get; set; }
    public int CreatedAt { get; set; }
    public string Filename { get; set; }
    
    /// <summary>
    /// The object type, which is always `file`.
    /// </summary>
    /// <value>The object type, which is always `file`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum FileEnum for file
        /// </summary>
        FileEnum = 1
    }

    public ObjectEnum Object { get; set; }
    
    /// <summary>
    /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
    /// </summary>
    /// <value>The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.</value>
    public enum PurposeEnum
    {
        
        /// <summary>
        /// Enum AssistantsEnum for assistants
        /// </summary>
        AssistantsEnum = 1,
        
        /// <summary>
        /// Enum AssistantsOutputEnum for assistants_output
        /// </summary>
        AssistantsOutputEnum = 2,
        
        /// <summary>
        /// Enum BatchEnum for batch
        /// </summary>
        BatchEnum = 3,
        
        /// <summary>
        /// Enum BatchOutputEnum for batch_output
        /// </summary>
        BatchOutputEnum = 4,
        
        /// <summary>
        /// Enum FineTuneEnum for fine-tune
        /// </summary>
        FineTuneEnum = 5,
        
        /// <summary>
        /// Enum FineTuneResultsEnum for fine-tune-results
        /// </summary>
        FineTuneResultsEnum = 6,
        
        /// <summary>
        /// Enum VisionEnum for vision
        /// </summary>
        VisionEnum = 7
    }

    public PurposeEnum Purpose { get; set; }
    
    /// <summary>
    /// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
    /// </summary>
    /// <value>Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum UploadedEnum for uploaded
        /// </summary>
        UploadedEnum = 1,
        
        /// <summary>
        /// Enum ProcessedEnum for processed
        /// </summary>
        ProcessedEnum = 2,
        
        /// <summary>
        /// Enum ErrorEnum for error
        /// </summary>
        ErrorEnum = 3
    }

    public StatusEnum Status { get; set; }
    public string StatusDetails { get; set; }
}


