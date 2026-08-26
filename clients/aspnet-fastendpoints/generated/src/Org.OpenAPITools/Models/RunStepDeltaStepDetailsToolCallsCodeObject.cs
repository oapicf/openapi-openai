namespace Org.OpenAPITools.Models;


/// <summary>
/// Details of the Code Interpreter tool call the run step was involved in.
/// </summary>
public class RunStepDeltaStepDetailsToolCallsCodeObject 
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
        CodeInterpreterEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter CodeInterpreter { get; set; }
}


