namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RealtimeResponseCreateParamsToolsInner 
{
    
    /// <summary>
    /// The type of the tool, i.e. `function`.
    /// </summary>
    /// <value>The type of the tool, i.e. `function`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Name { get; set; }
    public string Description { get; set; }
    public Object Parameters { get; set; }
}


