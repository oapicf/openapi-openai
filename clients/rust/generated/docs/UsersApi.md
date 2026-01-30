# \UsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user**](UsersApi.md#delete_user) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**list_users**](UsersApi.md#list_users) | **GET** /organization/users | Lists all of the users in the organization.
[**modify_user**](UsersApi.md#modify_user) | **POST** /organization/users/{user_id} | Modifies a user's role in the organization.
[**retrieve_user**](UsersApi.md#retrieve_user) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.



## delete_user

> models::UserDeleteResponse delete_user(user_id)
Deletes a user from the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | **String** | The ID of the user. | [required] |

### Return type

[**models::UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_users

> models::UserListResponse list_users(limit, after)
Lists all of the users in the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  |  |[default to 20]
**after** | Option<**String**> | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  |  |

### Return type

[**models::UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## modify_user

> models::User modify_user(user_id, user_role_update_request)
Modifies a user's role in the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | **String** | The ID of the user. | [required] |
**user_role_update_request** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md) | The new user role to modify. This must be one of `owner` or `member`. | [required] |

### Return type

[**models::User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## retrieve_user

> models::User retrieve_user(user_id)
Retrieves a user by their identifier.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**user_id** | **String** | The ID of the user. | [required] |

### Return type

[**models::User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

