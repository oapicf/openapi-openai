# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys |


<a name="adminApiKeysCreate"></a>
# **adminApiKeysCreate**
> AdminApiKey adminApiKeysCreate(admin\_api\_keys\_create\_request)

Create an organization admin API key

    Create a new admin-level API key for the organization.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **admin\_api\_keys\_create\_request** | [**admin_api_keys_create_request**](../Models/admin_api_keys_create_request.md)|  | |

### Return type

[**AdminApiKey**](../Models/AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adminApiKeysDelete"></a>
# **adminApiKeysDelete**
> admin_api_keys_delete_200_response adminApiKeysDelete(key\_id)

Delete an organization admin API key

    Delete the specified admin API key.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key\_id** | **String**|  | [default to null] |

### Return type

[**admin_api_keys_delete_200_response**](../Models/admin_api_keys_delete_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adminApiKeysGet"></a>
# **adminApiKeysGet**
> AdminApiKey adminApiKeysGet(key\_id)

Retrieve a single organization API key

    Get details for a specific organization API key by its ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **key\_id** | **String**|  | [default to null] |

### Return type

[**AdminApiKey**](../Models/AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adminApiKeysList"></a>
# **adminApiKeysList**
> ApiKeyList adminApiKeysList(after, order, limit)

List organization API keys

    Retrieve a paginated list of organization admin API keys.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | **String**|  | [optional] [default to null] |
| **order** | **String**|  | [optional] [default to asc] [enum: asc, desc] |
| **limit** | **Integer**|  | [optional] [default to 20] |

### Return type

[**ApiKeyList**](../Models/ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

