# UsageApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usageAudioSpeeches**](UsageApi.md#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**usageAudioTranscriptions**](UsageApi.md#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**usageCodeInterpreterSessions**](UsageApi.md#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**usageCompletions**](UsageApi.md#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**usageCosts**](UsageApi.md#usagecosts) | **GET** /organization/costs | Get costs details for the organization. |
| [**usageEmbeddings**](UsageApi.md#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**usageImages**](UsageApi.md#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**usageModerations**](UsageApi.md#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**usageVectorStores**](UsageApi.md#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |



## usageAudioSpeeches

> UsageResponse usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio speeches usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageAudioSpeechesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<string> | Return only usage for these users. (optional)
    userIds: ...,
    // Array<string> | Return only usage for these API keys. (optional)
    apiKeyIds: ...,
    // Array<string> | Return only usage for these models. (optional)
    models: ...,
    // Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageAudioSpeechesRequest;

  try {
    const data = await api.usageAudioSpeeches(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **userIds** | `Array<string>` | Return only usage for these users. | [Optional] |
| **apiKeyIds** | `Array<string>` | Return only usage for these API keys. | [Optional] |
| **models** | `Array<string>` | Return only usage for these models. | [Optional] |
| **groupBy** | `project_id`, `user_id`, `api_key_id`, `model` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [Optional] [Enum: project_id, user_id, api_key_id, model] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageAudioTranscriptions

> UsageResponse usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get audio transcriptions usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageAudioTranscriptionsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<string> | Return only usage for these users. (optional)
    userIds: ...,
    // Array<string> | Return only usage for these API keys. (optional)
    apiKeyIds: ...,
    // Array<string> | Return only usage for these models. (optional)
    models: ...,
    // Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageAudioTranscriptionsRequest;

  try {
    const data = await api.usageAudioTranscriptions(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **userIds** | `Array<string>` | Return only usage for these users. | [Optional] |
| **apiKeyIds** | `Array<string>` | Return only usage for these API keys. | [Optional] |
| **models** | `Array<string>` | Return only usage for these models. | [Optional] |
| **groupBy** | `project_id`, `user_id`, `api_key_id`, `model` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [Optional] [Enum: project_id, user_id, api_key_id, model] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageCodeInterpreterSessions

> UsageResponse usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get code interpreter sessions usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageCodeInterpreterSessionsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<'project_id'> | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageCodeInterpreterSessionsRequest;

  try {
    const data = await api.usageCodeInterpreterSessions(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **groupBy** | `project_id` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [Optional] [Enum: project_id] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageCompletions

> UsageResponse usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)

Get completions usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageCompletionsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<string> | Return only usage for these users. (optional)
    userIds: ...,
    // Array<string> | Return only usage for these API keys. (optional)
    apiKeyIds: ...,
    // Array<string> | Return only usage for these models. (optional)
    models: ...,
    // boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
    batch: true,
    // Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageCompletionsRequest;

  try {
    const data = await api.usageCompletions(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **userIds** | `Array<string>` | Return only usage for these users. | [Optional] |
| **apiKeyIds** | `Array<string>` | Return only usage for these API keys. | [Optional] |
| **models** | `Array<string>` | Return only usage for these models. | [Optional] |
| **batch** | `boolean` | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [Optional] [Defaults to `undefined`] |
| **groupBy** | `project_id`, `user_id`, `api_key_id`, `model`, `batch` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [Optional] [Enum: project_id, user_id, api_key_id, model, batch] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageCosts

> UsageResponse usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get costs details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageCostsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1d' | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only costs for these projects. (optional)
    projectIds: ...,
    // Array<'project_id' | 'line_item'> | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
    groupBy: ...,
    // number | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageCostsRequest;

  try {
    const data = await api.usageCosts(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1d` | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1d] |
| **projectIds** | `Array<string>` | Return only costs for these projects. | [Optional] |
| **groupBy** | `project_id`, `line_item` | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [Optional] [Enum: project_id, line_item] |
| **limit** | `number` | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [Optional] [Defaults to `7`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Costs data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageEmbeddings

> UsageResponse usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get embeddings usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageEmbeddingsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<string> | Return only usage for these users. (optional)
    userIds: ...,
    // Array<string> | Return only usage for these API keys. (optional)
    apiKeyIds: ...,
    // Array<string> | Return only usage for these models. (optional)
    models: ...,
    // Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageEmbeddingsRequest;

  try {
    const data = await api.usageEmbeddings(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **userIds** | `Array<string>` | Return only usage for these users. | [Optional] |
| **apiKeyIds** | `Array<string>` | Return only usage for these API keys. | [Optional] |
| **models** | `Array<string>` | Return only usage for these models. | [Optional] |
| **groupBy** | `project_id`, `user_id`, `api_key_id`, `model` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [Optional] [Enum: project_id, user_id, api_key_id, model] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageImages

> UsageResponse usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get images usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageImagesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<'image.generation' | 'image.edit' | 'image.variation'> | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
    sources: ...,
    // Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'> | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
    sizes: ...,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<string> | Return only usage for these users. (optional)
    userIds: ...,
    // Array<string> | Return only usage for these API keys. (optional)
    apiKeyIds: ...,
    // Array<string> | Return only usage for these models. (optional)
    models: ...,
    // Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageImagesRequest;

  try {
    const data = await api.usageImages(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **sources** | `image.generation`, `image.edit`, `image.variation` | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [Optional] [Enum: image.generation, image.edit, image.variation] |
| **sizes** | `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [Optional] [Enum: 256x256, 512x512, 1024x1024, 1792x1792, 1024x1792] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **userIds** | `Array<string>` | Return only usage for these users. | [Optional] |
| **apiKeyIds** | `Array<string>` | Return only usage for these API keys. | [Optional] |
| **models** | `Array<string>` | Return only usage for these models. | [Optional] |
| **groupBy** | `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [Optional] [Enum: project_id, user_id, api_key_id, model, size, source] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageModerations

> UsageResponse usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)

Get moderations usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageModerationsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<string> | Return only usage for these users. (optional)
    userIds: ...,
    // Array<string> | Return only usage for these API keys. (optional)
    apiKeyIds: ...,
    // Array<string> | Return only usage for these models. (optional)
    models: ...,
    // Array<'project_id' | 'user_id' | 'api_key_id' | 'model'> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageModerationsRequest;

  try {
    const data = await api.usageModerations(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **userIds** | `Array<string>` | Return only usage for these users. | [Optional] |
| **apiKeyIds** | `Array<string>` | Return only usage for these API keys. | [Optional] |
| **models** | `Array<string>` | Return only usage for these models. | [Optional] |
| **groupBy** | `project_id`, `user_id`, `api_key_id`, `model` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [Optional] [Enum: project_id, user_id, api_key_id, model] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## usageVectorStores

> UsageResponse usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)

Get vector stores usage details for the organization.

### Example

```ts
import {
  Configuration,
  UsageApi,
} from '';
import type { UsageVectorStoresRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UsageApi(config);

  const body = {
    // number | Start time (Unix seconds) of the query time range, inclusive.
    startTime: 56,
    // number | End time (Unix seconds) of the query time range, exclusive. (optional)
    endTime: 56,
    // '1m' | '1h' | '1d' | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional)
    bucketWidth: bucketWidth_example,
    // Array<string> | Return only usage for these projects. (optional)
    projectIds: ...,
    // Array<'project_id'> | Group the usage data by the specified fields. Support fields include `project_id`. (optional)
    groupBy: ...,
    // number | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
    limit: 56,
    // string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
    page: page_example,
  } satisfies UsageVectorStoresRequest;

  try {
    const data = await api.usageVectorStores(body);
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
| **startTime** | `number` | Start time (Unix seconds) of the query time range, inclusive. | [Defaults to `undefined`] |
| **endTime** | `number` | End time (Unix seconds) of the query time range, exclusive. | [Optional] [Defaults to `undefined`] |
| **bucketWidth** | `1m`, `1h`, `1d` | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [Optional] [Defaults to `&#39;1d&#39;`] [Enum: 1m, 1h, 1d] |
| **projectIds** | `Array<string>` | Return only usage for these projects. | [Optional] |
| **groupBy** | `project_id` | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [Optional] [Enum: project_id] |
| **limit** | `number` | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [Optional] [Defaults to `undefined`] |
| **page** | `string` | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [Optional] [Defaults to `undefined`] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

