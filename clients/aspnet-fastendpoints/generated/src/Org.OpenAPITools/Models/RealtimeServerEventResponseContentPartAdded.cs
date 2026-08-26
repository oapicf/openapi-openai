namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a new content part is added to an assistant message item during response generation. 
/// </summary>
public class RealtimeServerEventResponseContentPartAdded 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.content_part.added`.
    /// </summary>
    /// <value>The event type, must be `response.content_part.added`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseContentPartAddedEnum for response.content_part.added
        /// </summary>
        ResponseContentPartAddedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public RealtimeServerEventResponseContentPartAddedPart Part { get; set; }
}


