# USERS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_user**](USERS_API.md#delete_user) | **Delete** /organization/users/{user_id} | Deletes a user from the organization.
[**list_users**](USERS_API.md#list_users) | **Get** /organization/users | Lists all of the users in the organization.
[**modify_user**](USERS_API.md#modify_user) | **Post** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieve_user**](USERS_API.md#retrieve_user) | **Get** /organization/users/{user_id} | Retrieves a user by their identifier.


# **delete_user**
> delete_user (user_id: STRING_32 ): detachable USER_DELETE_RESPONSE


Deletes a user from the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **STRING_32**| The ID of the user. | [default to null]

### Return type

[**USER_DELETE_RESPONSE**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> list_users (limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ): detachable USER_LIST_RESPONSE


Lists all of the users in the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**USER_LIST_RESPONSE**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_user**
> modify_user (user_id: STRING_32 ; user_role_update_request: USER_ROLE_UPDATE_REQUEST ): detachable USER


Modifies a user's role in the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **STRING_32**| The ID of the user. | [default to null]
 **user_role_update_request** | [**USER_ROLE_UPDATE_REQUEST**](USER_ROLE_UPDATE_REQUEST.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | 

### Return type

[**USER**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_user**
> retrieve_user (user_id: STRING_32 ): detachable USER


Retrieves a user by their identifier.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **STRING_32**| The ID of the user. | [default to null]

### Return type

[**USER**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

