namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a new [run](/docs/api-reference/runs/object) is created.
/// </summary>
public class RunStreamEventOneOf 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunCreatedEnum for thread.run.created
        /// </summary>
        ThreadRunCreatedEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


