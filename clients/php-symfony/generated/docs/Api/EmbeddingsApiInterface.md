# OpenAPI\Server\Api\EmbeddingsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](EmbeddingsApiInterface.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\EmbeddingsApi:
        tags:
            - { name: "open_api_server.api", api: "embeddings" }
    # ...
```

## **createEmbedding**
> OpenAPI\Server\Model\CreateEmbeddingResponse createEmbedding($createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EmbeddingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EmbeddingsApiInterface;

class EmbeddingsApi implements EmbeddingsApiInterface
{

    // ...

    /**
     * Implementation of EmbeddingsApiInterface#createEmbedding
     */
    public function createEmbedding(CreateEmbeddingRequest $createEmbeddingRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**OpenAPI\Server\Model\CreateEmbeddingRequest**](../Model/CreateEmbeddingRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateEmbeddingResponse**](../Model/CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

