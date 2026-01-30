# UsageApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](UsageApi.md#usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](UsageApi.md#usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](UsageApi.md#usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](UsageApi.md#usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](UsageApi.md#usageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](UsageApi.md#usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](UsageApi.md#usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](UsageApi.md#usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](UsageApi.md#usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.



## usageAudioSpeeches

Get audio speeches usage details for the organization.

### Example

```bash
 usageAudioSpeeches  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  user_ids=value1 user_ids=value2 user_ids=...  Specify as:  api_key_ids=value1 api_key_ids=value2 api_key_ids=...  Specify as:  models=value1 models=value2 models=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **userIds** | [**array[string]**](string.md) | Return only usage for these users. | [optional] [default to null]
 **apiKeyIds** | [**array[string]**](string.md) | Return only usage for these API keys. | [optional] [default to null]
 **models** | [**array[string]**](string.md) | Return only usage for these models. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageAudioTranscriptions

Get audio transcriptions usage details for the organization.

### Example

```bash
 usageAudioTranscriptions  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  user_ids=value1 user_ids=value2 user_ids=...  Specify as:  api_key_ids=value1 api_key_ids=value2 api_key_ids=...  Specify as:  models=value1 models=value2 models=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **userIds** | [**array[string]**](string.md) | Return only usage for these users. | [optional] [default to null]
 **apiKeyIds** | [**array[string]**](string.md) | Return only usage for these API keys. | [optional] [default to null]
 **models** | [**array[string]**](string.md) | Return only usage for these models. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageCodeInterpreterSessions

Get code interpreter sessions usage details for the organization.

### Example

```bash
 usageCodeInterpreterSessions  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id'. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageCompletions

Get completions usage details for the organization.

### Example

```bash
 usageCompletions  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  user_ids=value1 user_ids=value2 user_ids=...  Specify as:  api_key_ids=value1 api_key_ids=value2 api_key_ids=...  Specify as:  models=value1 models=value2 models=...  batch=value  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **userIds** | [**array[string]**](string.md) | Return only usage for these users. | [optional] [default to null]
 **apiKeyIds** | [**array[string]**](string.md) | Return only usage for these API keys. | [optional] [default to null]
 **models** | [**array[string]**](string.md) | Return only usage for these models. | [optional] [default to null]
 **batch** | **boolean** | If 'true', return batch jobs only. If 'false', return non-batch jobs only. By default, return both. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model', 'batch' or any combination of them. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageCosts

Get costs details for the organization.

### Example

```bash
 usageCosts  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently only '1d' is supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only costs for these projects. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the costs by the specified fields. Support fields include 'project_id', 'line_item' and any combination of them. | [optional] [default to null]
 **limit** | **integer** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. | [optional] [default to 7]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageEmbeddings

Get embeddings usage details for the organization.

### Example

```bash
 usageEmbeddings  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  user_ids=value1 user_ids=value2 user_ids=...  Specify as:  api_key_ids=value1 api_key_ids=value2 api_key_ids=...  Specify as:  models=value1 models=value2 models=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **userIds** | [**array[string]**](string.md) | Return only usage for these users. | [optional] [default to null]
 **apiKeyIds** | [**array[string]**](string.md) | Return only usage for these API keys. | [optional] [default to null]
 **models** | [**array[string]**](string.md) | Return only usage for these models. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageImages

Get images usage details for the organization.

### Example

```bash
 usageImages  start_time=value  end_time=value  bucket_width=value  Specify as:  sources=value1 sources=value2 sources=...  Specify as:  sizes=value1 sizes=value2 sizes=...  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  user_ids=value1 user_ids=value2 user_ids=...  Specify as:  api_key_ids=value1 api_key_ids=value2 api_key_ids=...  Specify as:  models=value1 models=value2 models=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **sources** | [**array[string]**](string.md) | Return only usages for these sources. Possible values are 'image.generation', 'image.edit', 'image.variation' or any combination of them. | [optional] [default to null]
 **sizes** | [**array[string]**](string.md) | Return only usages for these image sizes. Possible values are '256x256', '512x512', '1024x1024', '1792x1792', '1024x1792' or any combination of them. | [optional] [default to null]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **userIds** | [**array[string]**](string.md) | Return only usage for these users. | [optional] [default to null]
 **apiKeyIds** | [**array[string]**](string.md) | Return only usage for these API keys. | [optional] [default to null]
 **models** | [**array[string]**](string.md) | Return only usage for these models. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model', 'size', 'source' or any combination of them. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageModerations

Get moderations usage details for the organization.

### Example

```bash
 usageModerations  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  user_ids=value1 user_ids=value2 user_ids=...  Specify as:  api_key_ids=value1 api_key_ids=value2 api_key_ids=...  Specify as:  models=value1 models=value2 models=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **userIds** | [**array[string]**](string.md) | Return only usage for these users. | [optional] [default to null]
 **apiKeyIds** | [**array[string]**](string.md) | Return only usage for these API keys. | [optional] [default to null]
 **models** | [**array[string]**](string.md) | Return only usage for these models. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id', 'user_id', 'api_key_id', 'model' or any combination of them. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## usageVectorStores

Get vector stores usage details for the organization.

### Example

```bash
 usageVectorStores  start_time=value  end_time=value  bucket_width=value  Specify as:  project_ids=value1 project_ids=value2 project_ids=...  Specify as:  group_by=value1 group_by=value2 group_by=...  limit=value  page=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **integer** | Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **endTime** | **integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucketWidth** | **string** | Width of each time bucket in response. Currently '1m', '1h' and '1d' are supported, default to '1d'. | [optional] [default to 1d]
 **projectIds** | [**array[string]**](string.md) | Return only usage for these projects. | [optional] [default to null]
 **groupBy** | [**array[string]**](string.md) | Group the usage data by the specified fields. Support fields include 'project_id'. | [optional] [default to null]
 **limit** | **integer** | Specifies the number of buckets to return.
- 'bucket_width=1d': default: 7, max: 31
- 'bucket_width=1h': default: 24, max: 168
- 'bucket_width=1m': default: 60, max: 1440 | [optional] [default to null]
 **page** | **string** | A cursor for use in pagination. Corresponding to the 'next_page' field from the previous response. | [optional] [default to null]

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

