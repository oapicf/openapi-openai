namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
/// </summary>
public class RealtimeServerEventResponseAudioTranscriptDone 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.audio_transcript.done`.
    /// </summary>
    /// <value>The event type, must be `response.audio_transcript.done`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseAudioTranscriptDoneEnum for response.audio_transcript.done
        /// </summary>
        ResponseAudioTranscriptDoneEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public string Transcript { get; set; }
}


