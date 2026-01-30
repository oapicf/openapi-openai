# Org.OpenAPITools.Api.UsageApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**UsageAudioSpeeches**](UsageApi.md#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**UsageAudioTranscriptions**](UsageApi.md#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**UsageCodeInterpreterSessions**](UsageApi.md#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**UsageCompletions**](UsageApi.md#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**UsageCosts**](UsageApi.md#usagecosts) | **GET** /organization/costs | Get costs details for the organization. |
| [**UsageEmbeddings**](UsageApi.md#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**UsageImages**](UsageApi.md#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**UsageModerations**](UsageApi.md#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**UsageVectorStores**](UsageApi.md#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |

<a id="usageaudiospeeches"></a>
# **UsageAudioSpeeches**
> UsageResponse UsageAudioSpeeches (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> userIds = null, List<string> apiKeyIds = null, List<string> models = null, List<string> groupBy = null, int limit = null, string page = null)

Get audio speeches usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **userIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these users. | [optional]  |
| **apiKeyIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these API keys. | [optional]  |
| **models** | [**List&lt;string&gt;**](string.md) | Return only usage for these models. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usageaudiotranscriptions"></a>
# **UsageAudioTranscriptions**
> UsageResponse UsageAudioTranscriptions (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> userIds = null, List<string> apiKeyIds = null, List<string> models = null, List<string> groupBy = null, int limit = null, string page = null)

Get audio transcriptions usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **userIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these users. | [optional]  |
| **apiKeyIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these API keys. | [optional]  |
| **models** | [**List&lt;string&gt;**](string.md) | Return only usage for these models. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usagecodeinterpretersessions"></a>
# **UsageCodeInterpreterSessions**
> UsageResponse UsageCodeInterpreterSessions (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> groupBy = null, int limit = null, string page = null)

Get code interpreter sessions usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usagecompletions"></a>
# **UsageCompletions**
> UsageResponse UsageCompletions (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> userIds = null, List<string> apiKeyIds = null, List<string> models = null, bool batch = null, List<string> groupBy = null, int limit = null, string page = null)

Get completions usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **userIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these users. | [optional]  |
| **apiKeyIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these API keys. | [optional]  |
| **models** | [**List&lt;string&gt;**](string.md) | Return only usage for these models. | [optional]  |
| **batch** | **bool** | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usagecosts"></a>
# **UsageCosts**
> UsageResponse UsageCosts (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> groupBy = null, int limit = null, string page = null)

Get costs details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only costs for these projects. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional]  |
| **limit** | **int** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7] |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Costs data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usageembeddings"></a>
# **UsageEmbeddings**
> UsageResponse UsageEmbeddings (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> userIds = null, List<string> apiKeyIds = null, List<string> models = null, List<string> groupBy = null, int limit = null, string page = null)

Get embeddings usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **userIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these users. | [optional]  |
| **apiKeyIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these API keys. | [optional]  |
| **models** | [**List&lt;string&gt;**](string.md) | Return only usage for these models. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usageimages"></a>
# **UsageImages**
> UsageResponse UsageImages (int startTime, int endTime = null, string bucketWidth = null, List<string> sources = null, List<string> sizes = null, List<string> projectIds = null, List<string> userIds = null, List<string> apiKeyIds = null, List<string> models = null, List<string> groupBy = null, int limit = null, string page = null)

Get images usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **sources** | [**List&lt;string&gt;**](string.md) | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional]  |
| **sizes** | [**List&lt;string&gt;**](string.md) | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional]  |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **userIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these users. | [optional]  |
| **apiKeyIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these API keys. | [optional]  |
| **models** | [**List&lt;string&gt;**](string.md) | Return only usage for these models. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usagemoderations"></a>
# **UsageModerations**
> UsageResponse UsageModerations (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> userIds = null, List<string> apiKeyIds = null, List<string> models = null, List<string> groupBy = null, int limit = null, string page = null)

Get moderations usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **userIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these users. | [optional]  |
| **apiKeyIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these API keys. | [optional]  |
| **models** | [**List&lt;string&gt;**](string.md) | Return only usage for these models. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="usagevectorstores"></a>
# **UsageVectorStores**
> UsageResponse UsageVectorStores (int startTime, int endTime = null, string bucketWidth = null, List<string> projectIds = null, List<string> groupBy = null, int limit = null, string page = null)

Get vector stores usage details for the organization.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **startTime** | **int** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **endTime** | **int** | End time (Unix seconds) of the query time range, exclusive. | [optional]  |
| **bucketWidth** | **string** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d] |
| **projectIds** | [**List&lt;string&gt;**](string.md) | Return only usage for these projects. | [optional]  |
| **groupBy** | [**List&lt;string&gt;**](string.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional]  |
| **limit** | **int** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional]  |
| **page** | **string** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional]  |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Usage data retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

