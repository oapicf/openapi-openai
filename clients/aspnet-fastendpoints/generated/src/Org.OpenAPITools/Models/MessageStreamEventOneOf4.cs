namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
/// </summary>
public class MessageStreamEventOneOf4 
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


