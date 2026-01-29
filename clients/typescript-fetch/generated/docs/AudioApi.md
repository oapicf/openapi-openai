# AudioApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSpeech**](AudioApi.md#createspeechoperation) | **POST** /audio/speech | Generates audio from the input text. |
| [**createTranscription**](AudioApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**createTranslation**](AudioApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English. |



## createSpeech

> Blob createSpeech(createSpeechRequest)

Generates audio from the input text.

### Example

```ts
import {
  Configuration,
  AudioApi,
} from '';
import type { CreateSpeechOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AudioApi(config);

  const body = {
    // CreateSpeechRequest
    createSpeechRequest: ...,
  } satisfies CreateSpeechOperationRequest;

  try {
    const data = await api.createSpeech(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createSpeechRequest** | [CreateSpeechRequest](CreateSpeechRequest.md) |  | |

### Return type

**Blob**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/octet-stream`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Transfer-Encoding - chunked <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createTranscription

> CreateTranscription200Response createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)

Transcribes audio into the input language.

### Example

```ts
import {
  Configuration,
  AudioApi,
} from '';
import type { CreateTranscriptionRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AudioApi(config);

  const body = {
    // Blob | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    file: BINARY_DATA_HERE,
    // CreateTranscriptionRequestModel
    model: ...,
    // string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
    language: language_example,
    // string | An optional text to guide the model\\\'s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
    prompt: prompt_example,
    // string | The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional)
    responseFormat: responseFormat_example,
    // number | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
    temperature: 8.14,
    // Array<string> | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
    timestampGranularities: ...,
  } satisfies CreateTranscriptionRequest;

  try {
    const data = await api.createTranscription(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | `Blob` | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [Defaults to `undefined`] |
| **model** | [CreateTranscriptionRequestModel](CreateTranscriptionRequestModel.md) |  | [Defaults to `undefined`] |
| **language** | `string` | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [Optional] [Defaults to `undefined`] |
| **prompt** | `string` | An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [Optional] [Defaults to `undefined`] |
| **responseFormat** | `json`, `text`, `srt`, `verbose_json`, `vtt` | The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [Optional] [Defaults to `&#39;json&#39;`] [Enum: json, text, srt, verbose_json, vtt] |
| **temperature** | `number` | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [Optional] [Defaults to `0`] |
| **timestampGranularities** | `word`, `segment` | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [Optional] [Enum: word, segment] |

### Return type

[**CreateTranscription200Response**](CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## createTranslation

> CreateTranslation200Response createTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into English.

### Example

```ts
import {
  Configuration,
  AudioApi,
} from '';
import type { CreateTranslationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new AudioApi(config);

  const body = {
    // Blob | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
    file: BINARY_DATA_HERE,
    // CreateTranscriptionRequestModel
    model: ...,
    // string | An optional text to guide the model\\\'s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
    prompt: prompt_example,
    // string | The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional)
    responseFormat: responseFormat_example,
    // number | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
    temperature: 8.14,
  } satisfies CreateTranslationRequest;

  try {
    const data = await api.createTranslation(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **file** | `Blob` | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | [Defaults to `undefined`] |
| **model** | [CreateTranscriptionRequestModel](CreateTranscriptionRequestModel.md) |  | [Defaults to `undefined`] |
| **prompt** | `string` | An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [Optional] [Defaults to `undefined`] |
| **responseFormat** | `string` | The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [Optional] [Defaults to `&#39;json&#39;`] |
| **temperature** | `number` | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [Optional] [Defaults to `0`] |

### Return type

[**CreateTranslation200Response**](CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

