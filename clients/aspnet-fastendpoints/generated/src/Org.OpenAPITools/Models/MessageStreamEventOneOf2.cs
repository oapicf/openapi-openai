namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
/// </summary>
public class MessageStreamEventOneOf2 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageDeltaEnum for thread.message.delta
        /// </summary>
        ThreadMessageDeltaEnum = 1
    }

    public EventEnum Event { get; set; }
    public MessageDeltaObject Data { get; set; }
}


