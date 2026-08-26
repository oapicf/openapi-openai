namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.
/// </summary>
public class RunStepStreamEventOneOf5 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepCancelledEnum for thread.run.step.cancelled
        /// </summary>
        ThreadRunStepCancelledEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunStepObject Data { get; set; }
}


