namespace Org.OpenAPITools.Models;


/// <summary>
/// The delta containing the fields that have changed on the Message.
/// </summary>
public class MessageDeltaObjectDelta 
{
    
    /// <summary>
    /// The entity that produced the message. One of `user` or `assistant`.
    /// </summary>
    /// <value>The entity that produced the message. One of `user` or `assistant`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum UserEnum for user
        /// </summary>
        UserEnum = 1,
        
        /// <summary>
        /// Enum AssistantEnum for assistant
        /// </summary>
        AssistantEnum = 2
    }

    public RoleEnum Role { get; set; }
    public List<MessageDeltaObjectDeltaContentInner> Content { get; set; }
}


