namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
/// </summary>
public class RealtimeServerEventSessionCreated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `session.created`.
    /// </summary>
    /// <value>The event type, must be `session.created`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum SessionCreatedEnum for session.created
        /// </summary>
        SessionCreatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeSession Session { get; set; }
}


