namespace Org.OpenAPITools.Models;


/// <summary>
/// The details of the run step.
/// </summary>
public class RunStepObjectStepDetails 
{
    
    /// <summary>
    /// Always `message_creation`.
    /// </summary>
    /// <value>Always `message_creation`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum MessageCreationEnum for message_creation
        /// </summary>
        MessageCreationEnum = 1,
        
        /// <summary>
        /// Enum ToolCallsEnum for tool_calls
        /// </summary>
        ToolCallsEnum = 2
    }

    public TypeEnum Type { get; set; }
    public RunStepDetailsMessageCreationObjectMessageCreation MessageCreation { get; set; }
    public List<RunStepDetailsToolCallsObjectToolCallsInner> ToolCalls { get; set; }
}


