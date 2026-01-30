# UsersApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization. |
| [**listUsers**](UsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization. |
| [**modifyUser**](UsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization. |
| [**retrieveUser**](UsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier. |


<a name="deleteUser"></a>
# **deleteUser**
> UserDeleteResponse deleteUser(user\_id)

Deletes a user from the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user\_id** | **String**| The ID of the user. | [default to null] |

### Return type

[**UserDeleteResponse**](../Models/UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> UserListResponse listUsers(limit, after)

Lists all of the users in the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null] |

### Return type

[**UserListResponse**](../Models/UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="modifyUser"></a>
# **modifyUser**
> User modifyUser(user\_id, UserRoleUpdateRequest)

Modifies a user&#39;s role in the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user\_id** | **String**| The ID of the user. | [default to null] |
| **UserRoleUpdateRequest** | [**UserRoleUpdateRequest**](../Models/UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | |

### Return type

[**User**](../Models/User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="retrieveUser"></a>
# **retrieveUser**
> User retrieveUser(user\_id)

Retrieves a user by their identifier.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user\_id** | **String**| The ID of the user. | [default to null] |

### Return type

[**User**](../Models/User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

