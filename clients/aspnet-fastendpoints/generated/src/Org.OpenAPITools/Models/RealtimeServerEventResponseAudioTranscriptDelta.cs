namespace Org.OpenAPITools.Models;


/// <summary>
/// Returned when the model-generated transcription of audio output is updated. 
/// </summary>
public class RealtimeServerEventResponseAudioTranscriptDelta 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `response.audio_transcript.delta`.
    /// </summary>
    /// <value>The event type, must be `response.audio_transcript.delta`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ResponseAudioTranscriptDeltaEnum for response.audio_transcript.delta
        /// </summary>
        ResponseAudioTranscriptDeltaEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string ResponseId { get; set; }
    public string ItemId { get; set; }
    public int OutputIndex { get; set; }
    public int ContentIndex { get; set; }
    public string Delta { get; set; }
}


