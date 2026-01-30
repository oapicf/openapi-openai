# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adminApiKeysCreate**](DefaultApi.md#adminapikeyscreateoperation) | **POST** /organization/admin_api_keys | Create an organization admin API key |
| [**adminApiKeysDelete**](DefaultApi.md#adminapikeysdelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key |
| [**adminApiKeysGet**](DefaultApi.md#adminapikeysget) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key |
| [**adminApiKeysList**](DefaultApi.md#adminapikeyslist) | **GET** /organization/admin_api_keys | List organization API keys |



## adminApiKeysCreate

> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { AdminApiKeysCreateOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DefaultApi(config);

  const body = {
    // AdminApiKeysCreateRequest
    adminApiKeysCreateRequest: ...,
  } satisfies AdminApiKeysCreateOperationRequest;

  try {
    const data = await api.adminApiKeysCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adminApiKeysCreateRequest** | [AdminApiKeysCreateRequest](AdminApiKeysCreateRequest.md) |  | |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly created admin API key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adminApiKeysDelete

> AdminApiKeysDelete200Response adminApiKeysDelete(keyId)

Delete an organization admin API key

Delete the specified admin API key.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { AdminApiKeysDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DefaultApi(config);

  const body = {
    // string
    keyId: keyId_example,
  } satisfies AdminApiKeysDeleteRequest;

  try {
    const data = await api.adminApiKeysDelete(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the API key was deleted. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adminApiKeysGet

> AdminApiKey adminApiKeysGet(keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { AdminApiKeysGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DefaultApi(config);

  const body = {
    // string
    keyId: keyId_example,
  } satisfies AdminApiKeysGetRequest;

  try {
    const data = await api.adminApiKeysGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **keyId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the requested API key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## adminApiKeysList

> ApiKeyList adminApiKeysList(after, order, limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { AdminApiKeysListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new DefaultApi(config);

  const body = {
    // string (optional)
    after: after_example,
    // 'asc' | 'desc' (optional)
    order: order_example,
    // number (optional)
    limit: 56,
  } satisfies AdminApiKeysListRequest;

  try {
    const data = await api.adminApiKeysList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **after** | `string` |  | [Optional] [Defaults to `undefined`] |
| **order** | `asc`, `desc` |  | [Optional] [Defaults to `&#39;asc&#39;`] [Enum: asc, desc] |
| **limit** | `number` |  | [Optional] [Defaults to `20`] |

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of organization API keys. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

