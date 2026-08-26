namespace Org.OpenAPITools.Models;


/// <summary>
/// This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
/// </summary>
public class OtherChunkingStrategyResponseParam 
{
    
    /// <summary>
    /// Always `other`.
    /// </summary>
    /// <value>Always `other`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum OtherEnum for other
        /// </summary>
        OtherEnum = 1
    }

    public TypeEnum Type { get; set; }
}


