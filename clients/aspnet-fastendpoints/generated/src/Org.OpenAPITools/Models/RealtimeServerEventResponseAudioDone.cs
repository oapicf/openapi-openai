namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
/// </summary>
public class RealtimeServerEventResponseAudioDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.audio.done`.
    /// </summary>
    /// <value>The event type, must be `response.audio.done`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseAudioDoneEnum for response.audio.done
        /// </summary>
        ResponseAudioDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
}


