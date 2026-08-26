namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the model-generated audio is updated.
/// </summary>
public class RealtimeServerEventResponseAudioDelta 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.audio.delta`.
    /// </summary>
    /// <value>The event type, must be `response.audio.delta`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseAudioDeltaEnum for response.audio.delta
        /// </summary>
        ResponseAudioDeltaEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public string Delta { get; set; }
}


