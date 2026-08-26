namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a new [thread](/docs/api-reference/threads/object) is created.
/// </summary>
public class ThreadStreamEvent 
{
    public bool Enabled { get; set; }
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadCreatedEnum for thread.created
        /// </summary>
        ThreadCreatedEnum = 1
    }

    public EventEnum Event { get; set; }
    public ThreadObject Data { get; set; }
}


