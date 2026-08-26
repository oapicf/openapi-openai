namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [message](/docs/api-reference/messages/object) is completed.
/// </summary>
public class MessageStreamEventOneOf3 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageCompletedEnum for thread.message.completed
        /// </summary>
        ThreadMessageCompletedEnum = 1
    }

    public EventEnum Event { get; set; }
    public MessageObject Data { get; set; }
}


