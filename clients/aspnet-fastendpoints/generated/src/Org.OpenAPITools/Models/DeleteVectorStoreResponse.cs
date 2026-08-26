namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeleteVectorStoreResponse 
{
    public string Id { get; set; }
    public bool Deleted { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum VectorStoreDeletedEnum for vector_store.deleted
        /// </summary>
        VectorStoreDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


