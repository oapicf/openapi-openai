# OpenAPI\Server\Api\UsersApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UsersApiInterface.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**listUsers**](UsersApiInterface.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**modifyUser**](UsersApiInterface.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieveUser**](UsersApiInterface.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\UsersApi:
        tags:
            - { name: "open_api_server.api", api: "users" }
    # ...
```

## **deleteUser**
> OpenAPI\Server\Model\UserDeleteResponse deleteUser($userId)

Deletes a user from the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#deleteUser
     */
    public function deleteUser(string $userId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The ID of the user. |

### Return type

[**OpenAPI\Server\Model\UserDeleteResponse**](../Model/UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listUsers**
> OpenAPI\Server\Model\UserListResponse listUsers($limit, $after)

Lists all of the users in the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#listUsers
     */
    public function listUsers(int $limit, ?string $after, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\UserListResponse**](../Model/UserListResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyUser**
> OpenAPI\Server\Model\User modifyUser($userId, $userRoleUpdateRequest)

Modifies a user's role in the organization.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#modifyUser
     */
    public function modifyUser(string $userId, UserRoleUpdateRequest $userRoleUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The ID of the user. |
 **userRoleUpdateRequest** | [**OpenAPI\Server\Model\UserRoleUpdateRequest**](../Model/UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |

### Return type

[**OpenAPI\Server\Model\User**](../Model/User.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveUser**
> OpenAPI\Server\Model\User retrieveUser($userId)

Retrieves a user by their identifier.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/UsersApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\UsersApiInterface;

class UsersApi implements UsersApiInterface
{

    // ...

    /**
     * Implementation of UsersApiInterface#retrieveUser
     */
    public function retrieveUser(string $userId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string**| The ID of the user. |

### Return type

[**OpenAPI\Server\Model\User**](../Model/User.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

