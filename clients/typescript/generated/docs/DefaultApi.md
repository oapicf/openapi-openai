# .DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys


# **adminApiKeysCreate**
> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create a new admin-level API key for the organization.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiAdminApiKeysCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiAdminApiKeysCreateRequest = {
  
  adminApiKeysCreateRequest: {
    name: "New Admin Key",
  },
};

const data = await apiInstance.adminApiKeysCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminApiKeysCreateRequest** | **AdminApiKeysCreateRequest**|  |


### Return type

**AdminApiKey**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly created admin API key. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adminApiKeysDelete**
> AdminApiKeysDelete200Response adminApiKeysDelete()

Delete the specified admin API key.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiAdminApiKeysDeleteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiAdminApiKeysDeleteRequest = {
  
  keyId: "key_id_example",
};

const data = await apiInstance.adminApiKeysDelete(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | [**string**] |  | defaults to undefined


### Return type

**AdminApiKeysDelete200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Confirmation that the API key was deleted. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adminApiKeysGet**
> AdminApiKey adminApiKeysGet()

Get details for a specific organization API key by its ID.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiAdminApiKeysGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiAdminApiKeysGetRequest = {
  
  keyId: "key_id_example",
};

const data = await apiInstance.adminApiKeysGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | [**string**] |  | defaults to undefined


### Return type

**AdminApiKey**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of the requested API key. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **adminApiKeysList**
> ApiKeyList adminApiKeysList()

Retrieve a paginated list of organization admin API keys.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiAdminApiKeysListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiAdminApiKeysListRequest = {
  
  after: "after_example",
  
  order: "asc",
  
  limit: 20,
};

const data = await apiInstance.adminApiKeysList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | [**string**] |  | (optional) defaults to undefined
 **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** |  | (optional) defaults to 'asc'
 **limit** | [**number**] |  | (optional) defaults to 20


### Return type

**ApiKeyList**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of organization API keys. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


