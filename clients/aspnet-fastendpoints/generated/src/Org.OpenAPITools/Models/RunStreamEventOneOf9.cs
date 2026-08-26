namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) expires.
/// </summary>
public class RunStreamEventOneOf9 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunExpiredEnum for thread.run.expired
        /// </summary>
        ThreadRunExpiredEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


