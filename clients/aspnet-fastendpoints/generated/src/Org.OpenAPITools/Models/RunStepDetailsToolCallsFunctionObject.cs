namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepDetailsToolCallsFunctionObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The type of tool call. This is always going to be `function` for this type of tool call.
    /// </summary>
    /// <value>The type of tool call. This is always going to be `function` for this type of tool call.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunStepDetailsToolCallsFunctionObjectFunction Function { get; set; }
}


