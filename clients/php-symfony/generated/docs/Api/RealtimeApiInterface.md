# OpenAPI\Server\Api\RealtimeApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRealtimeSession**](RealtimeApiInterface.md#createRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\RealtimeApi:
        tags:
            - { name: "open_api_server.api", api: "realtime" }
    # ...
```

## **createRealtimeSession**
> OpenAPI\Server\Model\RealtimeSessionCreateResponse createRealtimeSession($realtimeSessionCreateRequest)

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RealtimeApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RealtimeApiInterface;

class RealtimeApi implements RealtimeApiInterface
{

    // ...

    /**
     * Implementation of RealtimeApiInterface#createRealtimeSession
     */
    public function createRealtimeSession(RealtimeSessionCreateRequest $realtimeSessionCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeSessionCreateRequest** | [**OpenAPI\Server\Model\RealtimeSessionCreateRequest**](../Model/RealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. |

### Return type

[**OpenAPI\Server\Model\RealtimeSessionCreateResponse**](../Model/RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

