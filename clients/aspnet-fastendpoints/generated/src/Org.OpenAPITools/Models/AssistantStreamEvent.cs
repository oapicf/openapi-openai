namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
/// </summary>
public class AssistantStreamEvent 
{
    public bool Enabled { get; set; }
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum DoneEnum for done
        /// </summary>
        DoneEnum = 1
    }

    public EventEnum Event { get; set; }
    
    /// <summary>
    /// Gets or Sets Data
    /// </summary>
    public enum DataEnum
    {
        
        /// <summary>
        /// Enum DONEEnum for [DONE]
        /// </summary>
        DONEEnum = 1
    }

    public DataEnum Data { get; set; }
}


