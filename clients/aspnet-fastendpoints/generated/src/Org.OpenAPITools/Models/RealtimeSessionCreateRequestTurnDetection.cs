namespace Org.OpenAPITools.Models;


/// <summary>
/// Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
/// </summary>
public class RealtimeSessionCreateRequestTurnDetection 
{
    public string Type { get; set; }
    public decimal Threshold { get; set; }
    public int PrefixPaddingMs { get; set; }
    public int SilenceDurationMs { get; set; }
    public bool CreateResponse { get; set; } = true;
}


