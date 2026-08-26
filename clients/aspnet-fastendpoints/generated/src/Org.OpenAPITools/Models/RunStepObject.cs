namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a step in execution of a run. 
/// </summary>
public class RunStepObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `thread.run.step`.
    /// </summary>
    /// <value>The object type, which is always `thread.run.step`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepEnum for thread.run.step
        /// </summary>
        ThreadRunStepEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public string AssistantId { get; set; }
    public string ThreadId { get; set; }
    public string RunId { get; set; }
    
    /// <summary>
    /// The type of run step, which can be either `message_creation` or `tool_calls`.
    /// </summary>
    /// <value>The type of run step, which can be either `message_creation` or `tool_calls`.</value>
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
    
    /// <summary>
    /// The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    /// </summary>
    /// <value>The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum InProgressEnum for in_progress
        /// </summary>
        InProgressEnum = 1,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 2,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 3,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 4,
        
        /// <summary>
        /// Enum ExpiredEnum for expired
        /// </summary>
        ExpiredEnum = 5
    }

    public StatusEnum Status { get; set; }
    public RunStepObjectStepDetails StepDetails { get; set; }
    public RunStepObjectLastError LastError { get; set; }
    public int ExpiredAt { get; set; }
    public int CancelledAt { get; set; }
    public int FailedAt { get; set; }
    public int CompletedAt { get; set; }
    public Object Metadata { get; set; }
    public RunStepCompletionUsage Usage { get; set; }
}


