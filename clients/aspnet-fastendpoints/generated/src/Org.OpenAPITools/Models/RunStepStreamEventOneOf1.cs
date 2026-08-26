namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an &#x60;in_progress&#x60; state.
/// </summary>
public class RunStepStreamEventOneOf1 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepInProgressEnum for thread.run.step.in_progress
        /// </summary>
        ThreadRunStepInProgressEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunStepObject Data { get; set; }
}


