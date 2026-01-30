# AudioApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.



## createSpeech

Generates audio from the input text.

### Example

```bash
 createSpeech
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpeechRequest** | [**CreateSpeechRequest**](CreateSpeechRequest.md) |  |

### Return type

**binary**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createTranscription

Transcribes audio into the input language.

### Example

```bash
 createTranscription
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **binary** | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. | [default to null]
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | [default to null]
 **language** | **string** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. | [optional] [default to null]
 **prompt** | **string** | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. | [optional] [default to null]
 **responseFormat** | [**AudioResponseFormat**](AudioResponseFormat.md) |  | [optional] [default to null]
 **temperature** | **integer** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0]
 **timestampGranularitiesLeft_Square_BracketRight_Square_Bracket** | [**array[string]**](string.md) | The timestamp granularities to populate for this transcription. 'response_format' must be set 'verbose_json' to use timestamp granularities. Either or both of these options are supported: 'word', or 'segment'. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. | [optional] [default to null]

### Return type

[**CreateTranscription200Response**](CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createTranslation

Translates audio into English.

### Example

```bash
 createTranslation
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **binary** | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. | [default to null]
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | [default to null]
 **prompt** | **string** | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. | [optional] [default to null]
 **responseFormat** | [**AudioResponseFormat**](AudioResponseFormat.md) |  | [optional] [default to null]
 **temperature** | **integer** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0]

### Return type

[**CreateTranslation200Response**](CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

