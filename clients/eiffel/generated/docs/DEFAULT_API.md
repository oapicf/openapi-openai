# DEFAULT_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](DEFAULT_API.md#admin_api_keys_create) | **Post** /organization/admin_api_keys | Create an organization admin API key
[**admin_api_keys_delete**](DEFAULT_API.md#admin_api_keys_delete) | **Delete** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**admin_api_keys_get**](DEFAULT_API.md#admin_api_keys_get) | **Get** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**admin_api_keys_list**](DEFAULT_API.md#admin_api_keys_list) | **Get** /organization/admin_api_keys | List organization API keys


# **admin_api_keys_create**
> admin_api_keys_create (admin_api_keys_create_request: ADMIN_API_KEYS_CREATE_REQUEST ): detachable ADMIN_API_KEY


Create an organization admin API key

Create a new admin-level API key for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_api_keys_create_request** | [**ADMIN_API_KEYS_CREATE_REQUEST**](ADMIN_API_KEYS_CREATE_REQUEST.md)|  | 

### Return type

[**ADMIN_API_KEY**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_delete**
> admin_api_keys_delete (key_id: STRING_32 ): detachable ADMIN_API_KEYS_DELETE_200_RESPONSE


Delete an organization admin API key

Delete the specified admin API key.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **STRING_32**|  | [default to null]

### Return type

[**ADMIN_API_KEYS_DELETE_200_RESPONSE**](admin_api_keys_delete_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_get**
> admin_api_keys_get (key_id: STRING_32 ): detachable ADMIN_API_KEY


Retrieve a single organization API key

Get details for a specific organization API key by its ID.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **STRING_32**|  | [default to null]

### Return type

[**ADMIN_API_KEY**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_list**
> admin_api_keys_list (after:  detachable STRING_32 ; order:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable API_KEY_LIST


List organization API keys

Retrieve a paginated list of organization admin API keys.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **STRING_32**|  | [optional] [default to null]
 **order** | **STRING_32**|  | [optional] [default to asc]
 **limit** | **INTEGER_32**|  | [optional] [default to 20]

### Return type

[**API_KEY_LIST**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

