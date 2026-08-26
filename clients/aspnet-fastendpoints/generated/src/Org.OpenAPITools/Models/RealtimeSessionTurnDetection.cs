namespace Org.OpenAPITools.Models;


/// <summary>
/// Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
/// </summary>
public class RealtimeSessionTurnDetection 
{
    
    /// <summary>
    /// Type of turn detection, only `server_vad` is currently supported. 
    /// </summary>
    /// <value>Type of turn detection, only `server_vad` is currently supported. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ServerVadEnum for server_vad
        /// </summary>
        ServerVadEnum = 1
    }

    public TypeEnum Type { get; set; }
    public decimal Threshold { get; set; }
    public int PrefixPaddingMs { get; set; }
    public int SilenceDurationMs { get; set; }
}


