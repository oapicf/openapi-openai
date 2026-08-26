namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) is completed.
/// </summary>
public class RunStreamEventOneOf4 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunCompletedEnum for thread.run.completed
        /// </summary>
        ThreadRunCompletedEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


