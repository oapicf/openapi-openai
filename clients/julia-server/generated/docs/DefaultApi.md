# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](DefaultApi.md#admin_api_keys_create) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**admin_api_keys_delete**](DefaultApi.md#admin_api_keys_delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**admin_api_keys_get**](DefaultApi.md#admin_api_keys_get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**admin_api_keys_list**](DefaultApi.md#admin_api_keys_list) | **GET** /organization/admin_api_keys | List organization API keys


# **admin_api_keys_create**
> `admin_api_keys_create`(req::`HTTP.Request`, `admin_api_keys_create_request`::`AdminApiKeysCreateRequest`;) -> `AdminApiKey`

Create an organization admin API key

Create a new admin-level API key for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`admin_api_keys_create_request`** | [**`AdminApiKeysCreateRequest`**](AdminApiKeysCreateRequest.md)|  |

### Return type

[**`AdminApiKey`**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_delete**
> `admin_api_keys_delete`(req::`HTTP.Request`, `key_id`::`String`;) -> `AdminApiKeysDelete200Response`

Delete an organization admin API key

Delete the specified admin API key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`key_id`** | **`String`**|  |

### Return type

[**`AdminApiKeysDelete200Response`**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_get**
> `admin_api_keys_get`(req::`HTTP.Request`, `key_id`::`String`;) -> `AdminApiKey`

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`key_id`** | **`String`**|  |

### Return type

[**`AdminApiKey`**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_list**
> `admin_api_keys_list`(req::`HTTP.Request`; `after`=nothing, `order`=nothing, `limit`=nothing,) -> `ApiKeyList`

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`after`** | **`String`**|  | [default to nothing]
 **`order`** | **`String`**|  | [default to &quot;asc&quot;]
 **`limit`** | **`Int64`**|  | [default to 20]

### Return type

[**`ApiKeyList`**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

