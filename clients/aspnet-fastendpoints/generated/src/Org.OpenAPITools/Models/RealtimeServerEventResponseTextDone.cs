namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the text value of a \&quot;text\&quot; content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
/// </summary>
public class RealtimeServerEventResponseTextDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.text.done`.
    /// </summary>
    /// <value>The event type, must be `response.text.done`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseTextDoneEnum for response.text.done
        /// </summary>
        ResponseTextDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public string Text { get; set; }
}


