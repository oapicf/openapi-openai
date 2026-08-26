namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
/// </summary>
public class RealtimeServerEventConversationItemDeleted 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.deleted`.
    /// </summary>
    /// <value>The event type, must be `conversation.item.deleted`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemDeletedEnum for conversation.item.deleted
        /// </summary>
        ConversationItemDeletedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ItemId { get; set; }
}


