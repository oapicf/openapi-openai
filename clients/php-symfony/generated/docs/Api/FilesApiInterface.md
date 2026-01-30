# OpenAPI\Server\Api\FilesApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApiInterface.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
[**deleteFile**](FilesApiInterface.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](FilesApiInterface.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](FilesApiInterface.md#listFiles) | **GET** /files | Returns a list of files.
[**retrieveFile**](FilesApiInterface.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\FilesApi:
        tags:
            - { name: "open_api_server.api", api: "files" }
    # ...
```

## **createFile**
> OpenAPI\Server\Model\OpenAIFile createFile($file, $purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FilesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FilesApiInterface;

class FilesApi implements FilesApiInterface
{

    // ...

    /**
     * Implementation of FilesApiInterface#createFile
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
 **file** | **UploadedFile****UploadedFile**| The File object (not file name) to be uploaded. |
 **purpose** | **string**| The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning). |

### Return type

[**OpenAPI\Server\Model\OpenAIFile**](../Model/OpenAIFile.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

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
// src/Acme/MyBundle/Api/FilesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FilesApiInterface;

class FilesApi implements FilesApiInterface
{

    // ...

    /**
     * Implementation of FilesApiInterface#deleteFile
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
 **fileId** | **string**| The ID of the file to use for this request. |

### Return type

[**OpenAPI\Server\Model\DeleteFileResponse**](../Model/DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **downloadFile**
> string downloadFile($fileId)

Returns the contents of the specified file.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FilesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FilesApiInterface;

class FilesApi implements FilesApiInterface
{

    // ...

    /**
     * Implementation of FilesApiInterface#downloadFile
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
 **fileId** | **string**| The ID of the file to use for this request. |

### Return type

**string**

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFiles**
> OpenAPI\Server\Model\ListFilesResponse listFiles($purpose, $limit, $order, $after)

Returns a list of files.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FilesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FilesApiInterface;

class FilesApi implements FilesApiInterface
{

    // ...

    /**
     * Implementation of FilesApiInterface#listFiles
     */
    public function listFiles(?string $purpose, int $limit, string $order, ?string $after, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **string**| Only return files with the given purpose. | [optional]
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. | [optional] [default to 10000]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ListFilesResponse**](../Model/ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

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
// src/Acme/MyBundle/Api/FilesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FilesApiInterface;

class FilesApi implements FilesApiInterface
{

    // ...

    /**
     * Implementation of FilesApiInterface#retrieveFile
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
 **fileId** | **string**| The ID of the file to use for this request. |

### Return type

[**OpenAPI\Server\Model\OpenAIFile**](../Model/OpenAIFile.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

