namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
/// </summary>
public class RealtimeServerEventResponseOutputItemDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.output_item.done`.
    /// </summary>
    /// <value>The event type, must be `response.output_item.done`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseOutputItemDoneEnum for response.output_item.done
        /// </summary>
        ResponseOutputItemDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public int OutputIndex { get; set; }
    public RealtimeConversationItem Item { get; set; }
}


