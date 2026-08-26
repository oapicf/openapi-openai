namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TranscriptionSegment 
{
    public int Id { get; set; }
    public int Seek { get; set; }
    public float Start { get; set; }
    public float End { get; set; }
    public string Text { get; set; }
    public List<int> Tokens { get; set; }
    public float Temperature { get; set; }
    public float AvgLogprob { get; set; }
    public float CompressionRatio { get; set; }
    public float NoSpeechProb { get; set; }
}


