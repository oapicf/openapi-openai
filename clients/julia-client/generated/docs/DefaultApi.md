# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](DefaultApi.md#admin_api_keys_create) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**admin_api_keys_delete**](DefaultApi.md#admin_api_keys_delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**admin_api_keys_get**](DefaultApi.md#admin_api_keys_get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**admin_api_keys_list**](DefaultApi.md#admin_api_keys_list) | **GET** /organization/admin_api_keys | List organization API keys


# **admin_api_keys_create**
> `admin_api_keys_create`(_api::`DefaultApi`, `admin_api_keys_create_request`::`AdminApiKeysCreateRequest`; _mediaType=nothing) -> `AdminApiKey`, `OpenAPI.Clients.ApiResponse` <br/>
> `admin_api_keys_create`(_api::`DefaultApi`, response_stream::`Channel`, `admin_api_keys_create_request`::`AdminApiKeysCreateRequest`; _mediaType=nothing) -> `Channel`{ `AdminApiKey` }, `OpenAPI.Clients.ApiResponse`

Create an organization admin API key

Create a new admin-level API key for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`DefaultApi`** | API context | 
**`admin_api_keys_create_request`** | [**`AdminApiKeysCreateRequest`**](AdminApiKeysCreateRequest.md) |  |

### Return type

[**`AdminApiKey`**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **admin_api_keys_delete**
> `admin_api_keys_delete`(_api::`DefaultApi`, `key_id`::`String`; _mediaType=nothing) -> `AdminApiKeysDelete200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `admin_api_keys_delete`(_api::`DefaultApi`, response_stream::`Channel`, `key_id`::`String`; _mediaType=nothing) -> `Channel`{ `AdminApiKeysDelete200Response` }, `OpenAPI.Clients.ApiResponse`

Delete an organization admin API key

Delete the specified admin API key.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`DefaultApi`** | API context | 
**`key_id`** | **`String`** |  |

### Return type

[**`AdminApiKeysDelete200Response`**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **admin_api_keys_get**
> `admin_api_keys_get`(_api::`DefaultApi`, `key_id`::`String`; _mediaType=nothing) -> `AdminApiKey`, `OpenAPI.Clients.ApiResponse` <br/>
> `admin_api_keys_get`(_api::`DefaultApi`, response_stream::`Channel`, `key_id`::`String`; _mediaType=nothing) -> `Channel`{ `AdminApiKey` }, `OpenAPI.Clients.ApiResponse`

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`DefaultApi`** | API context | 
**`key_id`** | **`String`** |  |

### Return type

[**`AdminApiKey`**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **admin_api_keys_list**
> `admin_api_keys_list`(_api::`DefaultApi`; `after`=nothing, `order`=nothing, `limit`=nothing, _mediaType=nothing) -> `ApiKeyList`, `OpenAPI.Clients.ApiResponse` <br/>
> `admin_api_keys_list`(_api::`DefaultApi`, response_stream::`Channel`; `after`=nothing, `order`=nothing, `limit`=nothing, _mediaType=nothing) -> `Channel`{ `ApiKeyList` }, `OpenAPI.Clients.ApiResponse`

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`DefaultApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`after`** | **`String`** |  | [default to nothing]
 **`order`** | **`String`** |  | [default to &quot;asc&quot;]
 **`limit`** | **`Int64`** |  | [default to 20]

### Return type

[**`ApiKeyList`**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

