namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a message delta i.e. any changed fields on a message during streaming. 
/// </summary>
public class MessageDeltaObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `thread.message.delta`.
    /// </summary>
    /// <value>The object type, which is always `thread.message.delta`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageDeltaEnum for thread.message.delta
        /// </summary>
        ThreadMessageDeltaEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public MessageDeltaObjectDelta Delta { get; set; }
}


