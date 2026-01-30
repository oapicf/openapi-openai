# DefaultAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_adminApiKeysCreate**](DefaultAPI.md#DefaultAPI_adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**DefaultAPI_adminApiKeysDelete**](DefaultAPI.md#DefaultAPI_adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**DefaultAPI_adminApiKeysGet**](DefaultAPI.md#DefaultAPI_adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**DefaultAPI_adminApiKeysList**](DefaultAPI.md#DefaultAPI_adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys


# **DefaultAPI_adminApiKeysCreate**
```c
// Create an organization admin API key
//
// Create a new admin-level API key for the organization.
//
admin_api_key_t* DefaultAPI_adminApiKeysCreate(apiClient_t *apiClient, admin_api_keys_create_request_t *admin_api_keys_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**admin_api_keys_create_request** | **[admin_api_keys_create_request_t](admin_api_keys_create_request.md) \*** |  | 

### Return type

[admin_api_key_t](admin_api_key.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_adminApiKeysDelete**
```c
// Delete an organization admin API key
//
// Delete the specified admin API key.
//
admin_api_keys_delete_200_response_t* DefaultAPI_adminApiKeysDelete(apiClient_t *apiClient, char *key_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**key_id** | **char \*** |  | 

### Return type

[admin_api_keys_delete_200_response_t](admin_api_keys_delete_200_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_adminApiKeysGet**
```c
// Retrieve a single organization API key
//
// Get details for a specific organization API key by its ID.
//
admin_api_key_t* DefaultAPI_adminApiKeysGet(apiClient_t *apiClient, char *key_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**key_id** | **char \*** |  | 

### Return type

[admin_api_key_t](admin_api_key.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_adminApiKeysList**
```c
// List organization API keys
//
// Retrieve a paginated list of organization admin API keys.
//
api_key_list_t* DefaultAPI_adminApiKeysList(apiClient_t *apiClient, char *after, openai_api_adminApiKeysList_order_e order, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**after** | **char \*** |  | [optional] 
**order** | **openai_api_adminApiKeysList_order_e** |  | [optional] [default to &#39;asc&#39;]
**limit** | **int \*** |  | [optional] [default to 20]

### Return type

[api_key_list_t](api_key_list.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

