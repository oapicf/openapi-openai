namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
/// </summary>
public class RealtimeServerEventResponseContentPartDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.content_part.done`.
    /// </summary>
    /// <value>The event type, must be `response.content_part.done`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseContentPartDoneEnum for response.content_part.done
        /// </summary>
        ResponseContentPartDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public RealtimeServerEventResponseContentPartDonePart Part { get; set; }
}


