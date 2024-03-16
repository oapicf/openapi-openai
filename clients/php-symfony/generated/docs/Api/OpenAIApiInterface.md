# OpenAPI\Server\Api\OpenAIApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAIApiInterface.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.
[**createChatCompletion**](OpenAIApiInterface.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**createCompletion**](OpenAIApiInterface.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**createEdit**](OpenAIApiInterface.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OpenAIApiInterface.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAIApiInterface.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.
[**createFineTune**](OpenAIApiInterface.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
[**createImage**](OpenAIApiInterface.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAIApiInterface.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAIApiInterface.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OpenAIApiInterface.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createTranscription**](OpenAIApiInterface.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAIApiInterface.md#createTranslation) | **POST** /audio/translations | Translates audio into English.
[**deleteFile**](OpenAIApiInterface.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAIApiInterface.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIApiInterface.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listFiles**](OpenAIApiInterface.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OpenAIApiInterface.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.
[**listFineTunes**](OpenAIApiInterface.md#listFineTunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs
[**listModels**](OpenAIApiInterface.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveFile**](OpenAIApiInterface.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIApiInterface.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)
[**retrieveModel**](OpenAIApiInterface.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\OpenAIApi:
        tags:
            - { name: "open_api_server.api", api: "openAI" }
    # ...
```

## **cancelFineTune**
> OpenAPI\Server\Model\FineTune cancelFineTune($fineTuneId)

Immediately cancel a fine-tune job.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#cancelFineTune
     */
    public function cancelFineTune(string $fineTuneId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **string**| The ID of the fine-tune job to cancel |

### Return type

[**OpenAPI\Server\Model\FineTune**](../Model/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createChatCompletion**
> OpenAPI\Server\Model\CreateChatCompletionResponse createChatCompletion($createChatCompletionRequest)

Creates a model response for the given chat conversation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createChatCompletion
     */
    public function createChatCompletion(CreateChatCompletionRequest $createChatCompletionRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**OpenAPI\Server\Model\CreateChatCompletionRequest**](../Model/CreateChatCompletionRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateChatCompletionResponse**](../Model/CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createCompletion**
> OpenAPI\Server\Model\CreateCompletionResponse createCompletion($createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createCompletion
     */
    public function createCompletion(CreateCompletionRequest $createCompletionRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**OpenAPI\Server\Model\CreateCompletionRequest**](../Model/CreateCompletionRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateCompletionResponse**](../Model/CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createEdit**
> OpenAPI\Server\Model\CreateEditResponse createEdit($createEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createEdit
     */
    public function createEdit(CreateEditRequest $createEditRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**OpenAPI\Server\Model\CreateEditRequest**](../Model/CreateEditRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateEditResponse**](../Model/CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createEmbedding**
> OpenAPI\Server\Model\CreateEmbeddingResponse createEmbedding($createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createEmbedding
     */
    public function createEmbedding(CreateEmbeddingRequest $createEmbeddingRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**OpenAPI\Server\Model\CreateEmbeddingRequest**](../Model/CreateEmbeddingRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateEmbeddingResponse**](../Model/CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createFile**
> OpenAPI\Server\Model\OpenAIFile createFile($file, $purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createFile
     */
    public function createFile(UploadedFile $file, string $purpose, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **UploadedFile****UploadedFile**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). |
 **purpose** | **string**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. |

### Return type

[**OpenAPI\Server\Model\OpenAIFile**](../Model/OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createFineTune**
> OpenAPI\Server\Model\FineTune createFineTune($createFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createFineTune
     */
    public function createFineTune(CreateFineTuneRequest $createFineTuneRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**OpenAPI\Server\Model\CreateFineTuneRequest**](../Model/CreateFineTuneRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\FineTune**](../Model/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createImage**
> OpenAPI\Server\Model\ImagesResponse createImage($createImageRequest)

Creates an image given a prompt.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createImage
     */
    public function createImage(CreateImageRequest $createImageRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**OpenAPI\Server\Model\CreateImageRequest**](../Model/CreateImageRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createImageEdit**
> OpenAPI\Server\Model\ImagesResponse createImageEdit($image, $prompt, $mask, $n, $size, $responseFormat, $user)

Creates an edited or extended image given an original image and a prompt.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createImageEdit
     */
    public function createImageEdit(UploadedFile $image, string $prompt, ?UploadedFile $mask, int $n, string $size, string $responseFormat, ?string $user, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **UploadedFile****UploadedFile**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **string**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **UploadedFile****UploadedFile**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **responseFormat** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional]

### Return type

[**OpenAPI\Server\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createImageVariation**
> OpenAPI\Server\Model\ImagesResponse createImageVariation($image, $n, $size, $responseFormat, $user)

Creates a variation of a given image.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createImageVariation
     */
    public function createImageVariation(UploadedFile $image, int $n, string $size, string $responseFormat, ?string $user, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **UploadedFile****UploadedFile**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **string**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **responseFormat** | **string**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **string**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). | [optional]

### Return type

[**OpenAPI\Server\Model\ImagesResponse**](../Model/ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createModeration**
> OpenAPI\Server\Model\CreateModerationResponse createModeration($createModerationRequest)

Classifies if text violates OpenAI's Content Policy

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createModeration
     */
    public function createModeration(CreateModerationRequest $createModerationRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**OpenAPI\Server\Model\CreateModerationRequest**](../Model/CreateModerationRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateModerationResponse**](../Model/CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createTranscription**
> OpenAPI\Server\Model\CreateTranscriptionResponse createTranscription($file, $model, $prompt, $responseFormat, $temperature, $language)

Transcribes audio into the input language.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createTranscription
     */
    public function createTranscription(UploadedFile $file, CreateTranscriptionRequestModel $model, ?string $prompt, string $responseFormat, float $temperature, ?string $language, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **UploadedFile****UploadedFile**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. |
 **model** | [**OpenAPI\Server\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  |
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. | [optional]
 **responseFormat** | **string**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. | [optional] [default to &#39;json&#39;]
 **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0]
 **language** | **string**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. | [optional]

### Return type

[**OpenAPI\Server\Model\CreateTranscriptionResponse**](../Model/CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createTranslation**
> OpenAPI\Server\Model\CreateTranslationResponse createTranslation($file, $model, $prompt, $responseFormat, $temperature)

Translates audio into English.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#createTranslation
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
 **file** | **UploadedFile****UploadedFile**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. |
 **model** | [**OpenAPI\Server\Model\CreateTranscriptionRequestModel**](../Model/CreateTranscriptionRequestModel.md)|  |
 **prompt** | **string**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. | [optional]
 **responseFormat** | **string**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. | [optional] [default to &#39;json&#39;]
 **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. | [optional] [default to 0]

### Return type

[**OpenAPI\Server\Model\CreateTranslationResponse**](../Model/CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteFile**
> OpenAPI\Server\Model\DeleteFileResponse deleteFile($fileId)

Delete a file.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#deleteFile
     */
    public function deleteFile(string $fileId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **string**| The ID of the file to use for this request |

### Return type

[**OpenAPI\Server\Model\DeleteFileResponse**](../Model/DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteModel**
> OpenAPI\Server\Model\DeleteModelResponse deleteModel($model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#deleteModel
     */
    public function deleteModel(string $model, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The model to delete |

### Return type

[**OpenAPI\Server\Model\DeleteModelResponse**](../Model/DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **downloadFile**
> string downloadFile($fileId)

Returns the contents of the specified file

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#downloadFile
     */
    public function downloadFile(string $fileId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **string**| The ID of the file to use for this request |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFiles**
> OpenAPI\Server\Model\ListFilesResponse listFiles()

Returns a list of files that belong to the user's organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#listFiles
     */
    public function listFiles(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\ListFilesResponse**](../Model/ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFineTuneEvents**
> OpenAPI\Server\Model\ListFineTuneEventsResponse listFineTuneEvents($fineTuneId, $stream)

Get fine-grained status updates for a fine-tune job.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#listFineTuneEvents
     */
    public function listFineTuneEvents(string $fineTuneId, bool $stream, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **string**| The ID of the fine-tune job to get events for. |
 **stream** | **bool**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\ListFineTuneEventsResponse**](../Model/ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFineTunes**
> OpenAPI\Server\Model\ListFineTunesResponse listFineTunes()

List your organization's fine-tuning jobs

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#listFineTunes
     */
    public function listFineTunes(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\ListFineTunesResponse**](../Model/ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listModels**
> OpenAPI\Server\Model\ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#listModels
     */
    public function listModels(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\ListModelsResponse**](../Model/ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveFile**
> OpenAPI\Server\Model\OpenAIFile retrieveFile($fileId)

Returns information about a specific file.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#retrieveFile
     */
    public function retrieveFile(string $fileId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **string**| The ID of the file to use for this request |

### Return type

[**OpenAPI\Server\Model\OpenAIFile**](../Model/OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveFineTune**
> OpenAPI\Server\Model\FineTune retrieveFineTune($fineTuneId)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#retrieveFineTune
     */
    public function retrieveFineTune(string $fineTuneId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **string**| The ID of the fine-tune job |

### Return type

[**OpenAPI\Server\Model\FineTune**](../Model/FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveModel**
> OpenAPI\Server\Model\Model retrieveModel($model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OpenAIApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OpenAIApiInterface;

class OpenAIApi implements OpenAIApiInterface
{

    // ...

    /**
     * Implementation of OpenAIApiInterface#retrieveModel
     */
    public function retrieveModel(string $model, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The ID of the model to use for this request |

### Return type

[**OpenAPI\Server\Model\Model**](../Model/Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

