namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateTranscription200Response 
{
    public string Text { get; set; }
    public string Language { get; set; }
    public string Duration { get; set; }
    public List<TranscriptionWord> Words { get; set; }
    public List<TranscriptionSegment> Segments { get; set; }
}


