namespace Org.OpenAPITools.Models;


/// <summary>
/// The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
/// </summary>
public class AutoChunkingStrategyRequestParam 
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
        AutoEnum = 1
    }

    public TypeEnum Type { get; set; }
}


