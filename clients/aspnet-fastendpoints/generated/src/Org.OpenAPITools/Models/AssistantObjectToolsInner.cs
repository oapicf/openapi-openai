namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssistantObjectToolsInner 
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
        CodeInterpreterEnum = 1,
        
        /// <summary>
        /// Enum FileSearchEnum for file_search
        /// </summary>
        FileSearchEnum = 2,
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 3
    }

    public TypeEnum Type { get; set; }
    public AssistantToolsFileSearchFileSearch FileSearch { get; set; }
    public FunctionObject Function { get; set; }
}


