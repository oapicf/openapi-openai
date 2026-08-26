namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MessageStreamEvent 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageIncompleteEnum for thread.message.incomplete
        /// </summary>
        ThreadMessageIncompleteEnum = 1
    }

    public EventEnum Event { get; set; }
    public MessageObject Data { get; set; }
}


