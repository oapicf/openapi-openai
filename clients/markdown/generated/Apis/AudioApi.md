# AudioApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSpeech**](AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text. |
| [**createTranscription**](AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**createTranslation**](AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English. |


<a name="createSpeech"></a>
# **createSpeech**
> File createSpeech(CreateSpeechRequest)

Generates audio from the input text.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateSpeechRequest** | [**CreateSpeechRequest**](../Models/CreateSpeechRequest.md)|  | |

### Return type

**File**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream

<a name="createTranscription"></a>
# **createTranscription**
> createTranscription_200_response createTranscription(file, model, language, prompt, response\_format, temperature, timestamp\_granularities\[\])

Transcribes audio into the input language.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | **File**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [default to null] |
| **model** | [**CreateTranscriptionRequest_model**](../Models/CreateTranscriptionRequest_model.md)|  | [default to null] |
| **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] [default to null] |
| **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional] [default to null] |
| **response\_format** | [**AudioResponseFormat**](../Models/AudioResponseFormat.md)|  | [optional] [default to null] [enum: json, text, srt, verbose_json, vtt] |
| **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0] |
| **timestamp\_granularities\[\]** | [**List**](../Models/String.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] [default to null] [enum: word, segment] |

### Return type

[**createTranscription_200_response**](../Models/createTranscription_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

<a name="createTranslation"></a>
# **createTranslation**
> createTranslation_200_response createTranslation(file, model, prompt, response\_format, temperature)

Translates audio into English.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | **File**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [default to null] |
| **model** | [**CreateTranscriptionRequest_model**](../Models/CreateTranscriptionRequest_model.md)|  | [default to null] |
| **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional] [default to null] |
| **response\_format** | [**AudioResponseFormat**](../Models/AudioResponseFormat.md)|  | [optional] [default to null] [enum: json, text, srt, verbose_json, vtt] |
| **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0] |

### Return type

[**createTranslation_200_response**](../Models/createTranslation_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

