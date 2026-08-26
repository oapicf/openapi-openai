namespace Org.OpenAPITools.Models;


/// <summary>
/// Configuration for input audio transcription, defaults to off and can be  set to &#x60;null&#x60; to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
/// </summary>
public class RealtimeSessionInputAudioTranscription 
{
    public string Model { get; set; }
}


