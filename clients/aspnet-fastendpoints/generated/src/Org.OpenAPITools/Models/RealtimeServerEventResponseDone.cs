namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data. 
/// </summary>
public class RealtimeServerEventResponseDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.done`.
    /// </summary>
    /// <value>The event type, must be `response.done`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseDoneEnum for response.done
        /// </summary>
        ResponseDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeResponse Response { get; set; }
}


