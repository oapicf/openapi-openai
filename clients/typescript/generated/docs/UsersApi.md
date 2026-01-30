# .UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**listUsers**](UsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**modifyUser**](UsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user\&#39;s role in the organization.
[**retrieveUser**](UsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **deleteUser**
> UserDeleteResponse deleteUser()


### Example


```typescript
import { createConfiguration, UsersApi } from '';
import type { UsersApiDeleteUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

const request: UsersApiDeleteUserRequest = {
    // The ID of the user.
  userId: "user_id_example",
};

const data = await apiInstance.deleteUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | The ID of the user. | defaults to undefined


### Return type

**UserDeleteResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listUsers**
> UserListResponse listUsers()


### Example


```typescript
import { createConfiguration, UsersApi } from '';
import type { UsersApiListUsersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

const request: UsersApiListUsersRequest = {
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
};

const data = await apiInstance.listUsers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined


### Return type

**UserListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Users listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **modifyUser**
> User modifyUser(userRoleUpdateRequest)


### Example


```typescript
import { createConfiguration, UsersApi } from '';
import type { UsersApiModifyUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

const request: UsersApiModifyUserRequest = {
    // The ID of the user.
  userId: "user_id_example",
    // The new user role to modify. This must be one of `owner` or `member`.
  userRoleUpdateRequest: {
    role: "owner",
  },
};

const data = await apiInstance.modifyUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userRoleUpdateRequest** | **UserRoleUpdateRequest**| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |
 **userId** | [**string**] | The ID of the user. | defaults to undefined


### Return type

**User**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User role updated successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveUser**
> User retrieveUser()


### Example


```typescript
import { createConfiguration, UsersApi } from '';
import type { UsersApiRetrieveUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new UsersApi(configuration);

const request: UsersApiRetrieveUserRequest = {
    // The ID of the user.
  userId: "user_id_example",
};

const data = await apiInstance.retrieveUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | The ID of the user. | defaults to undefined


### Return type

**User**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


