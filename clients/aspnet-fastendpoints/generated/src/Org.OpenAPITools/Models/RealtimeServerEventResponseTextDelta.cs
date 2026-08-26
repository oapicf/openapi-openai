namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the text value of a \&quot;text\&quot; content part is updated.
/// </summary>
public class RealtimeServerEventResponseTextDelta 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.text.delta`.
    /// </summary>
    /// <value>The event type, must be `response.text.delta`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseTextDeltaEnum for response.text.delta
        /// </summary>
        ResponseTextDeltaEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public string Delta { get; set; }
}


