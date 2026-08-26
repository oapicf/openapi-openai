namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) fails.
/// </summary>
public class RunStreamEventOneOf6 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunFailedEnum for thread.run.failed
        /// </summary>
        ThreadRunFailedEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


