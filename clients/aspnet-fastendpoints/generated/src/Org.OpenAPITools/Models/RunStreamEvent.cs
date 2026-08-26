namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStreamEvent 
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


