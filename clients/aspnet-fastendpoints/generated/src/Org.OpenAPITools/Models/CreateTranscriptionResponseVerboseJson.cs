namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a verbose json transcription response returned by model, based on the provided input.
/// </summary>
public class CreateTranscriptionResponseVerboseJson 
{
    public string Language { get; set; }
    public string Duration { get; set; }
    public string Text { get; set; }
    public List<TranscriptionWord> Words { get; set; }
    public List<TranscriptionSegment> Segments { get; set; }
}


