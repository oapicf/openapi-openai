namespace Org.OpenAPITools.Models;


/// <summary>
/// The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy. Only applicable if &#x60;file_ids&#x60; is non-empty.
/// </summary>
public class CreateVectorStoreRequestChunkingStrategy 
{
    
    /// <summary>
    /// Always `auto`.
    /// </summary>
    /// <value>Always `auto`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum AutoEnum for auto
        /// </summary>
        AutoEnum = 1,
        
        /// <summary>
        /// Enum StaticEnum for static
        /// </summary>
        StaticEnum = 2
    }

    public TypeEnum Type { get; set; }
    public StaticChunkingStrategy Static { get; set; }
}


