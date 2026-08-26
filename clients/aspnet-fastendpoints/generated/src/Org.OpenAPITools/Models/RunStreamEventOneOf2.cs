namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
/// </summary>
public class RunStreamEventOneOf2 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunInProgressEnum for thread.run.in_progress
        /// </summary>
        ThreadRunInProgressEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


