namespace Org.OpenAPITools.Models;


/// <summary>
/// Tool call objects
/// </summary>
public class RunToolCallObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The type of tool call the output is required for. For now, this is always `function`.
    /// </summary>
    /// <value>The type of tool call the output is required for. For now, this is always `function`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunToolCallObjectFunction Function { get; set; }
}


