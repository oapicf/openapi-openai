namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
/// </summary>
public class MessageStreamEventOneOf1 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageInProgressEnum for thread.message.in_progress
        /// </summary>
        ThreadMessageInProgressEnum = 1
    }

    public EventEnum Event { get; set; }
    public MessageObject Data { get; set; }
}


