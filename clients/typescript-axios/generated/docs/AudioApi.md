# AudioApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createSpeech**](#createspeech) | **POST** /audio/speech | Generates audio from the input text.|
|[**createTranscription**](#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.|
|[**createTranslation**](#createtranslation) | **POST** /audio/translations | Translates audio into English.|

# **createSpeech**
> File createSpeech(createSpeechRequest)


### Example

```typescript
import {
    AudioApi,
    Configuration,
    CreateSpeechRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new AudioApi(configuration);

let createSpeechRequest: CreateSpeechRequest; //

const { status, data } = await apiInstance.createSpeech(
    createSpeechRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createSpeechRequest** | **CreateSpeechRequest**|  | |


### Return type

**File**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  * Transfer-Encoding - chunked <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranscription**
> CreateTranscription200Response createTranscription()


### Example

```typescript
import {
    AudioApi,
    Configuration,
    CreateTranscriptionRequestModel
} from './api';

const configuration = new Configuration();
const apiInstance = new AudioApi(configuration);

let file: File; //The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  (default to undefined)
let model: CreateTranscriptionRequestModel; // (default to undefined)
let language: string; //The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional) (default to undefined)
let prompt: string; //An optional text to guide the model\\\'s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional) (default to undefined)
let responseFormat: string; //The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional) (default to 'json')
let temperature: number; //The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)
let timestampGranularities: Array<string>; //The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional) (default to undefined)

const { status, data } = await apiInstance.createTranscription(
    file,
    model,
    language,
    prompt,
    responseFormat,
    temperature,
    timestampGranularities
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **file** | [**File**] | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | defaults to undefined|
| **model** | **CreateTranscriptionRequestModel** |  | defaults to undefined|
| **language** | [**string**] | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | (optional) defaults to undefined|
| **prompt** | [**string**] | An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | (optional) defaults to undefined|
| **responseFormat** | [**string**]**Array<&#39;json&#39; &#124; &#39;text&#39; &#124; &#39;srt&#39; &#124; &#39;verbose_json&#39; &#124; &#39;vtt&#39;>** | The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | (optional) defaults to 'json'|
| **temperature** | [**number**] | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | (optional) defaults to 0|
| **timestampGranularities** | **Array<&#39;word&#39; &#124; &#39;segment&#39;>** | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | (optional) defaults to undefined|


### Return type

**CreateTranscription200Response**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranslation**
> CreateTranslation200Response createTranslation()


### Example

```typescript
import {
    AudioApi,
    Configuration,
    CreateTranscriptionRequestModel
} from './api';

const configuration = new Configuration();
const apiInstance = new AudioApi(configuration);

let file: File; //The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  (default to undefined)
let model: CreateTranscriptionRequestModel; // (default to undefined)
let prompt: string; //An optional text to guide the model\\\'s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional) (default to undefined)
let responseFormat: string; //The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional) (default to 'json')
let temperature: number; //The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)

const { status, data } = await apiInstance.createTranslation(
    file,
    model,
    prompt,
    responseFormat,
    temperature
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **file** | [**File**] | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | defaults to undefined|
| **model** | **CreateTranscriptionRequestModel** |  | defaults to undefined|
| **prompt** | [**string**] | An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | (optional) defaults to undefined|
| **responseFormat** | [**string**] | The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | (optional) defaults to 'json'|
| **temperature** | [**number**] | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | (optional) defaults to 0|


### Return type

**CreateTranslation200Response**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

