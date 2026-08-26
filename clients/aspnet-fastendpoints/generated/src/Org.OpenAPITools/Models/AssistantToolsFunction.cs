namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssistantToolsFunction 
{
    
    /// <summary>
    /// The type of tool being defined: `function`
    /// </summary>
    /// <value>The type of tool being defined: `function`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public TypeEnum Type { get; set; }
    public FunctionObject Function { get; set; }
}


