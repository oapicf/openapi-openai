# UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user**](UsersApi.md#delete_user) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**list_users**](UsersApi.md#list_users) | **GET** /organization/users | Lists all of the users in the organization.
[**modify_user**](UsersApi.md#modify_user) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieve_user**](UsersApi.md#retrieve_user) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **delete_user**
> `delete_user`(req::`HTTP.Request`, `user_id`::`String`;) -> `UserDeleteResponse`

Deletes a user from the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`user_id`** | **`String`**| The ID of the user. |

### Return type

[**`UserDeleteResponse`**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> `list_users`(req::`HTTP.Request`; `limit`=nothing, `after`=nothing,) -> `UserListResponse`

Lists all of the users in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`UserListResponse`**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_user**
> `modify_user`(req::`HTTP.Request`, `user_id`::`String`, `user_role_update_request`::`UserRoleUpdateRequest`;) -> `User`

Modifies a user's role in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`user_id`** | **`String`**| The ID of the user. |
**`user_role_update_request`** | [**`UserRoleUpdateRequest`**](UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. |

### Return type

[**`User`**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_user**
> `retrieve_user`(req::`HTTP.Request`, `user_id`::`String`;) -> `User`

Retrieves a user by their identifier.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`user_id`** | **`String`**| The ID of the user. |

### Return type

[**`User`**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

