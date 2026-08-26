namespace Org.OpenAPITools.Models;


/// <summary>
/// Details of the tool call.
/// </summary>
public class RunStepDetailsToolCallsObject 
{
    
    /// <summary>
    /// Always `tool_calls`.
    /// </summary>
    /// <value>Always `tool_calls`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ToolCallsEnum for tool_calls
        /// </summary>
        ToolCallsEnum = 1
    }

    public TypeEnum Type { get; set; }
    public List<RunStepDetailsToolCallsObjectToolCallsInner> ToolCalls { get; set; }
}


