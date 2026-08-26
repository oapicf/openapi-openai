namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateSpeechRequest 
{
    public CreateSpeechRequestModel Model { get; set; }
    public string Input { get; set; }
    
    /// <summary>
    /// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
    /// </summary>
    /// <value>The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).</value>
    public enum VoiceEnum
    {
        
        /// <summary>
        /// Enum AlloyEnum for alloy
        /// </summary>
        AlloyEnum = 1,
        
        /// <summary>
        /// Enum EchoEnum for echo
        /// </summary>
        EchoEnum = 2,
        
        /// <summary>
        /// Enum FableEnum for fable
        /// </summary>
        FableEnum = 3,
        
        /// <summary>
        /// Enum OnyxEnum for onyx
        /// </summary>
        OnyxEnum = 4,
        
        /// <summary>
        /// Enum NovaEnum for nova
        /// </summary>
        NovaEnum = 5,
        
        /// <summary>
        /// Enum ShimmerEnum for shimmer
        /// </summary>
        ShimmerEnum = 6
    }

    public VoiceEnum Voice { get; set; }
    
    /// <summary>
    /// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
    /// </summary>
    /// <value>The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.</value>
    public enum ResponseFormatEnum
    {
        
        /// <summary>
        /// Enum Mp3Enum for mp3
        /// </summary>
        Mp3Enum = 1,
        
        /// <summary>
        /// Enum OpusEnum for opus
        /// </summary>
        OpusEnum = 2,
        
        /// <summary>
        /// Enum AacEnum for aac
        /// </summary>
        AacEnum = 3,
        
        /// <summary>
        /// Enum FlacEnum for flac
        /// </summary>
        FlacEnum = 4,
        
        /// <summary>
        /// Enum WavEnum for wav
        /// </summary>
        WavEnum = 5,
        
        /// <summary>
        /// Enum PcmEnum for pcm
        /// </summary>
        PcmEnum = 6
    }

    public ResponseFormatEnum ResponseFormat { get; set; } = ResponseFormatEnum.Mp3Enum;
    public decimal Speed { get; set; } = 1M;
}


