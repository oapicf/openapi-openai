# OpenAPI\Server\Api\ChatApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](ChatApiInterface.md#createChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).


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

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning).

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

