namespace Org.OpenAPITools.Models;


/// <summary>
/// A batch of files attached to a vector store.
/// </summary>
public class VectorStoreFileBatchObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `vector_store.file_batch`.
    /// </summary>
    /// <value>The object type, which is always `vector_store.file_batch`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum VectorStoreFilesBatchEnum for vector_store.files_batch
        /// </summary>
        VectorStoreFilesBatchEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public string VectorStoreId { get; set; }
    
    /// <summary>
    /// The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
    /// </summary>
    /// <value>The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum InProgressEnum for in_progress
        /// </summary>
        InProgressEnum = 1,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 2,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 3,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 4
    }

    public StatusEnum Status { get; set; }
    public VectorStoreFileBatchObjectFileCounts FileCounts { get; set; }
}


