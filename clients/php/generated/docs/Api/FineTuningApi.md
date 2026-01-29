# OpenAPI\Client\FineTuningApi



All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelFineTuningJob()**](FineTuningApi.md#cancelFineTuningJob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. |
| [**createFineTuningJob()**](FineTuningApi.md#createFineTuningJob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) |
| [**listFineTuningEvents()**](FineTuningApi.md#listFineTuningEvents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. |
| [**listFineTuningJobCheckpoints()**](FineTuningApi.md#listFineTuningJobCheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. |
| [**listPaginatedFineTuningJobs()**](FineTuningApi.md#listPaginatedFineTuningJobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs |
| [**retrieveFineTuningJob()**](FineTuningApi.md#retrieveFineTuningJob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) |


## `cancelFineTuningJob()`

```php
cancelFineTuningJob($fine_tuning_job_id): \OpenAPI\Client\Model\FineTuningJob
```

Immediately cancel a fine-tune job.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FineTuningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tuning job to cancel.

try {
    $result = $apiInstance->cancelFineTuningJob($fine_tuning_job_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FineTuningApi->cancelFineTuningJob: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tuning_job_id** | **string**| The ID of the fine-tuning job to cancel. | |

### Return type

[**\OpenAPI\Client\Model\FineTuningJob**](../Model/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createFineTuningJob()`

```php
createFineTuningJob($create_fine_tuning_job_request): \OpenAPI\Client\Model\FineTuningJob
```

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FineTuningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_fine_tuning_job_request = new \OpenAPI\Client\Model\CreateFineTuningJobRequest(); // \OpenAPI\Client\Model\CreateFineTuningJobRequest

try {
    $result = $apiInstance->createFineTuningJob($create_fine_tuning_job_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FineTuningApi->createFineTuningJob: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_fine_tuning_job_request** | [**\OpenAPI\Client\Model\CreateFineTuningJobRequest**](../Model/CreateFineTuningJobRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\FineTuningJob**](../Model/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listFineTuningEvents()`

```php
listFineTuningEvents($fine_tuning_job_id, $after, $limit): \OpenAPI\Client\Model\ListFineTuningJobEventsResponse
```

Get status updates for a fine-tuning job.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FineTuningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tuning job to get events for.
$after = 'after_example'; // string | Identifier for the last event from the previous pagination request.
$limit = 20; // int | Number of events to retrieve.

try {
    $result = $apiInstance->listFineTuningEvents($fine_tuning_job_id, $after, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FineTuningApi->listFineTuningEvents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tuning_job_id** | **string**| The ID of the fine-tuning job to get events for. | |
| **after** | **string**| Identifier for the last event from the previous pagination request. | [optional] |
| **limit** | **int**| Number of events to retrieve. | [optional] [default to 20] |

### Return type

[**\OpenAPI\Client\Model\ListFineTuningJobEventsResponse**](../Model/ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listFineTuningJobCheckpoints()`

```php
listFineTuningJobCheckpoints($fine_tuning_job_id, $after, $limit): \OpenAPI\Client\Model\ListFineTuningJobCheckpointsResponse
```

List checkpoints for a fine-tuning job.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FineTuningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tuning job to get checkpoints for.
$after = 'after_example'; // string | Identifier for the last checkpoint ID from the previous pagination request.
$limit = 10; // int | Number of checkpoints to retrieve.

try {
    $result = $apiInstance->listFineTuningJobCheckpoints($fine_tuning_job_id, $after, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FineTuningApi->listFineTuningJobCheckpoints: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tuning_job_id** | **string**| The ID of the fine-tuning job to get checkpoints for. | |
| **after** | **string**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] |
| **limit** | **int**| Number of checkpoints to retrieve. | [optional] [default to 10] |

### Return type

[**\OpenAPI\Client\Model\ListFineTuningJobCheckpointsResponse**](../Model/ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listPaginatedFineTuningJobs()`

```php
listPaginatedFineTuningJobs($after, $limit): \OpenAPI\Client\Model\ListPaginatedFineTuningJobsResponse
```

List your organization's fine-tuning jobs

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FineTuningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$after = 'after_example'; // string | Identifier for the last job from the previous pagination request.
$limit = 20; // int | Number of fine-tuning jobs to retrieve.

try {
    $result = $apiInstance->listPaginatedFineTuningJobs($after, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FineTuningApi->listPaginatedFineTuningJobs: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **string**| Identifier for the last job from the previous pagination request. | [optional] |
| **limit** | **int**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20] |

### Return type

[**\OpenAPI\Client\Model\ListPaginatedFineTuningJobsResponse**](../Model/ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveFineTuningJob()`

```php
retrieveFineTuningJob($fine_tuning_job_id): \OpenAPI\Client\Model\FineTuningJob
```

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\FineTuningApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // string | The ID of the fine-tuning job.

try {
    $result = $apiInstance->retrieveFineTuningJob($fine_tuning_job_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling FineTuningApi->retrieveFineTuningJob: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fine_tuning_job_id** | **string**| The ID of the fine-tuning job. | |

### Return type

[**\OpenAPI\Client\Model\FineTuningJob**](../Model/FineTuningJob.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
