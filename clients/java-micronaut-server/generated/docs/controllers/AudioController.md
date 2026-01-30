# AudioController

All URIs are relative to `"/v1"`

The controller class is defined in **[AudioController.java](../../src/main/java/org/openapitools/controller/AudioController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](#createTranslation) | **POST** /audio/translations | Translates audio into English.

<a id="createSpeech"></a>
# **createSpeech**
```java
Mono<CompletedFileUpload> AudioController.createSpeech(createSpeechRequest)
```

Generates audio from the input text.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createSpeechRequest** | [**CreateSpeechRequest**](../../docs/models/CreateSpeechRequest.md) |  |

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/octet-stream`

<a id="createTranscription"></a>
# **createTranscription**
```java
Mono<CreateTranscription200Response> AudioController.createTranscription(_filemodellanguagepromptresponseFormattemperaturetimestampGranularities)
```

Transcribes audio into the input language.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_file** | `CompletedFileUpload` | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |
**model** | [**CreateTranscriptionRequestModel**](../../docs/models/CreateTranscriptionRequestModel.md) |  |
**language** | `String` | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional parameter]
**prompt** | `String` | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional parameter]
**responseFormat** | [**AudioResponseFormat**](../../docs/models/AudioResponseFormat.md) |  | [optional parameter] [default to `json`] [enum: `json`, `text`, `srt`, `verbose_json`, `vtt`]
**temperature** | `BigDecimal` | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional parameter] [default to `0`]
**timestampGranularities** | [**List&lt;String&gt;**](../../docs/models/String.md) | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional parameter] [enum: `word`, `segment`]

### Return type
[**CreateTranscription200Response**](../../docs/models/CreateTranscription200Response.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

<a id="createTranslation"></a>
# **createTranslation**
```java
Mono<CreateTranslation200Response> AudioController.createTranslation(_filemodelpromptresponseFormattemperature)
```

Translates audio into English.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**_file** | `CompletedFileUpload` | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |
**model** | [**CreateTranscriptionRequestModel**](../../docs/models/CreateTranscriptionRequestModel.md) |  |
**prompt** | `String` | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional parameter]
**responseFormat** | [**AudioResponseFormat**](../../docs/models/AudioResponseFormat.md) |  | [optional parameter] [default to `json`] [enum: `json`, `text`, `srt`, `verbose_json`, `vtt`]
**temperature** | `BigDecimal` | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional parameter] [default to `0`]

### Return type
[**CreateTranslation200Response**](../../docs/models/CreateTranslation200Response.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

