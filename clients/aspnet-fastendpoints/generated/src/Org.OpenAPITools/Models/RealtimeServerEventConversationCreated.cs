namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a conversation is created. Emitted right after session creation. 
/// </summary>
public class RealtimeServerEventConversationCreated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.created`.
    /// </summary>
    /// <value>The event type, must be `conversation.created`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationCreatedEnum for conversation.created
        /// </summary>
        ConversationCreatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeServerEventConversationCreatedConversation Conversation { get; set; }
}


