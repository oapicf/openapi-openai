namespace Org.OpenAPITools.Models;


/// <summary>
/// This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only. 
/// </summary>
public class RealtimeClientEventResponseCreate 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.create`.
    /// </summary>
    /// <value>The event type, must be `response.create`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseCreateEnum for response.create
        /// </summary>
        ResponseCreateEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RealtimeResponseCreateParams Response { get; set; }
}


