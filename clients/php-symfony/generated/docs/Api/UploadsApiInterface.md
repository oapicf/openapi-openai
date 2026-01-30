# OpenAPI\Server\Api\UploadsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUploadPart**](UploadsApiInterface.md#addUploadPart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).
[**cancelUpload**](UploadsApiInterface.md#cancelUpload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled.
[**completeUpload**](UploadsApiInterface.md#completeUpload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.
[**createUpload**](UploadsApiInterface.md#createUpload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\UploadsApi:
        tags:
            - { name: "open_api_server.api", api: "uploads" }
    # ...
```

## **addUploadPart**
> OpenAPI\Server\Model\UploadPart addUploadPart($uploadId, $data)

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UploadsApiInterface;

class UploadsApi implements UploadsApiInterface
{

    // ...

    /**
     * Implementation of UploadsApiInterface#addUploadPart
     */
    public function addUploadPart(string $uploadId, UploadedFile $data, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **string**| The ID of the Upload. |
 **data** | **UploadedFile****UploadedFile**| The chunk of bytes for this Part. |

### Return type

[**OpenAPI\Server\Model\UploadPart**](../Model/UploadPart.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **cancelUpload**
> OpenAPI\Server\Model\Upload cancelUpload($uploadId)

Cancels the Upload. No Parts may be added after an Upload is cancelled.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UploadsApiInterface;

class UploadsApi implements UploadsApiInterface
{

    // ...

    /**
     * Implementation of UploadsApiInterface#cancelUpload
     */
    public function cancelUpload(string $uploadId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **string**| The ID of the Upload. |

### Return type

[**OpenAPI\Server\Model\Upload**](../Model/Upload.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **completeUpload**
> OpenAPI\Server\Model\Upload completeUpload($uploadId, $completeUploadRequest)

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UploadsApiInterface;

class UploadsApi implements UploadsApiInterface
{

    // ...

    /**
     * Implementation of UploadsApiInterface#completeUpload
     */
    public function completeUpload(string $uploadId, CompleteUploadRequest $completeUploadRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **string**| The ID of the Upload. |
 **completeUploadRequest** | [**OpenAPI\Server\Model\CompleteUploadRequest**](../Model/CompleteUploadRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\Upload**](../Model/Upload.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createUpload**
> OpenAPI\Server\Model\Upload createUpload($createUploadRequest)

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UploadsApiInterface;

class UploadsApi implements UploadsApiInterface
{

    // ...

    /**
     * Implementation of UploadsApiInterface#createUpload
     */
    public function createUpload(CreateUploadRequest $createUploadRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUploadRequest** | [**OpenAPI\Server\Model\CreateUploadRequest**](../Model/CreateUploadRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\Upload**](../Model/Upload.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

