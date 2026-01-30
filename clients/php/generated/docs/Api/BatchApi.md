# OpenAPI\Client\BatchApi

Create large batches of API requests to run asynchronously.

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelBatch()**](BatchApi.md#cancelBatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**createBatch()**](BatchApi.md#createBatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**listBatches()**](BatchApi.md#listBatches) | **GET** /batches | List your organization&#39;s batches. |
| [**retrieveBatch()**](BatchApi.md#retrieveBatch) | **GET** /batches/{batch_id} | Retrieves a batch. |


## `cancelBatch()`

```php
cancelBatch($batch_id): \OpenAPI\Client\Model\Batch
```

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$batch_id = 'batch_id_example'; // string | The ID of the batch to cancel.

try {
    $result = $apiInstance->cancelBatch($batch_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->cancelBatch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batch_id** | **string**| The ID of the batch to cancel. | |

### Return type

[**\OpenAPI\Client\Model\Batch**](../Model/Batch.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createBatch()`

```php
createBatch($create_batch_request): \OpenAPI\Client\Model\Batch
```

Creates and executes a batch from an uploaded file of requests

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_batch_request = new \OpenAPI\Client\Model\CreateBatchRequest(); // \OpenAPI\Client\Model\CreateBatchRequest

try {
    $result = $apiInstance->createBatch($create_batch_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->createBatch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_batch_request** | [**\OpenAPI\Client\Model\CreateBatchRequest**](../Model/CreateBatchRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\Batch**](../Model/Batch.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listBatches()`

```php
listBatches($after, $limit): \OpenAPI\Client\Model\ListBatchesResponse
```

List your organization's batches.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$after = 'after_example'; // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
$limit = 20; // int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.

try {
    $result = $apiInstance->listBatches($after, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->listBatches: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |
| **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20] |

### Return type

[**\OpenAPI\Client\Model\ListBatchesResponse**](../Model/ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `retrieveBatch()`

```php
retrieveBatch($batch_id): \OpenAPI\Client\Model\Batch
```

Retrieves a batch.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$batch_id = 'batch_id_example'; // string | The ID of the batch to retrieve.

try {
    $result = $apiInstance->retrieveBatch($batch_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->retrieveBatch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batch_id** | **string**| The ID of the batch to retrieve. | |

### Return type

[**\OpenAPI\Client\Model\Batch**](../Model/Batch.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
