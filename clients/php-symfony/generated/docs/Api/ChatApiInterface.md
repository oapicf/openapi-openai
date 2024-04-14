# OpenAPI\Server\Api\ChatApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApiInterface.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ChatApi:
        tags:
            - { name: "open_api_server.api", api: "chat" }
    # ...
```

## **createChatCompletion**
> OpenAPI\Server\Model\CreateChatCompletionResponse createChatCompletion($createChatCompletionRequest)

Creates a model response for the given chat conversation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ChatApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ChatApiInterface;

class ChatApi implements ChatApiInterface
{

    // ...

    /**
     * Implementation of ChatApiInterface#createChatCompletion
     */
    public function createChatCompletion(CreateChatCompletionRequest $createChatCompletionRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**OpenAPI\Server\Model\CreateChatCompletionRequest**](../Model/CreateChatCompletionRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateChatCompletionResponse**](../Model/CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

