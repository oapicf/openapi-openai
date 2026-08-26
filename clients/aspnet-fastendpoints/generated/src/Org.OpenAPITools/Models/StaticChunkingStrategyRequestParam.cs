namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class StaticChunkingStrategyRequestParam 
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
        StaticEnum = 1
    }

    public TypeEnum Type { get; set; }
    public StaticChunkingStrategy Static { get; set; }
}


