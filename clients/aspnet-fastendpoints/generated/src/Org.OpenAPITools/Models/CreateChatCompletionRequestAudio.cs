namespace Org.OpenAPITools.Models;


/// <summary>
/// Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
/// </summary>
public class CreateChatCompletionRequestAudio 
{
    
    /// <summary>
    /// The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
    /// </summary>
    /// <value>The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). </value>
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
    /// Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
    /// </summary>
    /// <value>Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. </value>
    public enum FormatEnum
    {
        
        /// <summary>
        /// Enum WavEnum for wav
        /// </summary>
        WavEnum = 1,
        
        /// <summary>
        /// Enum Mp3Enum for mp3
        /// </summary>
        Mp3Enum = 2,
        
        /// <summary>
        /// Enum FlacEnum for flac
        /// </summary>
        FlacEnum = 3,
        
        /// <summary>
        /// Enum OpusEnum for opus
        /// </summary>
        OpusEnum = 4,
        
        /// <summary>
        /// Enum Pcm16Enum for pcm16
        /// </summary>
        Pcm16Enum = 5
    }

    public FormatEnum Format { get; set; }
}


