
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateSpeechRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateSpeechRequest createSpeechRequest { get; set; }
}
public class CreateTranscriptionRequest
{
    /// <summary>
    /// The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    /// </summary>
    [FastEndpoints.BindFrom("file")]
    public System.IO.Stream File { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("model")]
    public CreateTranscriptionRequestModel Model { get; set; }
    /// <summary>
    /// The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
    /// </summary>
    [FastEndpoints.BindFrom("language")]
    public string? Language { get; set; }
    /// <summary>
    /// An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
    /// </summary>
    [FastEndpoints.BindFrom("prompt")]
    public string? Prompt { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("response_format")]
    public AudioResponseFormat ResponseFormat { get; set; }
    /// <summary>
    /// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    /// </summary>
    [FastEndpoints.BindFrom("temperature")]
    public decimal? Temperature { get; set; }
    /// <summary>
    /// The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
    /// </summary>
    [FastEndpoints.BindFrom("timestamp_granularities[]")]
    public List<string>? TimestampGranularities { get; set; }
}
public class CreateTranslationRequest
{
    /// <summary>
    /// The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    /// </summary>
    [FastEndpoints.BindFrom("file")]
    public System.IO.Stream File { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("model")]
    public CreateTranscriptionRequestModel Model { get; set; }
    /// <summary>
    /// An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
    /// </summary>
    [FastEndpoints.BindFrom("prompt")]
    public string? Prompt { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("response_format")]
    public AudioResponseFormat ResponseFormat { get; set; }
    /// <summary>
    /// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    /// </summary>
    [FastEndpoints.BindFrom("temperature")]
    public decimal? Temperature { get; set; }
}


