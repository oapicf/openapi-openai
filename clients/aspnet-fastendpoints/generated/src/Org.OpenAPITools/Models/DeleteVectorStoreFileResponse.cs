namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeleteVectorStoreFileResponse 
{
    public string Id { get; set; }
    public bool Deleted { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum VectorStoreFileDeletedEnum for vector_store.file.deleted
        /// </summary>
        VectorStoreFileDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


