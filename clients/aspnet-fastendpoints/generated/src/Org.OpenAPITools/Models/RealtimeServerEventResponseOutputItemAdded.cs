namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a new Item is created during Response generation.
/// </summary>
public class RealtimeServerEventResponseOutputItemAdded 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.output_item.added`.
    /// </summary>
    /// <value>The event type, must be `response.output_item.added`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseOutputItemAddedEnum for response.output_item.added
        /// </summary>
        ResponseOutputItemAddedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public int OutputIndex { get; set; }
    public RealtimeConversationItem Item { get; set; }
}


