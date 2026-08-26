namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
/// </summary>
public class RunStreamEventOneOf1 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunQueuedEnum for thread.run.queued
        /// </summary>
        ThreadRunQueuedEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


