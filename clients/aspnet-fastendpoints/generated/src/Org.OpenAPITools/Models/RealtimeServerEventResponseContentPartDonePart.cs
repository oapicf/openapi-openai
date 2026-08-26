namespace Org.OpenAPITools.Models;


/// <summary>
/// The content part that is done.
/// </summary>
public class RealtimeServerEventResponseContentPartDonePart 
{
    
    /// <summary>
    /// The content type (\"text\", \"audio\").
    /// </summary>
    /// <value>The content type (\"text\", \"audio\").</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum AudioEnum for audio
        /// </summary>
        AudioEnum = 1,
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 2
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public string Audio { get; set; }
    public string Transcript { get; set; }
}


