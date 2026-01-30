# OpenAPI\Server\Api\InvitesApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvite**](InvitesApiInterface.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**inviteUser**](InvitesApiInterface.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**listInvites**](InvitesApiInterface.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieveInvite**](InvitesApiInterface.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\InvitesApi:
        tags:
            - { name: "open_api_server.api", api: "invites" }
    # ...
```

## **deleteInvite**
> OpenAPI\Server\Model\InviteDeleteResponse deleteInvite($inviteId)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/InvitesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\InvitesApiInterface;

class InvitesApi implements InvitesApiInterface
{

    // ...

    /**
     * Implementation of InvitesApiInterface#deleteInvite
     */
    public function deleteInvite(string $inviteId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **string**| The ID of the invite to delete. |

### Return type

[**OpenAPI\Server\Model\InviteDeleteResponse**](../Model/InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **inviteUser**
> OpenAPI\Server\Model\Invite inviteUser($inviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/InvitesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\InvitesApiInterface;

class InvitesApi implements InvitesApiInterface
{

    // ...

    /**
     * Implementation of InvitesApiInterface#inviteUser
     */
    public function inviteUser(InviteRequest $inviteRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteRequest** | [**OpenAPI\Server\Model\InviteRequest**](../Model/InviteRequest.md)| The invite request payload. |

### Return type

[**OpenAPI\Server\Model\Invite**](../Model/Invite.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listInvites**
> OpenAPI\Server\Model\InviteListResponse listInvites($limit, $after)

Returns a list of invites in the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/InvitesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\InvitesApiInterface;

class InvitesApi implements InvitesApiInterface
{

    // ...

    /**
     * Implementation of InvitesApiInterface#listInvites
     */
    public function listInvites(int $limit, ?string $after, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\InviteListResponse**](../Model/InviteListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveInvite**
> OpenAPI\Server\Model\Invite retrieveInvite($inviteId)

Retrieves an invite.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/InvitesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\InvitesApiInterface;

class InvitesApi implements InvitesApiInterface
{

    // ...

    /**
     * Implementation of InvitesApiInterface#retrieveInvite
     */
    public function retrieveInvite(string $inviteId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **string**| The ID of the invite to retrieve. |

### Return type

[**OpenAPI\Server\Model\Invite**](../Model/Invite.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

