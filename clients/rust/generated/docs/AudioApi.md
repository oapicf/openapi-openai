# \AudioApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_speech**](AudioApi.md#create_speech) | **POST** /audio/speech | Generates audio from the input text.
[**create_transcription**](AudioApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](AudioApi.md#create_translation) | **POST** /audio/translations | Translates audio into English.



## create_speech

> std::path::PathBuf create_speech(create_speech_request)
Generates audio from the input text.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_speech_request** | [**CreateSpeechRequest**](CreateSpeechRequest.md) |  | [required] |

### Return type

[**std::path::PathBuf**](std::path::PathBuf.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_transcription

> models::CreateTranscription200Response create_transcription(file, model, language, prompt, response_format, temperature, timestamp_granularities_left_square_bracket_right_square_bracket)
Transcribes audio into the input language.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file** | **std::path::PathBuf** | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [required] |
**model** | [**models::CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md) |  | [required] |
**language** | Option<**String**> | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  |  |
**prompt** | Option<**String**> | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  |  |
**response_format** | Option<[**models::AudioResponseFormat**](AudioResponseFormat.md)> |  |  |
**temperature** | Option<**f64**> | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  |  |[default to 0]
**timestamp_granularities_left_square_bracket_right_square_bracket** | Option<[**Vec<String>**](String.md)> | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  |  |

### Return type

[**models::CreateTranscription200Response**](createTranscription_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## create_translation

> models::CreateTranslation200Response create_translation(file, model, prompt, response_format, temperature)
Translates audio into English.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**file** | **std::path::PathBuf** | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [required] |
**model** | [**models::CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md) |  | [required] |
**prompt** | Option<**String**> | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  |  |
**response_format** | Option<[**models::AudioResponseFormat**](AudioResponseFormat.md)> |  |  |
**temperature** | Option<**f64**> | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  |  |[default to 0]

### Return type

[**models::CreateTranslation200Response**](createTranslation_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

