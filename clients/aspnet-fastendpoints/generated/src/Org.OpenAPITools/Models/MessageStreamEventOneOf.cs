namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [message](/docs/api-reference/messages/object) is created.
/// </summary>
public class MessageStreamEventOneOf 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageCreatedEnum for thread.message.created
        /// </summary>
        ThreadMessageCreatedEnum = 1
    }

    public EventEnum Event { get; set; }
    public MessageObject Data { get; set; }
}


