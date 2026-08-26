# UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user**](UsersApi.md#delete_user) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**list_users**](UsersApi.md#list_users) | **GET** /organization/users | Lists all of the users in the organization.
[**modify_user**](UsersApi.md#modify_user) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieve_user**](UsersApi.md#retrieve_user) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **delete_user**
> `delete_user`(_api::`UsersApi`, `user_id`::`String`; _mediaType=nothing) -> `UserDeleteResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_user`(_api::`UsersApi`, response_stream::`Channel`, `user_id`::`String`; _mediaType=nothing) -> `Channel`{ `UserDeleteResponse` }, `OpenAPI.Clients.ApiResponse`

Deletes a user from the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsersApi`** | API context | 
**`user_id`** | **`String`** | The ID of the user. |

### Return type

[**`UserDeleteResponse`**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_users**
> `list_users`(_api::`UsersApi`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `UserListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_users`(_api::`UsersApi`, response_stream::`Channel`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `Channel`{ `UserListResponse` }, `OpenAPI.Clients.ApiResponse`

Lists all of the users in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsersApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`UserListResponse`**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_user**
> `modify_user`(_api::`UsersApi`, `user_id`::`String`, `user_role_update_request`::`UserRoleUpdateRequest`; _mediaType=nothing) -> `User`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_user`(_api::`UsersApi`, response_stream::`Channel`, `user_id`::`String`, `user_role_update_request`::`UserRoleUpdateRequest`; _mediaType=nothing) -> `Channel`{ `User` }, `OpenAPI.Clients.ApiResponse`

Modifies a user's role in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsersApi`** | API context | 
**`user_id`** | **`String`** | The ID of the user. |
**`user_role_update_request`** | [**`UserRoleUpdateRequest`**](UserRoleUpdateRequest.md) | The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |

### Return type

[**`User`**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_user**
> `retrieve_user`(_api::`UsersApi`, `user_id`::`String`; _mediaType=nothing) -> `User`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_user`(_api::`UsersApi`, response_stream::`Channel`, `user_id`::`String`; _mediaType=nothing) -> `Channel`{ `User` }, `OpenAPI.Clients.ApiResponse`

Retrieves a user by their identifier.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsersApi`** | API context | 
**`user_id`** | **`String`** | The ID of the user. |

### Return type

[**`User`**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

