namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
/// </summary>
public class RealtimeServerEventResponseFunctionCallArgumentsDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.function_call_arguments.done`. 
    /// </summary>
    /// <value>The event type, must be `response.function_call_arguments.done`. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseFunctionCallArgumentsDoneEnum for response.function_call_arguments.done
        /// </summary>
        ResponseFunctionCallArgumentsDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public string CallId { get; set; }
    public string Arguments { get; set; }
}


