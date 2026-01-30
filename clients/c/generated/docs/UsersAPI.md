# UsersAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsersAPI_deleteUser**](UsersAPI.md#UsersAPI_deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**UsersAPI_listUsers**](UsersAPI.md#UsersAPI_listUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**UsersAPI_modifyUser**](UsersAPI.md#UsersAPI_modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**UsersAPI_retrieveUser**](UsersAPI.md#UsersAPI_retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **UsersAPI_deleteUser**
```c
// Deletes a user from the organization.
//
user_delete_response_t* UsersAPI_deleteUser(apiClient_t *apiClient, char *user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_id** | **char \*** | The ID of the user. | 

### Return type

[user_delete_response_t](user_delete_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_listUsers**
```c
// Lists all of the users in the organization.
//
user_list_response_t* UsersAPI_listUsers(apiClient_t *apiClient, int *limit, char *after);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[user_list_response_t](user_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_modifyUser**
```c
// Modifies a user's role in the organization.
//
user_t* UsersAPI_modifyUser(apiClient_t *apiClient, char *user_id, user_role_update_request_t *user_role_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_id** | **char \*** | The ID of the user. | 
**user_role_update_request** | **[user_role_update_request_t](user_role_update_request.md) \*** | The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | 

### Return type

[user_t](user.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsersAPI_retrieveUser**
```c
// Retrieves a user by their identifier.
//
user_t* UsersAPI_retrieveUser(apiClient_t *apiClient, char *user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**user_id** | **char \*** | The ID of the user. | 

### Return type

[user_t](user.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

