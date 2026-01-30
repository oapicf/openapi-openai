# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adminApiKeysCreate**](#adminapikeyscreate) | **POST** /organization/admin_api_keys | Create an organization admin API key|
|[**adminApiKeysDelete**](#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key|
|[**adminApiKeysGet**](#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key|
|[**adminApiKeysList**](#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys|

# **adminApiKeysCreate**
> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create a new admin-level API key for the organization.

### Example

```typescript
import {
    DefaultApi,
    Configuration,
    AdminApiKeysCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let adminApiKeysCreateRequest: AdminApiKeysCreateRequest; //

const { status, data } = await apiInstance.adminApiKeysCreate(
    adminApiKeysCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adminApiKeysCreateRequest** | **AdminApiKeysCreateRequest**|  | |


### Return type

**AdminApiKey**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The newly created admin API key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysDelete**
> AdminApiKeysDelete200Response adminApiKeysDelete()

Delete the specified admin API key.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let keyId: string; // (default to undefined)

const { status, data } = await apiInstance.adminApiKeysDelete(
    keyId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **keyId** | [**string**] |  | defaults to undefined|


### Return type

**AdminApiKeysDelete200Response**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Confirmation that the API key was deleted. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysGet**
> AdminApiKey adminApiKeysGet()

Get details for a specific organization API key by its ID.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let keyId: string; // (default to undefined)

const { status, data } = await apiInstance.adminApiKeysGet(
    keyId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **keyId** | [**string**] |  | defaults to undefined|


### Return type

**AdminApiKey**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Details of the requested API key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adminApiKeysList**
> ApiKeyList adminApiKeysList()

Retrieve a paginated list of organization admin API keys.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let after: string; // (optional) (default to undefined)
let order: 'asc' | 'desc'; // (optional) (default to 'asc')
let limit: number; // (optional) (default to 20)

const { status, data } = await apiInstance.adminApiKeysList(
    after,
    order,
    limit
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **after** | [**string**] |  | (optional) defaults to undefined|
| **order** | [**&#39;asc&#39; | &#39;desc&#39;**]**Array<&#39;asc&#39; &#124; &#39;desc&#39;>** |  | (optional) defaults to 'asc'|
| **limit** | [**number**] |  | (optional) defaults to 20|


### Return type

**ApiKeyList**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | A list of organization API keys. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

