namespace Org.OpenAPITools.Models;


/// <summary>
/// Specifies a tool the model should use. Use to force the model to call a specific tool.
/// </summary>
public class AssistantsNamedToolChoice 
{
    
    /// <summary>
    /// The type of the tool. If type is `function`, the function name must be set
    /// </summary>
    /// <value>The type of the tool. If type is `function`, the function name must be set</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1,
        
        /// <summary>
        /// Enum CodeInterpreterEnum for code_interpreter
        /// </summary>
        CodeInterpreterEnum = 2,
        
        /// <summary>
        /// Enum FileSearchEnum for file_search
        /// </summary>
        FileSearchEnum = 3
    }

    public TypeEnum Type { get; set; }
    public AssistantsNamedToolChoiceFunction Function { get; set; }
}


