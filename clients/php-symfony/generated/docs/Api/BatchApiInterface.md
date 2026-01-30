# OpenAPI\Server\Api\BatchApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatch**](BatchApiInterface.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**createBatch**](BatchApiInterface.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**listBatches**](BatchApiInterface.md#listBatches) | **GET** /batches | List your organization&#39;s batches.
[**retrieveBatch**](BatchApiInterface.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BatchApi:
        tags:
            - { name: "open_api_server.api", api: "batch" }
    # ...
```

## **cancelBatch**
> OpenAPI\Server\Model\Batch cancelBatch($batchId)

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BatchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BatchApiInterface;

class BatchApi implements BatchApiInterface
{

    // ...

    /**
     * Implementation of BatchApiInterface#cancelBatch
     */
    public function cancelBatch(string $batchId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| The ID of the batch to cancel. |

### Return type

[**OpenAPI\Server\Model\Batch**](../Model/Batch.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createBatch**
> OpenAPI\Server\Model\Batch createBatch($createBatchRequest)

Creates and executes a batch from an uploaded file of requests

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BatchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BatchApiInterface;

class BatchApi implements BatchApiInterface
{

    // ...

    /**
     * Implementation of BatchApiInterface#createBatch
     */
    public function createBatch(CreateBatchRequest $createBatchRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBatchRequest** | [**OpenAPI\Server\Model\CreateBatchRequest**](../Model/CreateBatchRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\Batch**](../Model/Batch.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listBatches**
> OpenAPI\Server\Model\ListBatchesResponse listBatches($after, $limit)

List your organization's batches.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BatchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BatchApiInterface;

class BatchApi implements BatchApiInterface
{

    // ...

    /**
     * Implementation of BatchApiInterface#listBatches
     */
    public function listBatches(?string $after, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]

### Return type

[**OpenAPI\Server\Model\ListBatchesResponse**](../Model/ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveBatch**
> OpenAPI\Server\Model\Batch retrieveBatch($batchId)

Retrieves a batch.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BatchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BatchApiInterface;

class BatchApi implements BatchApiInterface
{

    // ...

    /**
     * Implementation of BatchApiInterface#retrieveBatch
     */
    public function retrieveBatch(string $batchId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| The ID of the batch to retrieve. |

### Return type

[**OpenAPI\Server\Model\Batch**](../Model/Batch.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

