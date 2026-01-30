# Org.OpenAPITools.Api.UsersApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteUser**](UsersApi.md#deleteuser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization. |
| [**ListUsers**](UsersApi.md#listusers) | **GET** /organization/users | Lists all of the users in the organization. |
| [**ModifyUser**](UsersApi.md#modifyuser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization. |
| [**RetrieveUser**](UsersApi.md#retrieveuser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier. |

<a id="deleteuser"></a>
# **DeleteUser**
> UserDeleteResponse DeleteUser (string userId)

Deletes a user from the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | The ID of the user. |  |

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listusers"></a>
# **ListUsers**
> UserListResponse ListUsers (int limit = null, string after = null)

Lists all of the users in the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **after** | **string** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]  |

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Users listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="modifyuser"></a>
# **ModifyUser**
> User ModifyUser (string userId, UserRoleUpdateRequest userRoleUpdateRequest)

Modifies a user's role in the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | The ID of the user. |  |
| **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md) | The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |  |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User role updated successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrieveuser"></a>
# **RetrieveUser**
> User RetrieveUser (string userId)

Retrieves a user by their identifier.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **userId** | **string** | The ID of the user. |  |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

