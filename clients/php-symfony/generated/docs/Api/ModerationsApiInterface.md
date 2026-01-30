# OpenAPI\Server\Api\ModerationsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](ModerationsApiInterface.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ModerationsApi:
        tags:
            - { name: "open_api_server.api", api: "moderations" }
    # ...
```

## **createModeration**
> OpenAPI\Server\Model\CreateModerationResponse createModeration($createModerationRequest)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ModerationsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ModerationsApiInterface;

class ModerationsApi implements ModerationsApiInterface
{

    // ...

    /**
     * Implementation of ModerationsApiInterface#createModeration
     */
    public function createModeration(CreateModerationRequest $createModerationRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**OpenAPI\Server\Model\CreateModerationRequest**](../Model/CreateModerationRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateModerationResponse**](../Model/CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

