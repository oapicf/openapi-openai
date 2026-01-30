# AudioAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](AudioAPI.md#createspeech) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](AudioAPI.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](AudioAPI.md#createtranslation) | **POST** /audio/translations | Translates audio into English.


# **createSpeech**
```swift
    open class func createSpeech(createSpeechRequest: CreateSpeechRequest, completion: @escaping (_ data: URL?, _ error: Error?) -> Void)
```

Generates audio from the input text.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createSpeechRequest = CreateSpeechRequest(model: CreateSpeechRequest_model(), input: "input_example", voice: "voice_example", responseFormat: "responseFormat_example", speed: 123) // CreateSpeechRequest | 

// Generates audio from the input text.
AudioAPI.createSpeech(createSpeechRequest: createSpeechRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpeechRequest** | [**CreateSpeechRequest**](CreateSpeechRequest.md) |  | 

### Return type

**URL**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranscription**
```swift
    open class func createTranscription(file: URL, model: CreateTranscriptionRequestModel, language: String? = nil, prompt: String? = nil, responseFormat: AudioResponseFormat? = nil, temperature: Double? = nil, timestampGranularities: [TimestampGranularities_createTranscription]? = nil, completion: @escaping (_ data: CreateTranscription200Response?, _ error: Error?) -> Void)
```

Transcribes audio into the input language.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let file = URL(string: "https://example.com")! // URL | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
let model = CreateTranscriptionRequest_model() // CreateTranscriptionRequestModel | 
let language = "language_example" // String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
let prompt = "prompt_example" // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (optional)
let responseFormat = AudioResponseFormat() // AudioResponseFormat |  (optional)
let temperature = 987 // Double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)
let timestampGranularities = ["inner_example"] // [String] | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)

// Transcribes audio into the input language.
AudioAPI.createTranscription(file: file, model: model, language: language, prompt: prompt, responseFormat: responseFormat, temperature: temperature, timestampGranularities: timestampGranularities) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **URL** | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | 
 **language** | **String** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 
 **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional] 
 **responseFormat** | [**AudioResponseFormat**](AudioResponseFormat.md) |  | [optional] 
 **temperature** | **Double** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **timestampGranularities** | [**[String]**](String.md) | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] 

### Return type

[**CreateTranscription200Response**](CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createTranslation**
```swift
    open class func createTranslation(file: URL, model: CreateTranscriptionRequestModel, prompt: String? = nil, responseFormat: AudioResponseFormat? = nil, temperature: Double? = nil, completion: @escaping (_ data: CreateTranslation200Response?, _ error: Error?) -> Void)
```

Translates audio into English.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let file = URL(string: "https://example.com")! // URL | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
let model = CreateTranscriptionRequest_model() // CreateTranscriptionRequestModel | 
let prompt = "prompt_example" // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (optional)
let responseFormat = AudioResponseFormat() // AudioResponseFormat |  (optional)
let temperature = 987 // Double | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)

// Translates audio into English.
AudioAPI.createTranslation(file: file, model: model, prompt: prompt, responseFormat: responseFormat, temperature: temperature) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **URL** | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  | 
 **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional] 
 **responseFormat** | [**AudioResponseFormat**](AudioResponseFormat.md) |  | [optional] 
 **temperature** | **Double** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslation200Response**](CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

