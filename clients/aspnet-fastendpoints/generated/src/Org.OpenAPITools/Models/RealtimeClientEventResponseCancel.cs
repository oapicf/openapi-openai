namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
/// </summary>
public class RealtimeClientEventResponseCancel 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.cancel`.
    /// </summary>
    /// <value>The event type, must be `response.cancel`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseCancelEnum for response.cancel
        /// </summary>
        ResponseCancelEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
}


