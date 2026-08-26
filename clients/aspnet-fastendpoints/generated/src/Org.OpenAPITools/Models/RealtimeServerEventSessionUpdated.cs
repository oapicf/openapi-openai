namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
/// </summary>
public class RealtimeServerEventSessionUpdated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `session.updated`.
    /// </summary>
    /// <value>The event type, must be `session.updated`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum SessionUpdatedEnum for session.updated
        /// </summary>
        SessionUpdatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeSession Session { get; set; }
}


