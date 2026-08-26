namespace Org.OpenAPITools.Models;


/// <summary>
/// Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
/// </summary>
public class RealtimeClientEventSessionUpdate 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `session.update`.
    /// </summary>
    /// <value>The event type, must be `session.update`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum SessionUpdateEnum for session.update
        /// </summary>
        SessionUpdateEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeSessionCreateRequest Session { get; set; }
}


