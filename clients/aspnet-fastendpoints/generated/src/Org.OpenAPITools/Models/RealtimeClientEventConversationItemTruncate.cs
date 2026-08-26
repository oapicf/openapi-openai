namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
/// </summary>
public class RealtimeClientEventConversationItemTruncate 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `conversation.item.truncate`.
    /// </summary>
    /// <value>The event type, must be `conversation.item.truncate`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ConversationItemTruncateEnum for conversation.item.truncate
        /// </summary>
        ConversationItemTruncateEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ItemId { get; set; }
    public int ContentIndex { get; set; }
    public int AudioEndMs { get; set; }
}


