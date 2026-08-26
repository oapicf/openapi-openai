namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
/// </summary>
public class RunStreamEventOneOf7 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunCancellingEnum for thread.run.cancelling
        /// </summary>
        ThreadRunCancellingEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


