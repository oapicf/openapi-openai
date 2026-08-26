using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Generates audio from the input text.
/// </summary>

public class CreateSpeechEndpoint : FastEndpoints.Endpoint<CreateSpeechRequest, System.IO.Stream>
{
    public override void Configure()
    {
        Post("/v1/audio/speech");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Audio");
        });

        Summary(s => {
            s.Summary = "Generates audio from the input text.";
            s.RequestParam(r => r.createSpeechRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateSpeechRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Transcribes audio into the input language.
/// </summary>

public class CreateTranscriptionEndpoint : FastEndpoints.Endpoint<CreateTranscriptionRequest, CreateTranscription200Response>
{
    public override void Configure()
    {
        Post("/v1/audio/transcriptions");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Audio");
        });

        Summary(s => {
            s.Summary = "Transcribes audio into the input language.";
            s.RequestParam(r => r.File, "The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ");
            s.RequestParam(r => r.Model, "");
            s.RequestParam(r => r.Language, "The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ");
            s.RequestParam(r => r.Prompt, "An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. ");
            s.RequestParam(r => r.ResponseFormat, "");
            s.RequestParam(r => r.Temperature, "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ");
            s.RequestParam(r => r.TimestampGranularities, "The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateTranscriptionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Translates audio into English.
/// </summary>

public class CreateTranslationEndpoint : FastEndpoints.Endpoint<CreateTranslationRequest, CreateTranslation200Response>
{
    public override void Configure()
    {
        Post("/v1/audio/translations");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Audio");
        });

        Summary(s => {
            s.Summary = "Translates audio into English.";
            s.RequestParam(r => r.File, "The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. ");
            s.RequestParam(r => r.Model, "");
            s.RequestParam(r => r.Prompt, "An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. ");
            s.RequestParam(r => r.ResponseFormat, "");
            s.RequestParam(r => r.Temperature, "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateTranslationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

