# UsersApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**listUsers**](UsersApi.md#listUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**modifyUser**](UsersApi.md#modifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieveUser**](UsersApi.md#retrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.



## deleteUser

Deletes a user from the organization.

### Example

```bash
 deleteUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | The ID of the user. | [default to null]

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## listUsers

Lists all of the users in the organization.

### Example

```bash
 listUsers  limit=value  after=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **after** | **string** | A cursor for use in pagination. 'after' is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. | [optional] [default to null]

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modifyUser

Modifies a user's role in the organization.

### Example

```bash
 modifyUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | The ID of the user. | [default to null]
 **userRoleUpdateRequest** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md) | The new user role to modify. This must be one of 'owner' or 'member'. |

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieveUser

Retrieves a user by their identifier.

### Example

```bash
 retrieveUser user_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **string** | The ID of the user. | [default to null]

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

