namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
/// </summary>
public class RealtimeServerEventConversationItemCreated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.created`.
    /// </summary>
    /// <value>The event type, must be `conversation.item.created`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemCreatedEnum for conversation.item.created
        /// </summary>
        ConversationItemCreatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string PreviousItemId { get; set; }
    public RealtimeConversationItem Item { get; set; }
}


