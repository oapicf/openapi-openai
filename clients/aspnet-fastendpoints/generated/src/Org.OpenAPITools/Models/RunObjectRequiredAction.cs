namespace Org.OpenAPITools.Models;


/// <summary>
/// Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
/// </summary>
public class RunObjectRequiredAction 
{
    
    /// <summary>
    /// For now, this is always `submit_tool_outputs`.
    /// </summary>
    /// <value>For now, this is always `submit_tool_outputs`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum SubmitToolOutputsEnum for submit_tool_outputs
        /// </summary>
        SubmitToolOutputsEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunObjectRequiredActionSubmitToolOutputs SubmitToolOutputs { get; set; }
}


