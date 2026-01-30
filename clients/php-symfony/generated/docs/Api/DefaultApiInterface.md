# OpenAPI\Server\Api\DefaultApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](DefaultApiInterface.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](DefaultApiInterface.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](DefaultApiInterface.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](DefaultApiInterface.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\DefaultApi:
        tags:
            - { name: "open_api_server.api", api: "default" }
    # ...
```

## **adminApiKeysCreate**
> OpenAPI\Server\Model\AdminApiKey adminApiKeysCreate($adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#adminApiKeysCreate
     */
    public function adminApiKeysCreate(AdminApiKeysCreateRequest $adminApiKeysCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminApiKeysCreateRequest** | [**OpenAPI\Server\Model\AdminApiKeysCreateRequest**](../Model/AdminApiKeysCreateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AdminApiKey**](../Model/AdminApiKey.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adminApiKeysDelete**
> OpenAPI\Server\Model\AdminApiKeysDelete200Response adminApiKeysDelete($keyId)

Delete an organization admin API key

Delete the specified admin API key.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#adminApiKeysDelete
     */
    public function adminApiKeysDelete(string $keyId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **string**|  |

### Return type

[**OpenAPI\Server\Model\AdminApiKeysDelete200Response**](../Model/AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adminApiKeysGet**
> OpenAPI\Server\Model\AdminApiKey adminApiKeysGet($keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#adminApiKeysGet
     */
    public function adminApiKeysGet(string $keyId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **string**|  |

### Return type

[**OpenAPI\Server\Model\AdminApiKey**](../Model/AdminApiKey.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adminApiKeysList**
> OpenAPI\Server\Model\ApiKeyList adminApiKeysList($after, $order, $limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#adminApiKeysList
     */
    public function adminApiKeysList(?string $after, string $order, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string**|  | [optional]
 **order** | **string**|  | [optional] [default to &#39;asc&#39;]
 **limit** | **int**|  | [optional] [default to 20]

### Return type

[**OpenAPI\Server\Model\ApiKeyList**](../Model/ApiKeyList.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

