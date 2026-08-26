namespace Org.OpenAPITools.Models;


/// <summary>
/// Realtime session object configuration.
/// </summary>
public class RealtimeSessionCreateRequest 
{
    public List<RealtimeSessionCreateRequest.ModalitiesEnum> Modalities { get; set; }
    
    /// <summary>
    /// The Realtime model used for this session. 
    /// </summary>
    /// <value>The Realtime model used for this session. </value>
    public enum ModelEnum
    {
        
        /// <summary>
        /// Enum Gpt4oRealtimePreviewEnum for gpt-4o-realtime-preview
        /// </summary>
        Gpt4oRealtimePreviewEnum = 1,
        
        /// <summary>
        /// Enum Gpt4oRealtimePreview20241001Enum for gpt-4o-realtime-preview-2024-10-01
        /// </summary>
        Gpt4oRealtimePreview20241001Enum = 2,
        
        /// <summary>
        /// Enum Gpt4oRealtimePreview20241217Enum for gpt-4o-realtime-preview-2024-12-17
        /// </summary>
        Gpt4oRealtimePreview20241217Enum = 3,
        
        /// <summary>
        /// Enum Gpt4oMiniRealtimePreviewEnum for gpt-4o-mini-realtime-preview
        /// </summary>
        Gpt4oMiniRealtimePreviewEnum = 4,
        
        /// <summary>
        /// Enum Gpt4oMiniRealtimePreview20241217Enum for gpt-4o-mini-realtime-preview-2024-12-17
        /// </summary>
        Gpt4oMiniRealtimePreview20241217Enum = 5
    }

    public ModelEnum Model { get; set; }
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
    
    /// <summary>
    /// The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    /// </summary>
    /// <value>The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. </value>
    public enum InputAudioFormatEnum
    {
        
        /// <summary>
        /// Enum Pcm16Enum for pcm16
        /// </summary>
        Pcm16Enum = 1,
        
        /// <summary>
        /// Enum G711UlawEnum for g711_ulaw
        /// </summary>
        G711UlawEnum = 2,
        
        /// <summary>
        /// Enum G711AlawEnum for g711_alaw
        /// </summary>
        G711AlawEnum = 3
    }

    public InputAudioFormatEnum InputAudioFormat { get; set; }
    
    /// <summary>
    /// The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
    /// </summary>
    /// <value>The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. </value>
    public enum OutputAudioFormatEnum
    {
        
        /// <summary>
        /// Enum Pcm16Enum for pcm16
        /// </summary>
        Pcm16Enum = 1,
        
        /// <summary>
        /// Enum G711UlawEnum for g711_ulaw
        /// </summary>
        G711UlawEnum = 2,
        
        /// <summary>
        /// Enum G711AlawEnum for g711_alaw
        /// </summary>
        G711AlawEnum = 3
    }

    public OutputAudioFormatEnum OutputAudioFormat { get; set; }
    public RealtimeSessionInputAudioTranscription InputAudioTranscription { get; set; }
    public RealtimeSessionCreateRequestTurnDetection TurnDetection { get; set; }
    public List<RealtimeResponseCreateParamsToolsInner> Tools { get; set; }
    public string ToolChoice { get; set; }
    public decimal Temperature { get; set; }
    public RealtimeResponseCreateParamsMaxResponseOutputTokens MaxResponseOutputTokens { get; set; }
}


