namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Batch 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `batch`.
    /// </summary>
    /// <value>The object type, which is always `batch`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum BatchEnum for batch
        /// </summary>
        BatchEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Endpoint { get; set; }
    public BatchErrors Errors { get; set; }
    public string InputFileId { get; set; }
    public string CompletionWindow { get; set; }
    
    /// <summary>
    /// The current status of the batch.
    /// </summary>
    /// <value>The current status of the batch.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum ValidatingEnum for validating
        /// </summary>
        ValidatingEnum = 1,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 2,
        
        /// <summary>
        /// Enum InProgressEnum for in_progress
        /// </summary>
        InProgressEnum = 3,
        
        /// <summary>
        /// Enum FinalizingEnum for finalizing
        /// </summary>
        FinalizingEnum = 4,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 5,
        
        /// <summary>
        /// Enum ExpiredEnum for expired
        /// </summary>
        ExpiredEnum = 6,
        
        /// <summary>
        /// Enum CancellingEnum for cancelling
        /// </summary>
        CancellingEnum = 7,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 8
    }

    public StatusEnum Status { get; set; }
    public string OutputFileId { get; set; }
    public string ErrorFileId { get; set; }
    public int CreatedAt { get; set; }
    public int InProgressAt { get; set; }
    public int ExpiresAt { get; set; }
    public int FinalizingAt { get; set; }
    public int CompletedAt { get; set; }
    public int FailedAt { get; set; }
    public int ExpiredAt { get; set; }
    public int CancellingAt { get; set; }
    public int CancelledAt { get; set; }
    public BatchRequestCounts RequestCounts { get; set; }
    public Object Metadata { get; set; }
}


