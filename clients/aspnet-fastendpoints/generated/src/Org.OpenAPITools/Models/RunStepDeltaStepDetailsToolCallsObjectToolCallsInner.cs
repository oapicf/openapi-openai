namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner 
{
    public int Index { get; set; }
    public string Id { get; set; }
    
    /// <summary>
    /// The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    /// </summary>
    /// <value>The type of tool call. This is always going to be `code_interpreter` for this type of tool call.</value>
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
    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter CodeInterpreter { get; set; }
    public Object FileSearch { get; set; }
    public RunStepDeltaStepDetailsToolCallsFunctionObjectFunction Function { get; set; }
}


