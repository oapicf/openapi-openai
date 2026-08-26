namespace Org.OpenAPITools.Models;


/// <summary>
/// The strategy used to chunk the file.
/// </summary>
public class VectorStoreFileObjectChunkingStrategy 
{
    
    /// <summary>
    /// Always `static`.
    /// </summary>
    /// <value>Always `static`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum StaticEnum for static
        /// </summary>
        StaticEnum = 1,
        
        /// <summary>
        /// Enum OtherEnum for other
        /// </summary>
        OtherEnum = 2
    }

    public TypeEnum Type { get; set; }
    public StaticChunkingStrategy Static { get; set; }
}


