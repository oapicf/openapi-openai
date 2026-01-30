# OpenAPI\Client\AudioApi

Turn audio into text or text into audio.

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSpeech()**](AudioApi.md#createSpeech) | **POST** /audio/speech | Generates audio from the input text. |
| [**createTranscription()**](AudioApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**createTranslation()**](AudioApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English. |


## `createSpeech()`

```php
createSpeech($create_speech_request): \SplFileObject
```

Generates audio from the input text.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_speech_request = new \OpenAPI\Client\Model\CreateSpeechRequest(); // \OpenAPI\Client\Model\CreateSpeechRequest

try {
    $result = $apiInstance->createSpeech($create_speech_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudioApi->createSpeech: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_speech_request** | [**\OpenAPI\Client\Model\CreateSpeechRequest**](../Model/CreateSpeechRequest.md)|  | |

### Return type

**\SplFileObject**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/octet-stream`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createTranscription()`

```php
createTranscription($file, $model, $language, $prompt, $response_format, $temperature, $timestamp_granularities): \OpenAPI\Client\Model\CreateTranscription200Response
```

Transcribes audio into the input language.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$file = '/path/to/file.txt'; // \SplFileObject | The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.
$model = new \OpenAPI\Client\Model\CreateTranscriptionRequestModel(); // \OpenAPI\Client\Model\CreateTranscriptionRequestModel
$language = 'language_example'; // string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.
$prompt = 'prompt_example'; // string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language.
$response_format = new \OpenAPI\Client\Model\AudioResponseFormat(); // \OpenAPI\Client\Model\AudioResponseFormat
$temperature = 0; // float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.
$timestamp_granularities = array('timestamp_granularities_example'); // string[] | The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.

try {
    $result = $apiInstance->createTranscription($file, $model, $language, $prompt, $response_format, $temperature, $timestamp_granularities);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudioApi->createTranscription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **\SplFileObject****\SplFileObject**| The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. | |
| **model** | [**\OpenAPI\Client\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  | |
| **language** | **string**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. | [optional] |
| **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. | [optional] |
| **response_format** | [**\OpenAPI\Client\Model\AudioResponseFormat**](../Model/AudioResponseFormat.md)|  | [optional] |
| **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0] |
| **timestamp_granularities** | [**string[]**](../Model/string.md)| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CreateTranscription200Response**](../Model/CreateTranscription200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createTranslation()`

```php
createTranslation($file, $model, $prompt, $response_format, $temperature): \OpenAPI\Client\Model\CreateTranslation200Response
```

Translates audio into English.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudioApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$file = '/path/to/file.txt'; // \SplFileObject | The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm.
$model = new \OpenAPI\Client\Model\CreateTranscriptionRequestModel(); // \OpenAPI\Client\Model\CreateTranscriptionRequestModel
$prompt = 'prompt_example'; // string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English.
$response_format = new \OpenAPI\Client\Model\AudioResponseFormat(); // \OpenAPI\Client\Model\AudioResponseFormat
$temperature = 0; // float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.

try {
    $result = $apiInstance->createTranslation($file, $model, $prompt, $response_format, $temperature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudioApi->createTranslation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **\SplFileObject****\SplFileObject**| The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. | |
| **model** | [**\OpenAPI\Client\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  | |
| **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. | [optional] |
| **response_format** | [**\OpenAPI\Client\Model\AudioResponseFormat**](../Model/AudioResponseFormat.md)|  | [optional] |
| **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0] |

### Return type

[**\OpenAPI\Client\Model\CreateTranslation200Response**](../Model/CreateTranslation200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
