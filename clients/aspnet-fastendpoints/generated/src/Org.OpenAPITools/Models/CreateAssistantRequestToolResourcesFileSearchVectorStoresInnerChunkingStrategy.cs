namespace Org.OpenAPITools.Models;


/// <summary>
/// The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
/// </summary>
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy 
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
    public StaticChunkingStrategyStatic Static { get; set; }
}


