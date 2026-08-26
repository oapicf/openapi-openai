namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) ends with status &#x60;incomplete&#x60;.
/// </summary>
public class RunStreamEventOneOf5 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunIncompleteEnum for thread.run.incomplete
        /// </summary>
        ThreadRunIncompleteEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


