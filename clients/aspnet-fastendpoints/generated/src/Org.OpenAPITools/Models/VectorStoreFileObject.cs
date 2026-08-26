namespace Org.OpenAPITools.Models;


/// <summary>
/// A list of files attached to a vector store.
/// </summary>
public class VectorStoreFileObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `vector_store.file`.
    /// </summary>
    /// <value>The object type, which is always `vector_store.file`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum VectorStoreFileEnum for vector_store.file
        /// </summary>
        VectorStoreFileEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int UsageBytes { get; set; }
    public int CreatedAt { get; set; }
    public string VectorStoreId { get; set; }
    
    /// <summary>
    /// The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
    /// </summary>
    /// <value>The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.</value>
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
    public VectorStoreFileObjectLastError LastError { get; set; }
    public VectorStoreFileObjectChunkingStrategy ChunkingStrategy { get; set; }
}


