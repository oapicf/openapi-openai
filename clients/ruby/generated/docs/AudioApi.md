# OpenApiOpenAIClient::AudioApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_speech**](AudioApi.md#create_speech) | **POST** /audio/speech | Generates audio from the input text. |
| [**create_transcription**](AudioApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**create_translation**](AudioApi.md#create_translation) | **POST** /audio/translations | Translates audio into English. |


## create_speech

> File create_speech(create_speech_request)

Generates audio from the input text.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::AudioApi.new
create_speech_request = OpenApiOpenAIClient::CreateSpeechRequest.new({model: OpenApiOpenAIClient::CreateSpeechRequestModel.new, input: 'input_example', voice: 'alloy'}) # CreateSpeechRequest | 

begin
  # Generates audio from the input text.
  result = api_instance.create_speech(create_speech_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling AudioApi->create_speech: #{e}"
end
```

#### Using the create_speech_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> create_speech_with_http_info(create_speech_request)

```ruby
begin
  # Generates audio from the input text.
  data, status_code, headers = api_instance.create_speech_with_http_info(create_speech_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling AudioApi->create_speech_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_speech_request** | [**CreateSpeechRequest**](CreateSpeechRequest.md) |  |  |

### Return type

**File**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/octet-stream


## create_transcription

> <CreateTranscription200Response> create_transcription(file, model, opts)

Transcribes audio into the input language.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::AudioApi.new
file = File.new('/path/to/some/file') # File | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
model = OpenApiOpenAIClient::CreateTranscriptionRequestModel.new # CreateTranscriptionRequestModel | 
opts = {
  language: 'language_example', # String | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
  prompt: 'prompt_example', # String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. 
  response_format: OpenApiOpenAIClient::AudioResponseFormat::JSON, # AudioResponseFormat | 
  temperature: 8.14, # Float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  timestamp_granularities: ['word'] # Array<String> | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
}

begin
  # Transcribes audio into the input language.
  result = api_instance.create_transcription(file, model, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling AudioApi->create_transcription: #{e}"
end
```

#### Using the create_transcription_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateTranscription200Response>, Integer, Hash)> create_transcription_with_http_info(file, model, opts)

```ruby
begin
  # Transcribes audio into the input language.
  data, status_code, headers = api_instance.create_transcription_with_http_info(file, model, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateTranscription200Response>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling AudioApi->create_transcription_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |  |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
| **language** | **String** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] |
| **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.  | [optional] |
| **response_format** | [**AudioResponseFormat**](AudioResponseFormat.md) |  | [optional][default to &#39;json&#39;] |
| **temperature** | **Float** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional][default to 0] |
| **timestamp_granularities** | [**Array&lt;String&gt;**](String.md) | The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  | [optional] |

### Return type

[**CreateTranscription200Response**](CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## create_translation

> <CreateTranslation200Response> create_translation(file, model, opts)

Translates audio into English.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::AudioApi.new
file = File.new('/path/to/some/file') # File | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
model = OpenApiOpenAIClient::CreateTranscriptionRequestModel.new # CreateTranscriptionRequestModel | 
opts = {
  prompt: 'prompt_example', # String | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. 
  response_format: OpenApiOpenAIClient::AudioResponseFormat::JSON, # AudioResponseFormat | 
  temperature: 8.14 # Float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
}

begin
  # Translates audio into English.
  result = api_instance.create_translation(file, model, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling AudioApi->create_translation: #{e}"
end
```

#### Using the create_translation_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateTranslation200Response>, Integer, Hash)> create_translation_with_http_info(file, model, opts)

```ruby
begin
  # Translates audio into English.
  data, status_code, headers = api_instance.create_translation_with_http_info(file, model, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateTranslation200Response>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling AudioApi->create_translation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.  |  |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
| **prompt** | **String** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.  | [optional] |
| **response_format** | [**AudioResponseFormat**](AudioResponseFormat.md) |  | [optional][default to &#39;json&#39;] |
| **temperature** | **Float** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional][default to 0] |

### Return type

[**CreateTranslation200Response**](CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

