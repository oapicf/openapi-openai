namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepStreamEvent 
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


