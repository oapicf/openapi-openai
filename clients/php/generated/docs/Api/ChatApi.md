# OpenAPI\Client\ChatApi

Given a list of messages comprising a conversation, the model will return a response.

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createChatCompletion()**](ChatApi.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |


## `createChatCompletion()`

```php
createChatCompletion($create_chat_completion_request): \OpenAPI\Client\Model\CreateChatCompletionResponse
```

Creates a model response for the given chat conversation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ChatApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_chat_completion_request = new \OpenAPI\Client\Model\CreateChatCompletionRequest(); // \OpenAPI\Client\Model\CreateChatCompletionRequest

try {
    $result = $apiInstance->createChatCompletion($create_chat_completion_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ChatApi->createChatCompletion: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_chat_completion_request** | [**\OpenAPI\Client\Model\CreateChatCompletionRequest**](../Model/CreateChatCompletionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateChatCompletionResponse**](../Model/CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
