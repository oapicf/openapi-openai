namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when an earlier assistant audio message item is truncated by the  client with a &#x60;conversation.item.truncate&#x60; event. This event is used to  synchronize the server&#39;s understanding of the audio with the client&#39;s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn&#39;t been heard by the user. 
/// </summary>
public class RealtimeServerEventConversationItemTruncated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.truncated`.
    /// </summary>
    /// <value>The event type, must be `conversation.item.truncated`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemTruncatedEnum for conversation.item.truncated
        /// </summary>
        ConversationItemTruncatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ItemId { get; set; }
    public int ContentIndex { get; set; }
    public int AudioEndMs { get; set; }
}


