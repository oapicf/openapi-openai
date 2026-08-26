namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
/// </summary>
public class RunStepStreamEventOneOf2 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepDeltaEnum for thread.run.step.delta
        /// </summary>
        ThreadRunStepDeltaEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunStepDeltaObject Data { get; set; }
}


