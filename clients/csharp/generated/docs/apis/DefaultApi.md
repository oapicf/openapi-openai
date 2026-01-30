# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AdminApiKeysCreate**](DefaultApi.md#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**AdminApiKeysDelete**](DefaultApi.md#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**AdminApiKeysGet**](DefaultApi.md#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**AdminApiKeysList**](DefaultApi.md#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys |

<a id="adminapikeyscreate"></a>
# **AdminApiKeysCreate**
> AdminApiKey AdminApiKeysCreate (AdminApiKeysCreateRequest adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md) |  |  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly created admin API key. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="adminapikeysdelete"></a>
# **AdminApiKeysDelete**
> AdminApiKeysDelete200Response AdminApiKeysDelete (string keyId)

Delete an organization admin API key

Delete the specified admin API key.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **keyId** | **string** |  |  |

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the API key was deleted. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="adminapikeysget"></a>
# **AdminApiKeysGet**
> AdminApiKey AdminApiKeysGet (string keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **keyId** | **string** |  |  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the requested API key. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="adminapikeyslist"></a>
# **AdminApiKeysList**
> ApiKeyList AdminApiKeysList (string after = null, string order = null, int limit = null)

List organization API keys

Retrieve a paginated list of organization admin API keys.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **after** | **string** |  | [optional]  |
| **order** | **string** |  | [optional] [default to asc] |
| **limit** | **int** |  | [optional] [default to 20] |

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of organization API keys. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

