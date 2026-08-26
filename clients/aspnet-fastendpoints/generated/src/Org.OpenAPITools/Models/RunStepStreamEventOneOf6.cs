namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
/// </summary>
public class RunStepStreamEventOneOf6 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepExpiredEnum for thread.run.step.expired
        /// </summary>
        ThreadRunStepExpiredEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunStepObject Data { get; set; }
}


