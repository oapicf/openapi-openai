# OpenAPI\Client\CompletionsApi

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCompletion()**](CompletionsApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |


## `createCompletion()`

```php
createCompletion($create_completion_request): \OpenAPI\Client\Model\CreateCompletionResponse
```

Creates a completion for the provided prompt and parameters.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CompletionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_completion_request = new \OpenAPI\Client\Model\CreateCompletionRequest(); // \OpenAPI\Client\Model\CreateCompletionRequest

try {
    $result = $apiInstance->createCompletion($create_completion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompletionsApi->createCompletion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_completion_request** | [**\OpenAPI\Client\Model\CreateCompletionRequest**](../Model/CreateCompletionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateCompletionResponse**](../Model/CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
