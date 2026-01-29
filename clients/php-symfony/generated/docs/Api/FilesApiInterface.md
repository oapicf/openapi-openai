# OpenAPI\Server\Api\FilesApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](FilesApiInterface.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
[**deleteFile**](FilesApiInterface.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](FilesApiInterface.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](FilesApiInterface.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
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

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.

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
 **purpose** | **string**| The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. |

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
> OpenAPI\Server\Model\ListFilesResponse listFiles($purpose)

Returns a list of files that belong to the user's organization.

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
    public function listFiles(?string $purpose, int &$responseCode, array &$responseHeaders): array|object|null
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

