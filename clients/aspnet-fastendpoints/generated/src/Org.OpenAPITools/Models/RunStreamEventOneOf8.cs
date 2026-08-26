namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
/// </summary>
public class RunStreamEventOneOf8 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunCancelledEnum for thread.run.cancelled
        /// </summary>
        ThreadRunCancelledEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


