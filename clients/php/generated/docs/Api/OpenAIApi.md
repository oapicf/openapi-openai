# OpenAPI\Client\OpenAIApi

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelFineTune()**](OpenAIApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. |
| [**createChatCompletion()**](OpenAIApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
| [**createCompletion()**](OpenAIApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| [**createEdit()**](OpenAIApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |
| [**createEmbedding()**](OpenAIApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| [**createFile()**](OpenAIApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. |
| [**createFineTune()**](OpenAIApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) |
| [**createImage()**](OpenAIApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt. |
| [**createImageEdit()**](OpenAIApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**createImageVariation()**](OpenAIApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image. |
| [**createModeration()**](OpenAIApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy |
| [**createTranscription()**](OpenAIApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**createTranslation()**](OpenAIApi.md#createTranslation) | **POST** /audio/translations | Translates audio into English. |
| [**deleteFile()**](OpenAIApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file. |
| [**deleteModel()**](OpenAIApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization. |
| [**downloadFile()**](OpenAIApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file |
| [**listFiles()**](OpenAIApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization. |
| [**listFineTuneEvents()**](OpenAIApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. |
| [**listFineTunes()**](OpenAIApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs |
| [**listModels()**](OpenAIApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**retrieveFile()**](OpenAIApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file. |
| [**retrieveFineTune()**](OpenAIApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) |
| [**retrieveModel()**](OpenAIApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


## `cancelFineTune()`

```php
cancelFineTune($fine_tune_id): \OpenAPI\Client\Model\FineTune
```

Immediately cancel a fine-tune job.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tune job to cancel

try {
    $result = $apiInstance->cancelFineTune($fine_tune_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->cancelFineTune: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tune_id** | **string**| The ID of the fine-tune job to cancel | |

### Return type

[**\OpenAPI\Client\Model\FineTune**](../Model/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createChatCompletion()`

```php
createChatCompletion($create_chat_completion_request): \OpenAPI\Client\Model\CreateChatCompletionResponse
```

Creates a model response for the given chat conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_chat_completion_request = new \OpenAPI\Client\Model\CreateChatCompletionRequest(); // \OpenAPI\Client\Model\CreateChatCompletionRequest

try {
    $result = $apiInstance->createChatCompletion($create_chat_completion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createChatCompletion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_chat_completion_request** | [**\OpenAPI\Client\Model\CreateChatCompletionRequest**](../Model/CreateChatCompletionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateChatCompletionResponse**](../Model/CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createCompletion()`

```php
createCompletion($create_completion_request): \OpenAPI\Client\Model\CreateCompletionResponse
```

Creates a completion for the provided prompt and parameters.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_completion_request = new \OpenAPI\Client\Model\CreateCompletionRequest(); // \OpenAPI\Client\Model\CreateCompletionRequest

try {
    $result = $apiInstance->createCompletion($create_completion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createCompletion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_completion_request** | [**\OpenAPI\Client\Model\CreateCompletionRequest**](../Model/CreateCompletionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateCompletionResponse**](../Model/CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createEdit()`

```php
createEdit($create_edit_request): \OpenAPI\Client\Model\CreateEditResponse
```

Creates a new edit for the provided input, instruction, and parameters.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_edit_request = new \OpenAPI\Client\Model\CreateEditRequest(); // \OpenAPI\Client\Model\CreateEditRequest

try {
    $result = $apiInstance->createEdit($create_edit_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createEdit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_edit_request** | [**\OpenAPI\Client\Model\CreateEditRequest**](../Model/CreateEditRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateEditResponse**](../Model/CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createEmbedding()`

```php
createEmbedding($create_embedding_request): \OpenAPI\Client\Model\CreateEmbeddingResponse
```

Creates an embedding vector representing the input text.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_embedding_request = new \OpenAPI\Client\Model\CreateEmbeddingRequest(); // \OpenAPI\Client\Model\CreateEmbeddingRequest

try {
    $result = $apiInstance->createEmbedding($create_embedding_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createEmbedding: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_embedding_request** | [**\OpenAPI\Client\Model\CreateEmbeddingRequest**](../Model/CreateEmbeddingRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateEmbeddingResponse**](../Model/CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createFile()`

```php
createFile($file, $purpose): \OpenAPI\Client\Model\OpenAIFile
```

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$file = "/path/to/file.txt"; // \SplFileObject | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).
$purpose = 'purpose_example'; // string | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.

try {
    $result = $apiInstance->createFile($file, $purpose);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **\SplFileObject****\SplFileObject**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). | |
| **purpose** | **string**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. | |

### Return type

[**\OpenAPI\Client\Model\OpenAIFile**](../Model/OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createFineTune()`

```php
createFineTune($create_fine_tune_request): \OpenAPI\Client\Model\FineTune
```

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_fine_tune_request = new \OpenAPI\Client\Model\CreateFineTuneRequest(); // \OpenAPI\Client\Model\CreateFineTuneRequest

try {
    $result = $apiInstance->createFineTune($create_fine_tune_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createFineTune: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_fine_tune_request** | [**\OpenAPI\Client\Model\CreateFineTuneRequest**](../Model/CreateFineTuneRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\FineTune**](../Model/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createImage()`

```php
createImage($create_image_request): \OpenAPI\Client\Model\ImagesResponse
```

Creates an image given a prompt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_image_request = new \OpenAPI\Client\Model\CreateImageRequest(); // \OpenAPI\Client\Model\CreateImageRequest

try {
    $result = $apiInstance->createImage($create_image_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createImage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_image_request** | [**\OpenAPI\Client\Model\CreateImageRequest**](../Model/CreateImageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createImageEdit()`

```php
createImageEdit($image, $prompt, $mask, $n, $size, $response_format, $user): \OpenAPI\Client\Model\ImagesResponse
```

Creates an edited or extended image given an original image and a prompt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$image = "/path/to/file.txt"; // \SplFileObject | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
$prompt = 'prompt_example'; // string | A text description of the desired image(s). The maximum length is 1000 characters.
$mask = "/path/to/file.txt"; // \SplFileObject | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
$n = 1; // int | The number of images to generate. Must be between 1 and 10.
$size = '1024x1024'; // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
$response_format = 'url'; // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
$user = 'user_example'; // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).

try {
    $result = $apiInstance->createImageEdit($image, $prompt, $mask, $n, $size, $response_format, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createImageEdit: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **image** | **\SplFileObject****\SplFileObject**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | |
| **prompt** | **string**| A text description of the desired image(s). The maximum length is 1000 characters. | |
| **mask** | **\SplFileObject****\SplFileObject**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] |
| **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;] |
| **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;] |
| **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional] |

### Return type

[**\OpenAPI\Client\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createImageVariation()`

```php
createImageVariation($image, $n, $size, $response_format, $user): \OpenAPI\Client\Model\ImagesResponse
```

Creates a variation of a given image.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$image = "/path/to/file.txt"; // \SplFileObject | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
$n = 1; // int | The number of images to generate. Must be between 1 and 10.
$size = '1024x1024'; // string | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
$response_format = 'url'; // string | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
$user = 'user_example'; // string | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).

try {
    $result = $apiInstance->createImageVariation($image, $n, $size, $response_format, $user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createImageVariation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **image** | **\SplFileObject****\SplFileObject**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | |
| **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;] |
| **response_format** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;] |
| **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional] |

### Return type

[**\OpenAPI\Client\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createModeration()`

```php
createModeration($create_moderation_request): \OpenAPI\Client\Model\CreateModerationResponse
```

Classifies if text violates OpenAI's Content Policy

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_moderation_request = new \OpenAPI\Client\Model\CreateModerationRequest(); // \OpenAPI\Client\Model\CreateModerationRequest

try {
    $result = $apiInstance->createModeration($create_moderation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createModeration: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_moderation_request** | [**\OpenAPI\Client\Model\CreateModerationRequest**](../Model/CreateModerationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateModerationResponse**](../Model/CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createTranscription()`

```php
createTranscription($file, $model, $prompt, $response_format, $temperature, $language): \OpenAPI\Client\Model\CreateTranscriptionResponse
```

Transcribes audio into the input language.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$file = "/path/to/file.txt"; // \SplFileObject | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.
$model = new \OpenAPI\Client\Model\CreateTranscriptionRequestModel(); // \OpenAPI\Client\Model\CreateTranscriptionRequestModel
$prompt = 'prompt_example'; // string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.
$response_format = 'json'; // string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.
$temperature = 0; // float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.
$language = 'language_example'; // string | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.

try {
    $result = $apiInstance->createTranscription($file, $model, $prompt, $response_format, $temperature, $language);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createTranscription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **\SplFileObject****\SplFileObject**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. | |
| **model** | [**\OpenAPI\Client\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  | |
| **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. | [optional] |
| **response_format** | **string**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. | [optional] [default to &#39;json&#39;] |
| **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0] |
| **language** | **string**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CreateTranscriptionResponse**](../Model/CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createTranslation()`

```php
createTranslation($file, $model, $prompt, $response_format, $temperature): \OpenAPI\Client\Model\CreateTranslationResponse
```

Translates audio into English.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$file = "/path/to/file.txt"; // \SplFileObject | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.
$model = new \OpenAPI\Client\Model\CreateTranscriptionRequestModel(); // \OpenAPI\Client\Model\CreateTranscriptionRequestModel
$prompt = 'prompt_example'; // string | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.
$response_format = 'json'; // string | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.
$temperature = 0; // float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.

try {
    $result = $apiInstance->createTranslation($file, $model, $prompt, $response_format, $temperature);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->createTranslation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **\SplFileObject****\SplFileObject**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. | |
| **model** | [**\OpenAPI\Client\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  | |
| **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. | [optional] |
| **response_format** | **string**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. | [optional] [default to &#39;json&#39;] |
| **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0] |

### Return type

[**\OpenAPI\Client\Model\CreateTranslationResponse**](../Model/CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteFile()`

```php
deleteFile($file_id): \OpenAPI\Client\Model\DeleteFileResponse
```

Delete a file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$file_id = 'file_id_example'; // string | The ID of the file to use for this request

try {
    $result = $apiInstance->deleteFile($file_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->deleteFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file_id** | **string**| The ID of the file to use for this request | |

### Return type

[**\OpenAPI\Client\Model\DeleteFileResponse**](../Model/DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteModel()`

```php
deleteModel($model): \OpenAPI\Client\Model\DeleteModelResponse
```

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$model = curie:ft-acmeco-2021-03-03-21-44-20; // string | The model to delete

try {
    $result = $apiInstance->deleteModel($model);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->deleteModel: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **model** | **string**| The model to delete | |

### Return type

[**\OpenAPI\Client\Model\DeleteModelResponse**](../Model/DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `downloadFile()`

```php
downloadFile($file_id): string
```

Returns the contents of the specified file

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$file_id = 'file_id_example'; // string | The ID of the file to use for this request

try {
    $result = $apiInstance->downloadFile($file_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->downloadFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file_id** | **string**| The ID of the file to use for this request | |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listFiles()`

```php
listFiles(): \OpenAPI\Client\Model\ListFilesResponse
```

Returns a list of files that belong to the user's organization.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->listFiles();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->listFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\ListFilesResponse**](../Model/ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listFineTuneEvents()`

```php
listFineTuneEvents($fine_tune_id, $stream): \OpenAPI\Client\Model\ListFineTuneEventsResponse
```

Get fine-grained status updates for a fine-tune job.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tune job to get events for.
$stream = false; // bool | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.

try {
    $result = $apiInstance->listFineTuneEvents($fine_tune_id, $stream);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->listFineTuneEvents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tune_id** | **string**| The ID of the fine-tune job to get events for. | |
| **stream** | **bool**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\ListFineTuneEventsResponse**](../Model/ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listFineTunes()`

```php
listFineTunes(): \OpenAPI\Client\Model\ListFineTunesResponse
```

List your organization's fine-tuning jobs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->listFineTunes();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->listFineTunes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\ListFineTunesResponse**](../Model/ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listModels()`

```php
listModels(): \OpenAPI\Client\Model\ListModelsResponse
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->listModels();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->listModels: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\ListModelsResponse**](../Model/ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveFile()`

```php
retrieveFile($file_id): \OpenAPI\Client\Model\OpenAIFile
```

Returns information about a specific file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$file_id = 'file_id_example'; // string | The ID of the file to use for this request

try {
    $result = $apiInstance->retrieveFile($file_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->retrieveFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file_id** | **string**| The ID of the file to use for this request | |

### Return type

[**\OpenAPI\Client\Model\OpenAIFile**](../Model/OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveFineTune()`

```php
retrieveFineTune($fine_tune_id): \OpenAPI\Client\Model\FineTune
```

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$fine_tune_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tune job

try {
    $result = $apiInstance->retrieveFineTune($fine_tune_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->retrieveFineTune: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tune_id** | **string**| The ID of the fine-tune job | |

### Return type

[**\OpenAPI\Client\Model\FineTune**](../Model/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveModel()`

```php
retrieveModel($model): \OpenAPI\Client\Model\Model
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OpenAIApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$model = text-davinci-001; // string | The ID of the model to use for this request

try {
    $result = $apiInstance->retrieveModel($model);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OpenAIApi->retrieveModel: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **model** | **string**| The ID of the model to use for this request | |

### Return type

[**\OpenAPI\Client\Model\Model**](../Model/Model.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
