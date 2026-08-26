namespace Org.OpenAPITools.Models;


/// <summary>
/// A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
/// </summary>
public class RealtimeSessionCreateResponse 
{
    public RealtimeSessionCreateResponseClientSecret ClientSecret { get; set; }
    public List<RealtimeSessionCreateResponse.ModalitiesEnum> Modalities { get; set; }
    public string Instructions { get; set; }
    
    /// <summary>
    /// The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
    /// </summary>
    /// <value>The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. </value>
    public enum VoiceEnum
    {
        
        /// <summary>
        /// Enum AlloyEnum for alloy
        /// </summary>
        AlloyEnum = 1,
        
        /// <summary>
        /// Enum AshEnum for ash
        /// </summary>
        AshEnum = 2,
        
        /// <summary>
        /// Enum BalladEnum for ballad
        /// </summary>
        BalladEnum = 3,
        
        /// <summary>
        /// Enum CoralEnum for coral
        /// </summary>
        CoralEnum = 4,
        
        /// <summary>
        /// Enum EchoEnum for echo
        /// </summary>
        EchoEnum = 5,
        
        /// <summary>
        /// Enum SageEnum for sage
        /// </summary>
        SageEnum = 6,
        
        /// <summary>
        /// Enum ShimmerEnum for shimmer
        /// </summary>
        ShimmerEnum = 7,
        
        /// <summary>
        /// Enum VerseEnum for verse
        /// </summary>
        VerseEnum = 8
    }

    public VoiceEnum Voice { get; set; }
    public string InputAudioFormat { get; set; }
    public string OutputAudioFormat { get; set; }
    public RealtimeSessionInputAudioTranscription InputAudioTranscription { get; set; }
    public RealtimeSessionCreateResponseTurnDetection TurnDetection { get; set; }
    public List<RealtimeResponseCreateParamsToolsInner> Tools { get; set; }
    public string ToolChoice { get; set; }
    public decimal Temperature { get; set; }
    public RealtimeResponseCreateParamsMaxResponseOutputTokens MaxResponseOutputTokens { get; set; }
}


