namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a message within a [thread](/docs/api-reference/threads).
/// </summary>
public class MessageObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `thread.message`.
    /// </summary>
    /// <value>The object type, which is always `thread.message`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageEnum for thread.message
        /// </summary>
        ThreadMessageEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public string ThreadId { get; set; }
    
    /// <summary>
    /// The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
    /// </summary>
    /// <value>The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum InProgressEnum for in_progress
        /// </summary>
        InProgressEnum = 1,
        
        /// <summary>
        /// Enum IncompleteEnum for incomplete
        /// </summary>
        IncompleteEnum = 2,
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 3
    }

    public StatusEnum Status { get; set; }
    public MessageObjectIncompleteDetails IncompleteDetails { get; set; }
    public int CompletedAt { get; set; }
    public int IncompleteAt { get; set; }
    
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
    public List<MessageObjectContentInner> Content { get; set; }
    public string AssistantId { get; set; }
    public string RunId { get; set; }
    public List<CreateMessageRequestAttachmentsInner> Attachments { get; set; }
    public Object Metadata { get; set; }
}


