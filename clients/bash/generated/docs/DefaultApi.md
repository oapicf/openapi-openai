# DefaultApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys



## adminApiKeysCreate

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example

```bash
 adminApiKeysCreate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md) |  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adminApiKeysDelete

Delete an organization admin API key

Delete the specified admin API key.

### Example

```bash
 adminApiKeysDelete key_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **string** |  | [default to null]

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adminApiKeysGet

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example

```bash
 adminApiKeysGet key_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **string** |  | [default to null]

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adminApiKeysList

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example

```bash
 adminApiKeysList  after=value  order=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string** |  | [optional] [default to null]
 **order** | **string** |  | [optional] [default to asc]
 **limit** | **integer** |  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

