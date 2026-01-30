# default_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**admin-api-keys-create**](default_api.md#admin-api-keys-create) | **POST** /organization/admin_api_keys | Create an organization admin API key
**admin-api-keys-list**](default_api.md#admin-api-keys-list) | **GET** /organization/admin_api_keys | List organization API keys
**admin-api-keys-delete**](default_api.md#admin-api-keys-delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
**admin-api-keys-get**](default_api.md#admin-api-keys-get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key


# **admin-api-keys-create**
> models::AdminApiKey admin-api-keys-create(ctx, admin_api_keys_create_request)
Create an organization admin API key

Create a new admin-level API key for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **admin_api_keys_create_request** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  | 

### Return type

[**models::AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin-api-keys-list**
> models::ApiKeyList admin-api-keys-list(ctx, optional)
List organization API keys

Retrieve a paginated list of organization admin API keys.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **swagger::Nullable<String>**|  | 
 **order** | [****](.md)|  | 
 **limit** | **i32**|  | [default to 20]

### Return type

[**models::ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin-api-keys-delete**
> models::AdminApiKeysDelete200Response admin-api-keys-delete(ctx, key_id)
Delete an organization admin API key

Delete the specified admin API key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **key_id** | **String**|  | 

### Return type

[**models::AdminApiKeysDelete200Response**](admin_api_keys_delete_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin-api-keys-get**
> models::AdminApiKey admin-api-keys-get(ctx, key_id)
Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **key_id** | **String**|  | 

### Return type

[**models::AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

