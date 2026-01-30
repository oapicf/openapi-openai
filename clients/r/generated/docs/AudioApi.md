# AudioApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateSpeech**](AudioApi.md#CreateSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**CreateTranscription**](AudioApi.md#CreateTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**CreateTranslation**](AudioApi.md#CreateTranslation) | **POST** /audio/translations | Translates audio into English.


# **CreateSpeech**
> data.frame CreateSpeech(create_speech_request)

Generates audio from the input text.

### Example
```R
library(openapi)

# Generates audio from the input text.
#
# prepare function argument(s)
var_create_speech_request <- CreateSpeechRequest$new(CreateSpeechRequest_model$new(), "input_example", "alloy", "mp3", 123) # CreateSpeechRequest | 

api_instance <- AudioApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateSpeech(var_create_speech_requestdata_file = "result.txt")
result <- api_instance$CreateSpeech(var_create_speech_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_speech_request** | [**CreateSpeechRequest**](CreateSpeechRequest.md)|  | 

### Return type

**data.frame**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Transfer-Encoding - chunked <br>  |

# **CreateTranscription**
> CreateTranscription200Response CreateTranscription(file, model, language = var.language, prompt = var.prompt, response_format = var.response_format, temperature = 0, timestamp_granularities = var.timestamp_granularities)

Transcribes audio into the input language.

### Example
```R
library(openapi)

# Transcribes audio into the input language.
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
var_model <- CreateTranscriptionRequest_model$new() # CreateTranscriptionRequestModel | 
var_language <- "language_example" # character | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (Optional)
var_prompt <- "prompt_example" # character | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  (Optional)
var_response_format <- AudioResponseFormat$new() # AudioResponseFormat |  (Optional)
var_temperature <- 0 # numeric | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (Optional)
var_timestamp_granularities <- c("word") # array[character] | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (Optional)

api_instance <- AudioApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateTranscription(var_file, var_model, language = var_language, prompt = var_prompt, response_format = var_response_format, temperature = var_temperature, timestamp_granularities = var_timestamp_granularitiesdata_file = "result.txt")
result <- api_instance$CreateTranscription(var_file, var_model, language = var_language, prompt = var_prompt, response_format = var_response_format, temperature = var_temperature, timestamp_granularities = var_timestamp_granularities)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **data.frame**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md)|  | 
 **language** | **character**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 
 **prompt** | **character**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional] 
 **response_format** | [**AudioResponseFormat**](AudioResponseFormat.md)|  | [optional] 
 **temperature** | **numeric**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **timestamp_granularities** | Enum [word, segment] | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] 

### Return type

[**CreateTranscription200Response**](createTranscription_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **CreateTranslation**
> CreateTranslation200Response CreateTranslation(file, model, prompt = var.prompt, response_format = var.response_format, temperature = 0)

Translates audio into English.

### Example
```R
library(openapi)

# Translates audio into English.
#
# prepare function argument(s)
var_file <- File.new('/path/to/file') # data.frame | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
var_model <- CreateTranscriptionRequest_model$new() # CreateTranscriptionRequestModel | 
var_prompt <- "prompt_example" # character | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  (Optional)
var_response_format <- AudioResponseFormat$new() # AudioResponseFormat |  (Optional)
var_temperature <- 0 # numeric | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (Optional)

api_instance <- AudioApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateTranslation(var_file, var_model, prompt = var_prompt, response_format = var_response_format, temperature = var_temperaturedata_file = "result.txt")
result <- api_instance$CreateTranslation(var_file, var_model, prompt = var_prompt, response_format = var_response_format, temperature = var_temperature)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **data.frame**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequest_model.md)|  | 
 **prompt** | **character**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional] 
 **response_format** | [**AudioResponseFormat**](AudioResponseFormat.md)|  | [optional] 
 **temperature** | **numeric**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

### Return type

[**CreateTranslation200Response**](createTranslation_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

