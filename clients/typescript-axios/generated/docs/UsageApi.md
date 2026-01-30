# UsageApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**usageAudioSpeeches**](#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.|
|[**usageAudioTranscriptions**](#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.|
|[**usageCodeInterpreterSessions**](#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.|
|[**usageCompletions**](#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.|
|[**usageCosts**](#usagecosts) | **GET** /organization/costs | Get costs details for the organization.|
|[**usageEmbeddings**](#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.|
|[**usageImages**](#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization.|
|[**usageModerations**](#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.|
|[**usageVectorStores**](#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.|

# **usageAudioSpeeches**
> UsageResponse usageAudioSpeeches()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let userIds: Array<string>; //Return only usage for these users. (optional) (default to undefined)
let apiKeyIds: Array<string>; //Return only usage for these API keys. (optional) (default to undefined)
let models: Array<string>; //Return only usage for these models. (optional) (default to undefined)
let groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>; //Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageAudioSpeeches(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    userIds,
    apiKeyIds,
    models,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **userIds** | **Array&lt;string&gt;** | Return only usage for these users. | (optional) defaults to undefined|
| **apiKeyIds** | **Array&lt;string&gt;** | Return only usage for these API keys. | (optional) defaults to undefined|
| **models** | **Array&lt;string&gt;** | Return only usage for these models. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;user_id&#39; &#124; &#39;api_key_id&#39; &#124; &#39;model&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageAudioTranscriptions**
> UsageResponse usageAudioTranscriptions()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let userIds: Array<string>; //Return only usage for these users. (optional) (default to undefined)
let apiKeyIds: Array<string>; //Return only usage for these API keys. (optional) (default to undefined)
let models: Array<string>; //Return only usage for these models. (optional) (default to undefined)
let groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>; //Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageAudioTranscriptions(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    userIds,
    apiKeyIds,
    models,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **userIds** | **Array&lt;string&gt;** | Return only usage for these users. | (optional) defaults to undefined|
| **apiKeyIds** | **Array&lt;string&gt;** | Return only usage for these API keys. | (optional) defaults to undefined|
| **models** | **Array&lt;string&gt;** | Return only usage for these models. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;user_id&#39; &#124; &#39;api_key_id&#39; &#124; &#39;model&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCodeInterpreterSessions**
> UsageResponse usageCodeInterpreterSessions()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let groupBy: Array<'project_id'>; //Group the usage data by the specified fields. Support fields include `project_id`. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageCodeInterpreterSessions(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCompletions**
> UsageResponse usageCompletions()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let userIds: Array<string>; //Return only usage for these users. (optional) (default to undefined)
let apiKeyIds: Array<string>; //Return only usage for these API keys. (optional) (default to undefined)
let models: Array<string>; //Return only usage for these models. (optional) (default to undefined)
let batch: boolean; //If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional) (default to undefined)
let groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'batch'>; //Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageCompletions(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    userIds,
    apiKeyIds,
    models,
    batch,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **userIds** | **Array&lt;string&gt;** | Return only usage for these users. | (optional) defaults to undefined|
| **apiKeyIds** | **Array&lt;string&gt;** | Return only usage for these API keys. | (optional) defaults to undefined|
| **models** | **Array&lt;string&gt;** | Return only usage for these models. | (optional) defaults to undefined|
| **batch** | [**boolean**] | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;user_id&#39; &#124; &#39;api_key_id&#39; &#124; &#39;model&#39; &#124; &#39;batch&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCosts**
> UsageResponse usageCosts()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1d'; //Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only costs for these projects. (optional) (default to undefined)
let groupBy: Array<'project_id' | 'line_item'>; //Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional) (default to undefined)
let limit: number; //A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional) (default to 7)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageCosts(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1d&#39;**]**Array<&#39;1d&#39;>** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only costs for these projects. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;line_item&#39;>** | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | (optional) defaults to 7|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Costs data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageEmbeddings**
> UsageResponse usageEmbeddings()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let userIds: Array<string>; //Return only usage for these users. (optional) (default to undefined)
let apiKeyIds: Array<string>; //Return only usage for these API keys. (optional) (default to undefined)
let models: Array<string>; //Return only usage for these models. (optional) (default to undefined)
let groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>; //Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageEmbeddings(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    userIds,
    apiKeyIds,
    models,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **userIds** | **Array&lt;string&gt;** | Return only usage for these users. | (optional) defaults to undefined|
| **apiKeyIds** | **Array&lt;string&gt;** | Return only usage for these API keys. | (optional) defaults to undefined|
| **models** | **Array&lt;string&gt;** | Return only usage for these models. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;user_id&#39; &#124; &#39;api_key_id&#39; &#124; &#39;model&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageImages**
> UsageResponse usageImages()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let sources: Array<'image.generation' | 'image.edit' | 'image.variation'>; //Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional) (default to undefined)
let sizes: Array<'256x256' | '512x512' | '1024x1024' | '1792x1792' | '1024x1792'>; //Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional) (default to undefined)
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let userIds: Array<string>; //Return only usage for these users. (optional) (default to undefined)
let apiKeyIds: Array<string>; //Return only usage for these API keys. (optional) (default to undefined)
let models: Array<string>; //Return only usage for these models. (optional) (default to undefined)
let groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model' | 'size' | 'source'>; //Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageImages(
    startTime,
    endTime,
    bucketWidth,
    sources,
    sizes,
    projectIds,
    userIds,
    apiKeyIds,
    models,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **sources** | **Array<&#39;image.generation&#39; &#124; &#39;image.edit&#39; &#124; &#39;image.variation&#39;>** | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | (optional) defaults to undefined|
| **sizes** | **Array<&#39;256x256&#39; &#124; &#39;512x512&#39; &#124; &#39;1024x1024&#39; &#124; &#39;1792x1792&#39; &#124; &#39;1024x1792&#39;>** | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | (optional) defaults to undefined|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **userIds** | **Array&lt;string&gt;** | Return only usage for these users. | (optional) defaults to undefined|
| **apiKeyIds** | **Array&lt;string&gt;** | Return only usage for these API keys. | (optional) defaults to undefined|
| **models** | **Array&lt;string&gt;** | Return only usage for these models. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;user_id&#39; &#124; &#39;api_key_id&#39; &#124; &#39;model&#39; &#124; &#39;size&#39; &#124; &#39;source&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageModerations**
> UsageResponse usageModerations()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let userIds: Array<string>; //Return only usage for these users. (optional) (default to undefined)
let apiKeyIds: Array<string>; //Return only usage for these API keys. (optional) (default to undefined)
let models: Array<string>; //Return only usage for these models. (optional) (default to undefined)
let groupBy: Array<'project_id' | 'user_id' | 'api_key_id' | 'model'>; //Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageModerations(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    userIds,
    apiKeyIds,
    models,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **userIds** | **Array&lt;string&gt;** | Return only usage for these users. | (optional) defaults to undefined|
| **apiKeyIds** | **Array&lt;string&gt;** | Return only usage for these API keys. | (optional) defaults to undefined|
| **models** | **Array&lt;string&gt;** | Return only usage for these models. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39; &#124; &#39;user_id&#39; &#124; &#39;api_key_id&#39; &#124; &#39;model&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageVectorStores**
> UsageResponse usageVectorStores()


### Example

```typescript
import {
    UsageApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new UsageApi(configuration);

let startTime: number; //Start time (Unix seconds) of the query time range, inclusive. (default to undefined)
let endTime: number; //End time (Unix seconds) of the query time range, exclusive. (optional) (default to undefined)
let bucketWidth: '1m' | '1h' | '1d'; //Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to '1d')
let projectIds: Array<string>; //Return only usage for these projects. (optional) (default to undefined)
let groupBy: Array<'project_id'>; //Group the usage data by the specified fields. Support fields include `project_id`. (optional) (default to undefined)
let limit: number; //Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional) (default to undefined)
let page: string; //A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional) (default to undefined)

const { status, data } = await apiInstance.usageVectorStores(
    startTime,
    endTime,
    bucketWidth,
    projectIds,
    groupBy,
    limit,
    page
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **startTime** | [**number**] | Start time (Unix seconds) of the query time range, inclusive. | defaults to undefined|
| **endTime** | [**number**] | End time (Unix seconds) of the query time range, exclusive. | (optional) defaults to undefined|
| **bucketWidth** | [**&#39;1m&#39; | &#39;1h&#39; | &#39;1d&#39;**]**Array<&#39;1m&#39; &#124; &#39;1h&#39; &#124; &#39;1d&#39;>** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | (optional) defaults to '1d'|
| **projectIds** | **Array&lt;string&gt;** | Return only usage for these projects. | (optional) defaults to undefined|
| **groupBy** | **Array<&#39;project_id&#39;>** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | (optional) defaults to undefined|
| **limit** | [**number**] | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | (optional) defaults to undefined|
| **page** | [**string**] | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | (optional) defaults to undefined|


### Return type

**UsageResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

