namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class StaticChunkingStrategy 
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
    public StaticChunkingStrategyStatic Static { get; set; }
}


