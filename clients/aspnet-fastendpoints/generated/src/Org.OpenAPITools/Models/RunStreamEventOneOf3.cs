namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
/// </summary>
public class RunStreamEventOneOf3 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadRunRequiresActionEnum for thread.run.requires_action
        /// </summary>
        ThreadRunRequiresActionEnum = 1
    }

    public EventEnum Event { get; set; }
    public RunObject Data { get; set; }
}


