# \DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](DefaultApi.md#admin_api_keys_create) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**admin_api_keys_delete**](DefaultApi.md#admin_api_keys_delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**admin_api_keys_get**](DefaultApi.md#admin_api_keys_get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**admin_api_keys_list**](DefaultApi.md#admin_api_keys_list) | **GET** /organization/admin_api_keys | List organization API keys



## admin_api_keys_create

> models::AdminApiKey admin_api_keys_create(admin_api_keys_create_request)
Create an organization admin API key

Create a new admin-level API key for the organization.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**admin_api_keys_create_request** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md) |  | [required] |

### Return type

[**models::AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## admin_api_keys_delete

> models::AdminApiKeysDelete200Response admin_api_keys_delete(key_id)
Delete an organization admin API key

Delete the specified admin API key.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**key_id** | **String** |  | [required] |

### Return type

[**models::AdminApiKeysDelete200Response**](admin_api_keys_delete_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## admin_api_keys_get

> models::AdminApiKey admin_api_keys_get(key_id)
Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**key_id** | **String** |  | [required] |

### Return type

[**models::AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## admin_api_keys_list

> models::ApiKeyList admin_api_keys_list(after, order, limit)
List organization API keys

Retrieve a paginated list of organization admin API keys.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**after** | Option<**String**> |  |  |
**order** | Option<**String**> |  |  |[default to asc]
**limit** | Option<**i32**> |  |  |[default to 20]

### Return type

[**models::ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

