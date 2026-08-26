namespace Org.OpenAPITools.Models;


/// <summary>
/// A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
/// </summary>
public class VectorStoreObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `vector_store`.
    /// </summary>
    /// <value>The object type, which is always `vector_store`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum VectorStoreEnum for vector_store
        /// </summary>
        VectorStoreEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public string Name { get; set; }
    public int UsageBytes { get; set; }
    public VectorStoreObjectFileCounts FileCounts { get; set; }
    
    /// <summary>
    /// The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
    /// </summary>
    /// <value>The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum ExpiredEnum for expired
        /// </summary>
        ExpiredEnum = 1,
        
        /// <summary>
        /// Enum InProgressEnum for in_progress
        /// </summary>
        InProgressEnum = 2,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 3
    }

    public StatusEnum Status { get; set; }
    public VectorStoreExpirationAfter ExpiresAfter { get; set; }
    public int ExpiresAt { get; set; }
    public int LastActiveAt { get; set; }
    public Object Metadata { get; set; }
}


