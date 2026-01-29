# OpenAPI\Server\Api\AudioApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpeech**](AudioApiInterface.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text.
[**createTranscription**](AudioApiInterface.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](AudioApiInterface.md#createTranslation) | **POST** /audio/translations | Translates audio into English.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AudioApi:
        tags:
            - { name: "open_api_server.api", api: "audio" }
    # ...
```

## **createSpeech**
> UploadedFile createSpeech($createSpeechRequest)

Generates audio from the input text.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudioApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudioApiInterface;

class AudioApi implements AudioApiInterface
{

    // ...

    /**
     * Implementation of AudioApiInterface#createSpeech
     */
    public function createSpeech(CreateSpeechRequest $createSpeechRequest, int &$responseCode, array &$responseHeaders): mixed
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSpeechRequest** | [**OpenAPI\Server\Model\CreateSpeechRequest**](../Model/CreateSpeechRequest.md)|  |

### Return type

**UploadedFile**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createTranscription**
> OpenAPI\Server\Model\CreateTranscription200Response createTranscription($file, $model, $language, $prompt, $responseFormat, $temperature, $timestampGranularities)

Transcribes audio into the input language.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudioApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudioApiInterface;

class AudioApi implements AudioApiInterface
{

    // ...

    /**
     * Implementation of AudioApiInterface#createTranscription
     */
    public function createTranscription(UploadedFile $file, CreateTranscriptionRequestModel $model, ?string $language, ?string $prompt, string $responseFormat, float $temperature, ?array $timestampGranularities, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **UploadedFile****UploadedFile**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. |
 **model** | [**OpenAPI\Server\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  |
 **language** | **string**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. | [optional]
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. | [optional]
 **responseFormat** | **string**| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. | [optional] [default to &#39;json&#39;]
 **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0]
 **timestampGranularities** | [**string**](../Model/string.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. | [optional]

### Return type

[**OpenAPI\Server\Model\CreateTranscription200Response**](../Model/CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createTranslation**
> OpenAPI\Server\Model\CreateTranslation200Response createTranslation($file, $model, $prompt, $responseFormat, $temperature)

Translates audio into English.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudioApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudioApiInterface;

class AudioApi implements AudioApiInterface
{

    // ...

    /**
     * Implementation of AudioApiInterface#createTranslation
     */
    public function createTranslation(UploadedFile $file, CreateTranscriptionRequestModel $model, ?string $prompt, string $responseFormat, float $temperature, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **UploadedFile****UploadedFile**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. |
 **model** | [**OpenAPI\Server\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  |
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. | [optional]
 **responseFormat** | **string**| The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. | [optional] [default to &#39;json&#39;]
 **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0]

### Return type

[**OpenAPI\Server\Model\CreateTranslation200Response**](../Model/CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

