# OpenAPI\Client\EmbeddingsApi

Get a vector representation of a given input that can be easily consumed by machine learning models and algorithms.

All URIs are relative to https://api.openai.com/v1, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmbedding()**](EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |


## `createEmbedding()`

```php
createEmbedding($create_embedding_request): \OpenAPI\Client\Model\CreateEmbeddingResponse
```

Creates an embedding vector representing the input text.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: ApiKeyAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\EmbeddingsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_embedding_request = new \OpenAPI\Client\Model\CreateEmbeddingRequest(); // \OpenAPI\Client\Model\CreateEmbeddingRequest

try {
    $result = $apiInstance->createEmbedding($create_embedding_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling EmbeddingsApi->createEmbedding: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_embedding_request** | [**\OpenAPI\Client\Model\CreateEmbeddingRequest**](../Model/CreateEmbeddingRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateEmbeddingResponse**](../Model/CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
