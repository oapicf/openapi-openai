# UsageAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsageAPI_usageAudioSpeeches**](UsageAPI.md#UsageAPI_usageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**UsageAPI_usageAudioTranscriptions**](UsageAPI.md#UsageAPI_usageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**UsageAPI_usageCodeInterpreterSessions**](UsageAPI.md#UsageAPI_usageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**UsageAPI_usageCompletions**](UsageAPI.md#UsageAPI_usageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**UsageAPI_usageCosts**](UsageAPI.md#UsageAPI_usageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**UsageAPI_usageEmbeddings**](UsageAPI.md#UsageAPI_usageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**UsageAPI_usageImages**](UsageAPI.md#UsageAPI_usageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**UsageAPI_usageModerations**](UsageAPI.md#UsageAPI_usageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**UsageAPI_usageVectorStores**](UsageAPI.md#UsageAPI_usageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **UsageAPI_usageAudioSpeeches**
```c
// Get audio speeches usage details for the organization.
//
usage_response_t* UsageAPI_usageAudioSpeeches(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageAudioSpeeches_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageAudioSpeeches_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**user_ids** | **[list_t](char.md) \*** | Return only usage for these users. | [optional] 
**api_key_ids** | **[list_t](char.md) \*** | Return only usage for these API keys. | [optional] 
**models** | **[list_t](char.md) \*** | Return only usage for these models. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageAudioTranscriptions**
```c
// Get audio transcriptions usage details for the organization.
//
usage_response_t* UsageAPI_usageAudioTranscriptions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageAudioTranscriptions_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageAudioTranscriptions_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**user_ids** | **[list_t](char.md) \*** | Return only usage for these users. | [optional] 
**api_key_ids** | **[list_t](char.md) \*** | Return only usage for these API keys. | [optional] 
**models** | **[list_t](char.md) \*** | Return only usage for these models. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageCodeInterpreterSessions**
```c
// Get code interpreter sessions usage details for the organization.
//
usage_response_t* UsageAPI_usageCodeInterpreterSessions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCodeInterpreterSessions_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageCodeInterpreterSessions_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageCompletions**
```c
// Get completions usage details for the organization.
//
usage_response_t* UsageAPI_usageCompletions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCompletions_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, int *batch, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageCompletions_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**user_ids** | **[list_t](char.md) \*** | Return only usage for these users. | [optional] 
**api_key_ids** | **[list_t](char.md) \*** | Return only usage for these API keys. | [optional] 
**models** | **[list_t](char.md) \*** | Return only usage for these models. | [optional] 
**batch** | **int \*** | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageCosts**
```c
// Get costs details for the organization.
//
usage_response_t* UsageAPI_usageCosts(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCosts_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageCosts_bucket_width_e** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only costs for these projects. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
**limit** | **int \*** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageEmbeddings**
```c
// Get embeddings usage details for the organization.
//
usage_response_t* UsageAPI_usageEmbeddings(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageEmbeddings_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageEmbeddings_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**user_ids** | **[list_t](char.md) \*** | Return only usage for these users. | [optional] 
**api_key_ids** | **[list_t](char.md) \*** | Return only usage for these API keys. | [optional] 
**models** | **[list_t](char.md) \*** | Return only usage for these models. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageImages**
```c
// Get images usage details for the organization.
//
usage_response_t* UsageAPI_usageImages(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageImages_bucket_width_e bucket_width, list_t *sources, list_t *sizes, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageImages_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**sources** | **[list_t](char.md) \*** | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
**sizes** | **[list_t](char.md) \*** | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**user_ids** | **[list_t](char.md) \*** | Return only usage for these users. | [optional] 
**api_key_ids** | **[list_t](char.md) \*** | Return only usage for these API keys. | [optional] 
**models** | **[list_t](char.md) \*** | Return only usage for these models. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageModerations**
```c
// Get moderations usage details for the organization.
//
usage_response_t* UsageAPI_usageModerations(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageModerations_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageModerations_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**user_ids** | **[list_t](char.md) \*** | Return only usage for these users. | [optional] 
**api_key_ids** | **[list_t](char.md) \*** | Return only usage for these API keys. | [optional] 
**models** | **[list_t](char.md) \*** | Return only usage for these models. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UsageAPI_usageVectorStores**
```c
// Get vector stores usage details for the organization.
//
usage_response_t* UsageAPI_usageVectorStores(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageVectorStores_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**start_time** | **int \*** | Start time (Unix seconds) of the query time range, inclusive. | 
**end_time** | **int \*** | End time (Unix seconds) of the query time range, exclusive. | [optional] 
**bucket_width** | **openai_api_usageVectorStores_bucket_width_e** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
**project_ids** | **[list_t](char.md) \*** | Return only usage for these projects. | [optional] 
**group_by** | **[list_t](char.md) \*** | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
**limit** | **int \*** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
**page** | **char \*** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[usage_response_t](usage_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

