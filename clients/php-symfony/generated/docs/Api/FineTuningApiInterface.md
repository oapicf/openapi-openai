# OpenAPI\Server\Api\FineTuningApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](FineTuningApiInterface.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.
[**createFineTuningJob**](FineTuningApiInterface.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)
[**listFineTuningEvents**](FineTuningApiInterface.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.
[**listFineTuningJobCheckpoints**](FineTuningApiInterface.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.
[**listPaginatedFineTuningJobs**](FineTuningApiInterface.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs
[**retrieveFineTuningJob**](FineTuningApiInterface.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\FineTuningApi:
        tags:
            - { name: "open_api_server.api", api: "fineTuning" }
    # ...
```

## **cancelFineTuningJob**
> OpenAPI\Server\Model\FineTuningJob cancelFineTuningJob($fineTuningJobId)

Immediately cancel a fine-tune job.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FineTuningApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FineTuningApiInterface;

class FineTuningApi implements FineTuningApiInterface
{

    // ...

    /**
     * Implementation of FineTuningApiInterface#cancelFineTuningJob
     */
    public function cancelFineTuningJob(string $fineTuningJobId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **string**| The ID of the fine-tuning job to cancel. |

### Return type

[**OpenAPI\Server\Model\FineTuningJob**](../Model/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createFineTuningJob**
> OpenAPI\Server\Model\FineTuningJob createFineTuningJob($createFineTuningJobRequest)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FineTuningApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FineTuningApiInterface;

class FineTuningApi implements FineTuningApiInterface
{

    // ...

    /**
     * Implementation of FineTuningApiInterface#createFineTuningJob
     */
    public function createFineTuningJob(CreateFineTuningJobRequest $createFineTuningJobRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuningJobRequest** | [**OpenAPI\Server\Model\CreateFineTuningJobRequest**](../Model/CreateFineTuningJobRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\FineTuningJob**](../Model/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFineTuningEvents**
> OpenAPI\Server\Model\ListFineTuningJobEventsResponse listFineTuningEvents($fineTuningJobId, $after, $limit)

Get status updates for a fine-tuning job.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FineTuningApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FineTuningApiInterface;

class FineTuningApi implements FineTuningApiInterface
{

    // ...

    /**
     * Implementation of FineTuningApiInterface#listFineTuningEvents
     */
    public function listFineTuningEvents(string $fineTuningJobId, ?string $after, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **string**| The ID of the fine-tuning job to get events for. |
 **after** | **string**| Identifier for the last event from the previous pagination request. | [optional]
 **limit** | **int**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**OpenAPI\Server\Model\ListFineTuningJobEventsResponse**](../Model/ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFineTuningJobCheckpoints**
> OpenAPI\Server\Model\ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints($fineTuningJobId, $after, $limit)

List checkpoints for a fine-tuning job.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FineTuningApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FineTuningApiInterface;

class FineTuningApi implements FineTuningApiInterface
{

    // ...

    /**
     * Implementation of FineTuningApiInterface#listFineTuningJobCheckpoints
     */
    public function listFineTuningJobCheckpoints(string $fineTuningJobId, ?string $after, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **string**| The ID of the fine-tuning job to get checkpoints for. |
 **after** | **string**| Identifier for the last checkpoint ID from the previous pagination request. | [optional]
 **limit** | **int**| Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**OpenAPI\Server\Model\ListFineTuningJobCheckpointsResponse**](../Model/ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listPaginatedFineTuningJobs**
> OpenAPI\Server\Model\ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs($after, $limit)

List your organization's fine-tuning jobs

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FineTuningApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FineTuningApiInterface;

class FineTuningApi implements FineTuningApiInterface
{

    // ...

    /**
     * Implementation of FineTuningApiInterface#listPaginatedFineTuningJobs
     */
    public function listPaginatedFineTuningJobs(?string $after, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string**| Identifier for the last job from the previous pagination request. | [optional]
 **limit** | **int**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**OpenAPI\Server\Model\ListPaginatedFineTuningJobsResponse**](../Model/ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveFineTuningJob**
> OpenAPI\Server\Model\FineTuningJob retrieveFineTuningJob($fineTuningJobId)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/FineTuningApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\FineTuningApiInterface;

class FineTuningApi implements FineTuningApiInterface
{

    // ...

    /**
     * Implementation of FineTuningApiInterface#retrieveFineTuningJob
     */
    public function retrieveFineTuningJob(string $fineTuningJobId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **string**| The ID of the fine-tuning job. |

### Return type

[**OpenAPI\Server\Model\FineTuningJob**](../Model/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

