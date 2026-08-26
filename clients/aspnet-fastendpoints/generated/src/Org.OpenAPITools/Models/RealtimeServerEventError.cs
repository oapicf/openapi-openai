namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
/// </summary>
public class RealtimeServerEventError 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `error`.
    /// </summary>
    /// <value>The event type, must be `error`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ErrorEnum for error
        /// </summary>
        ErrorEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeServerEventErrorError Error { get; set; }
}


