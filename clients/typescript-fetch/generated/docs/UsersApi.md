# UsersApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UsersApi.md#deleteuser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization. |
| [**listUsers**](UsersApi.md#listusers) | **GET** /organization/users | Lists all of the users in the organization. |
| [**modifyUser**](UsersApi.md#modifyuser) | **POST** /organization/users/{user_id} | Modifies a user\&#39;s role in the organization. |
| [**retrieveUser**](UsersApi.md#retrieveuser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier. |



## deleteUser

> UserDeleteResponse deleteUser(userId)

Deletes a user from the organization.

### Example

```ts
import {
  Configuration,
  UsersApi,
} from '';
import type { DeleteUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsersApi(config);

  const body = {
    // string | The ID of the user.
    userId: userId_example,
  } satisfies DeleteUserRequest;

  try {
    const data = await api.deleteUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | `string` | The ID of the user. | [Defaults to `undefined`] |

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listUsers

> UserListResponse listUsers(limit, after)

Lists all of the users in the organization.

### Example

```ts
import {
  Configuration,
  UsersApi,
} from '';
import type { ListUsersRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsersApi(config);

  const body = {
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
  } satisfies ListUsersRequest;

  try {
    const data = await api.listUsers(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Users listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## modifyUser

> User modifyUser(userId, userRoleUpdateRequest)

Modifies a user\&#39;s role in the organization.

### Example

```ts
import {
  Configuration,
  UsersApi,
} from '';
import type { ModifyUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsersApi(config);

  const body = {
    // string | The ID of the user.
    userId: userId_example,
    // UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.
    userRoleUpdateRequest: ...,
  } satisfies ModifyUserRequest;

  try {
    const data = await api.modifyUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | `string` | The ID of the user. | [Defaults to `undefined`] |
| **userRoleUpdateRequest** | [UserRoleUpdateRequest](UserRoleUpdateRequest.md) | The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role updated successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveUser

> User retrieveUser(userId)

Retrieves a user by their identifier.

### Example

```ts
import {
  Configuration,
  UsersApi,
} from '';
import type { RetrieveUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsersApi(config);

  const body = {
    // string | The ID of the user.
    userId: userId_example,
  } satisfies RetrieveUserRequest;

  try {
    const data = await api.retrieveUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | `string` | The ID of the user. | [Defaults to `undefined`] |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

