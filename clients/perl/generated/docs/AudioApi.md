# WWW::OpenAPIClient::AudioApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AudioApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_speech**](AudioApi.md#create_speech) | **POST** /audio/speech | Generates audio from the input text.
[**create_transcription**](AudioApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](AudioApi.md#create_translation) | **POST** /audio/translations | Translates audio into English.


# **create_speech**
> string create_speech(create_speech_request => $create_speech_request)

Generates audio from the input text.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudioApi;
my $api_instance = WWW::OpenAPIClient::AudioApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_speech_request = WWW::OpenAPIClient::Object::CreateSpeechRequest->new(); # CreateSpeechRequest | 

eval {
    my $result = $api_instance->create_speech(create_speech_request => $create_speech_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudioApi->create_speech: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_speech_request** | [**CreateSpeechRequest**](CreateSpeechRequest.md)|  | 

### Return type

**string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transcription**
> CreateTranscription200Response create_transcription(file => $file, model => $model, language => $language, prompt => $prompt, response_format => $response_format, temperature => $temperature, timestamp_granularities[] => $timestamp_granularities[])

Transcribes audio into the input language.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudioApi;
my $api_instance = WWW::OpenAPIClient::AudioApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file = "/path/to/file"; # string | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
my $model = new WWW::OpenAPIClient.CreateTranscriptionRequestModel(); # CreateTranscriptionRequestModel | 
my $language = "language_example"; # string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
my $prompt = "prompt_example"; # string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
my $response_format = new WWW::OpenAPIClient.AudioResponseFormat(); # AudioResponseFormat | 
my $temperature = 0; # double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
my $timestamp_granularities[] = [("null")]; # ARRAY[string] | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 

eval {
    my $result = $api_instance->create_transcription(file => $file, model => $model, language => $language, prompt => $prompt, response_format => $response_format, temperature => $temperature, timestamp_granularities[] => $timestamp_granularities[]);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudioApi->create_transcription: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **string****string**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **language** | **string**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional] 
 **response_format** | [**AudioResponseFormat**](AudioResponseFormat.md)|  | [optional] 
 **temperature** | **double**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **timestamp_granularities[]** | [**ARRAY[string]**](string.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] 

### Return type

[**CreateTranscription200Response**](CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_translation**
> CreateTranslation200Response create_translation(file => $file, model => $model, prompt => $prompt, response_format => $response_format, temperature => $temperature)

Translates audio into English.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudioApi;
my $api_instance = WWW::OpenAPIClient::AudioApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file = "/path/to/file"; # string | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
my $model = new WWW::OpenAPIClient.CreateTranscriptionRequestModel(); # CreateTranscriptionRequestModel | 
my $prompt = "prompt_example"; # string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
my $response_format = new WWW::OpenAPIClient.AudioResponseFormat(); # AudioResponseFormat | 
my $temperature = 0; # double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 

eval {
    my $result = $api_instance->create_translation(file => $file, model => $model, prompt => $prompt, response_format => $response_format, temperature => $temperature);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudioApi->create_translation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **string****string**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional] 
 **response_format** | [**AudioResponseFormat**](AudioResponseFormat.md)|  | [optional] 
 **temperature** | **double**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslation200Response**](CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

