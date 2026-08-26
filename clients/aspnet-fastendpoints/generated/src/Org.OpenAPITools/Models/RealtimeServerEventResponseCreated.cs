namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a new Response is created. The first event of response creation, where the response is in an initial state of &#x60;in_progress&#x60;. 
/// </summary>
public class RealtimeServerEventResponseCreated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.created`.
    /// </summary>
    /// <value>The event type, must be `response.created`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseCreatedEnum for response.created
        /// </summary>
        ResponseCreatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeResponse Response { get; set; }
}


