namespace Org.OpenAPITools.Models;


/// <summary>
/// The Upload object can accept byte chunks in the form of Parts. 
/// </summary>
public class Upload 
{
    public string Id { get; set; }
    public int CreatedAt { get; set; }
    public string Filename { get; set; }
    public int Bytes { get; set; }
    public string Purpose { get; set; }
    
    /// <summary>
    /// The status of the Upload.
    /// </summary>
    /// <value>The status of the Upload.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum PendingEnum for pending
        /// </summary>
        PendingEnum = 1,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 2,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 3,
        
        /// <summary>
        /// Enum ExpiredEnum for expired
        /// </summary>
        ExpiredEnum = 4
    }

    public StatusEnum Status { get; set; }
    public int ExpiresAt { get; set; }
    
    /// <summary>
    /// The object type, which is always \"upload\".
    /// </summary>
    /// <value>The object type, which is always \"upload\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum UploadEnum for upload
        /// </summary>
        UploadEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public OpenAIFile File { get; set; }
}


