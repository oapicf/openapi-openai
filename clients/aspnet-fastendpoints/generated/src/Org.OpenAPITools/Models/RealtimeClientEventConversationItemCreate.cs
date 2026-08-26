namespace Org.OpenAPITools.Models;


/// <summary>
/// Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent. 
/// </summary>
public class RealtimeClientEventConversationItemCreate 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.create`.
    /// </summary>
    /// <value>The event type, must be `conversation.item.create`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemCreateEnum for conversation.item.create
        /// </summary>
        ConversationItemCreateEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string PreviousItemId { get; set; }
    public RealtimeConversationItem Item { get; set; }
}


