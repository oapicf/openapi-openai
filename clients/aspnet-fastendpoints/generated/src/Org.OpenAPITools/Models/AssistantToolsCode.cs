namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssistantToolsCode 
{
    
    /// <summary>
    /// The type of tool being defined: `code_interpreter`
    /// </summary>
    /// <value>The type of tool being defined: `code_interpreter`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum CodeInterpreterEnum for code_interpreter
        /// </summary>
        CodeInterpreterEnum = 1
    }

    public TypeEnum Type { get; set; }
}


