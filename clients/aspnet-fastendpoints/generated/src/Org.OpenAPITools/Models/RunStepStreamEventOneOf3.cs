namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
/// </summary>
public class RunStepStreamEventOneOf3 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepCompletedEnum for thread.run.step.completed
        /// </summary>
        ThreadRunStepCompletedEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunStepObject Data { get; set; }
}


