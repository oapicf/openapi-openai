namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the model-generated function call arguments are updated. 
/// </summary>
public class RealtimeServerEventResponseFunctionCallArgumentsDelta 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.function_call_arguments.delta`. 
    /// </summary>
    /// <value>The event type, must be `response.function_call_arguments.delta`. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseFunctionCallArgumentsDeltaEnum for response.function_call_arguments.delta
        /// </summary>
        ResponseFunctionCallArgumentsDeltaEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public string CallId { get; set; }
    public string Delta { get; set; }
}


