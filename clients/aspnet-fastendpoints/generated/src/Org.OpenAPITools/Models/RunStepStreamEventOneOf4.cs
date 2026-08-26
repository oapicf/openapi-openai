namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
/// </summary>
public class RunStepStreamEventOneOf4 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepFailedEnum for thread.run.step.failed
        /// </summary>
        ThreadRunStepFailedEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunStepObject Data { get; set; }
}


