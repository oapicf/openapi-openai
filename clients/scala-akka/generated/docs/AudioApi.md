# AudioApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**createSpeechWithHttpInfo**](AudioApi.md#createSpeechWithHttpInfo) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranscriptionWithHttpInfo**](AudioApi.md#createTranscriptionWithHttpInfo) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
[**createTranslationWithHttpInfo**](AudioApi.md#createTranslationWithHttpInfo) | **POST** /audio/translations | Translates audio into English.



## createSpeech

> createSpeech(createSpeechRequest): ApiRequest[File]

Generates audio from the input text.

### Example

```scala
// Import classes:
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = AudioApi("https://api.openai.com/v1")
    val createSpeechRequest: CreateSpeechRequest =  // CreateSpeechRequest | 
    
    val request = apiInstance.createSpeech(createSpeechRequest)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudioApi#createSpeech")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudioApi#createSpeech")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpeechRequest** | [**CreateSpeechRequest**](CreateSpeechRequest.md)|  |

### Return type

ApiRequest[[**File**](File.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Transfer-Encoding - chunked <br>  |


## createTranscription

> createTranscription(createTranscriptionRequest): ApiRequest[CreateTranscription200Response]

Transcribes audio into the input language.

### Example

```scala
// Import classes:
import 
import 
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = AudioApi("https://api.openai.com/v1")
    val file: File = BINARY_DATA_HERE // File | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 

    val model: CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 

    val language: String = language_example // String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 

    val prompt: String = prompt_example // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 

    val responseFormat: AudioResponseFormat =  // AudioResponseFormat | 

    val temperature: BigDecimal = 8.14 // BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 

    val timestampGranularities: Seq[String] =  // Seq[String] | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
    
    val request = apiInstance.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudioApi#createTranscription")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudioApi#createTranscription")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **language** | **String**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional]
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional]
 **responseFormat** | [**AudioResponseFormat**](AudioResponseFormat.md)|  | [optional] [enum: json, text, srt, verbose_json, vtt]
 **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional]
 **timestampGranularities** | [**Seq[String]**](String.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] [enum: word, segment]

### Return type

ApiRequest[[**CreateTranscription200Response**](CreateTranscription200Response.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## createTranslation

> createTranslation(createTranslationRequest): ApiRequest[CreateTranslation200Response]

Translates audio into English.

### Example

```scala
// Import classes:
import 
import 
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = AudioApi("https://api.openai.com/v1")
    val file: File = BINARY_DATA_HERE // File | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 

    val model: CreateTranscriptionRequestModel =  // CreateTranscriptionRequestModel | 

    val prompt: String = prompt_example // String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 

    val responseFormat: AudioResponseFormat =  // AudioResponseFormat | 

    val temperature: BigDecimal = 8.14 // BigDecimal | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
    
    val request = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AudioApi#createTranslation")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AudioApi#createTranslation")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  |
 **prompt** | **String**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional]
 **responseFormat** | [**AudioResponseFormat**](AudioResponseFormat.md)|  | [optional] [enum: json, text, srt, verbose_json, vtt]
 **temperature** | **BigDecimal**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional]

### Return type

ApiRequest[[**CreateTranslation200Response**](CreateTranslation200Response.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

