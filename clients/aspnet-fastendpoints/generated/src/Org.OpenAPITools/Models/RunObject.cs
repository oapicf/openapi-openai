namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an execution run on a [thread](/docs/api-reference/threads).
/// </summary>
public class RunObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `thread.run`.
    /// </summary>
    /// <value>The object type, which is always `thread.run`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadRunEnum for thread.run
        /// </summary>
        ThreadRunEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public string ThreadId { get; set; }
    public string AssistantId { get; set; }
    
    /// <summary>
    /// The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
    /// </summary>
    /// <value>The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum QueuedEnum for queued
        /// </summary>
        QueuedEnum = 1,
        
        /// <summary>
        /// Enum InProgressEnum for in_progress
        /// </summary>
        InProgressEnum = 2,
        
        /// <summary>
        /// Enum RequiresActionEnum for requires_action
        /// </summary>
        RequiresActionEnum = 3,
        
        /// <summary>
        /// Enum CancellingEnum for cancelling
        /// </summary>
        CancellingEnum = 4,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 5,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 6,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 7,
        
        /// <summary>
        /// Enum IncompleteEnum for incomplete
        /// </summary>
        IncompleteEnum = 8,
        
        /// <summary>
        /// Enum ExpiredEnum for expired
        /// </summary>
        ExpiredEnum = 9
    }

    public StatusEnum Status { get; set; }
    public RunObjectRequiredAction RequiredAction { get; set; }
    public RunObjectLastError LastError { get; set; }
    public int ExpiresAt { get; set; }
    public int StartedAt { get; set; }
    public int CancelledAt { get; set; }
    public int FailedAt { get; set; }
    public int CompletedAt { get; set; }
    public RunObjectIncompleteDetails IncompleteDetails { get; set; }
    public string Model { get; set; }
    public string Instructions { get; set; }
    public List<AssistantObjectToolsInner> Tools { get; set; }
    public Object Metadata { get; set; }
    public RunCompletionUsage Usage { get; set; }
    public decimal Temperature { get; set; }
    public decimal TopP { get; set; }
    public int MaxPromptTokens { get; set; }
    public int MaxCompletionTokens { get; set; }
    public TruncationObject TruncationStrategy { get; set; }
    public AssistantsApiToolChoiceOption ToolChoice { get; set; }
    public bool ParallelToolCalls { get; set; } = true;
    public AssistantsApiResponseFormatOption ResponseFormat { get; set; }
}


