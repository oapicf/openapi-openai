namespace Org.OpenAPITools.Models;


/// <summary>
/// If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). 
/// </summary>
public class ChatCompletionResponseMessageAudio 
{
    public string Id { get; set; }
    public int ExpiresAt { get; set; }
    public string Data { get; set; }
    public string Transcript { get; set; }
}


