namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event when you want to remove any item from the conversation  history. The server will respond with a &#x60;conversation.item.deleted&#x60; event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
/// </summary>
public class RealtimeClientEventConversationItemDelete 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.delete`.
    /// </summary>
    /// <value>The event type, must be `conversation.item.delete`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemDeleteEnum for conversation.item.delete
        /// </summary>
        ConversationItemDeleteEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ItemId { get; set; }
}


