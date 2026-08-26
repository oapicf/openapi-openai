namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateTranslationResponseVerboseJson 
{
    public string Language { get; set; }
    public string Duration { get; set; }
    public string Text { get; set; }
    public List<TranscriptionSegment> Segments { get; set; }
}


