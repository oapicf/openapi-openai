# usage_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**usage-audio-speeches**](usage_api.md#usage-audio-speeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
**usage-audio-transcriptions**](usage_api.md#usage-audio-transcriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
**usage-code-interpreter-sessions**](usage_api.md#usage-code-interpreter-sessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
**usage-completions**](usage_api.md#usage-completions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
**usage-costs**](usage_api.md#usage-costs) | **GET** /organization/costs | Get costs details for the organization.
**usage-embeddings**](usage_api.md#usage-embeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
**usage-images**](usage_api.md#usage-images) | **GET** /organization/usage/images | Get images usage details for the organization.
**usage-moderations**](usage_api.md#usage-moderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
**usage-vector-stores**](usage_api.md#usage-vector-stores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **usage-audio-speeches**
> models::UsageResponse usage-audio-speeches(ctx, start_time, optional)
Get audio speeches usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **user_ids** | [**String**](String.md)| Return only usage for these users. | 
 **api_key_ids** | [**String**](String.md)| Return only usage for these API keys. | 
 **models** | [**String**](String.md)| Return only usage for these models. | 
 **group_by** | [**models::UsageAudioSpeechesGroupByParameterInner**](models::UsageAudioSpeechesGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-audio-transcriptions**
> models::UsageResponse usage-audio-transcriptions(ctx, start_time, optional)
Get audio transcriptions usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **user_ids** | [**String**](String.md)| Return only usage for these users. | 
 **api_key_ids** | [**String**](String.md)| Return only usage for these API keys. | 
 **models** | [**String**](String.md)| Return only usage for these models. | 
 **group_by** | [**models::UsageAudioSpeechesGroupByParameterInner**](models::UsageAudioSpeechesGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-code-interpreter-sessions**
> models::UsageResponse usage-code-interpreter-sessions(ctx, start_time, optional)
Get code interpreter sessions usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **group_by** | [**models::UsageCodeInterpreterSessionsGroupByParameterInner**](models::UsageCodeInterpreterSessionsGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-completions**
> models::UsageResponse usage-completions(ctx, start_time, optional)
Get completions usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **user_ids** | [**String**](String.md)| Return only usage for these users. | 
 **api_key_ids** | [**String**](String.md)| Return only usage for these API keys. | 
 **models** | [**String**](String.md)| Return only usage for these models. | 
 **batch** | **bool**| If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  | 
 **group_by** | [**models::UsageCompletionsGroupByParameterInner**](models::UsageCompletionsGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-costs**
> models::UsageResponse usage-costs(ctx, start_time, optional)
Get costs details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only costs for these projects. | 
 **group_by** | [**models::UsageCostsGroupByParameterInner**](models::UsageCostsGroupByParameterInner.md)| Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. | 
 **limit** | **i32**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [default to 7]
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-embeddings**
> models::UsageResponse usage-embeddings(ctx, start_time, optional)
Get embeddings usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **user_ids** | [**String**](String.md)| Return only usage for these users. | 
 **api_key_ids** | [**String**](String.md)| Return only usage for these API keys. | 
 **models** | [**String**](String.md)| Return only usage for these models. | 
 **group_by** | [**models::UsageAudioSpeechesGroupByParameterInner**](models::UsageAudioSpeechesGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-images**
> models::UsageResponse usage-images(ctx, start_time, optional)
Get images usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **sources** | [**models::UsageImagesSourcesParameterInner**](models::UsageImagesSourcesParameterInner.md)| Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. | 
 **sizes** | [**models::UsageImagesSizesParameterInner**](models::UsageImagesSizesParameterInner.md)| Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **user_ids** | [**String**](String.md)| Return only usage for these users. | 
 **api_key_ids** | [**String**](String.md)| Return only usage for these API keys. | 
 **models** | [**String**](String.md)| Return only usage for these models. | 
 **group_by** | [**models::UsageImagesGroupByParameterInner**](models::UsageImagesGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-moderations**
> models::UsageResponse usage-moderations(ctx, start_time, optional)
Get moderations usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **user_ids** | [**String**](String.md)| Return only usage for these users. | 
 **api_key_ids** | [**String**](String.md)| Return only usage for these API keys. | 
 **models** | [**String**](String.md)| Return only usage for these models. | 
 **group_by** | [**models::UsageAudioSpeechesGroupByParameterInner**](models::UsageAudioSpeechesGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage-vector-stores**
> models::UsageResponse usage-vector-stores(ctx, start_time, optional)
Get vector stores usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **i32**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **i32**| End time (Unix seconds) of the query time range, exclusive. | 
 **bucket_width** | [****](.md)| Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. | 
 **project_ids** | [**String**](String.md)| Return only usage for these projects. | 
 **group_by** | [**models::UsageCodeInterpreterSessionsGroupByParameterInner**](models::UsageCodeInterpreterSessionsGroupByParameterInner.md)| Group the usage data by the specified fields. Support fields include `project_id`. | 
 **limit** | **i32**| Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  | 
 **page** | **String**| A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. | 

### Return type

[**models::UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

