# AudioApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.


<a id="createSpeech"></a>
# **createSpeech**
> java.io.File createSpeech(createSpeechRequest)

Generates audio from the input text.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudioApi()
val createSpeechRequest : CreateSpeechRequest =  // CreateSpeechRequest | 
try {
    val result : java.io.File = apiInstance.createSpeech(createSpeechRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudioApi#createSpeech")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudioApi#createSpeech")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpeechRequest** | [**CreateSpeechRequest**](CreateSpeechRequest.md)|  |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a id="createTranscription"></a>
# **createTranscription**
> CreateTranscription200Response createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)

Transcribes audio into the input language.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudioApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
val model : CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 
val language : kotlin.String = language_example // kotlin.String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
val prompt : kotlin.String = prompt_example // kotlin.String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
val temperature : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
val timestampGranularities : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
try {
    val result : CreateTranscription200Response = apiInstance.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudioApi#createTranscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudioApi#createTranscription")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **language** | **kotlin.String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional]
 **prompt** | **kotlin.String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional]
 **responseFormat** | **kotlin.String**| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [optional] [default to json] [enum: json, text, srt, verbose_json, vtt]
 **temperature** | **java.math.BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **timestampGranularities** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] [enum: word, segment]

### Return type

[**CreateTranscription200Response**](CreateTranscription200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="createTranslation"></a>
# **createTranslation**
> CreateTranslation200Response createTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into English.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AudioApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
val model : CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 
val prompt : kotlin.String = prompt_example // kotlin.String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
val temperature : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
try {
    val result : CreateTranslation200Response = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AudioApi#createTranslation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AudioApi#createTranslation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **prompt** | **kotlin.String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional]
 **responseFormat** | **kotlin.String**| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;.  | [optional] [default to &quot;json&quot;]
 **temperature** | **java.math.BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslation200Response**](CreateTranslation200Response.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

