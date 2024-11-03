# OpenAPI\Server\Api\CompletionsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](CompletionsApiInterface.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CompletionsApi:
        tags:
            - { name: "open_api_server.api", api: "completions" }
    # ...
```

## **createCompletion**
> OpenAPI\Server\Model\CreateCompletionResponse createCompletion($createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CompletionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CompletionsApiInterface;

class CompletionsApi implements CompletionsApiInterface
{

    // ...

    /**
     * Implementation of CompletionsApiInterface#createCompletion
     */
    public function createCompletion(CreateCompletionRequest $createCompletionRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**OpenAPI\Server\Model\CreateCompletionRequest**](../Model/CreateCompletionRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateCompletionResponse**](../Model/CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

