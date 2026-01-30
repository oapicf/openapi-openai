# USAGE_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**usage_audio_speeches**](USAGE_API.md#usage_audio_speeches) | **Get** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usage_audio_transcriptions**](USAGE_API.md#usage_audio_transcriptions) | **Get** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usage_code_interpreter_sessions**](USAGE_API.md#usage_code_interpreter_sessions) | **Get** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usage_completions**](USAGE_API.md#usage_completions) | **Get** /organization/usage/completions | Get completions usage details for the organization.
[**usage_costs**](USAGE_API.md#usage_costs) | **Get** /organization/costs | Get costs details for the organization.
[**usage_embeddings**](USAGE_API.md#usage_embeddings) | **Get** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usage_images**](USAGE_API.md#usage_images) | **Get** /organization/usage/images | Get images usage details for the organization.
[**usage_moderations**](USAGE_API.md#usage_moderations) | **Get** /organization/usage/moderations | Get moderations usage details for the organization.
[**usage_vector_stores**](USAGE_API.md#usage_vector_stores) | **Get** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **usage_audio_speeches**
> usage_audio_speeches (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; user_ids:  detachable LIST [STRING_32] ; api_key_ids:  detachable LIST [STRING_32] ; models:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get audio speeches usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **user_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these users. | [optional] [default to null]
 **api_key_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these API keys. | [optional] [default to null]
 **models** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these models. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_audio_transcriptions**
> usage_audio_transcriptions (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; user_ids:  detachable LIST [STRING_32] ; api_key_ids:  detachable LIST [STRING_32] ; models:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get audio transcriptions usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **user_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these users. | [optional] [default to null]
 **api_key_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these API keys. | [optional] [default to null]
 **models** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these models. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_code_interpreter_sessions**
> usage_code_interpreter_sessions (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get code interpreter sessions usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_completions**
> usage_completions (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; user_ids:  detachable LIST [STRING_32] ; api_key_ids:  detachable LIST [STRING_32] ; models:  detachable LIST [STRING_32] ; batch:  detachable BOOLEAN ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get completions usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **user_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these users. | [optional] [default to null]
 **api_key_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these API keys. | [optional] [default to null]
 **models** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these models. | [optional] [default to null]
 **batch** | **BOOLEAN**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_costs**
> usage_costs (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get costs details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only costs for these projects. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_embeddings**
> usage_embeddings (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; user_ids:  detachable LIST [STRING_32] ; api_key_ids:  detachable LIST [STRING_32] ; models:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get embeddings usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **user_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these users. | [optional] [default to null]
 **api_key_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these API keys. | [optional] [default to null]
 **models** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these models. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_images**
> usage_images (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; sources:  detachable LIST [STRING_32] ; sizes:  detachable LIST [STRING_32] ; project_ids:  detachable LIST [STRING_32] ; user_ids:  detachable LIST [STRING_32] ; api_key_ids:  detachable LIST [STRING_32] ; models:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get images usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **sources** | [**LIST [STRING_32]**](STRING_32.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] [default to null]
 **sizes** | [**LIST [STRING_32]**](STRING_32.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] [default to null]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **user_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these users. | [optional] [default to null]
 **api_key_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these API keys. | [optional] [default to null]
 **models** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these models. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_moderations**
> usage_moderations (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; user_ids:  detachable LIST [STRING_32] ; api_key_ids:  detachable LIST [STRING_32] ; models:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get moderations usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **user_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these users. | [optional] [default to null]
 **api_key_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these API keys. | [optional] [default to null]
 **models** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these models. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_vector_stores**
> usage_vector_stores (start_time: INTEGER_32 ; end_time:  detachable INTEGER_32 ; bucket_width:  detachable STRING_32 ; project_ids:  detachable LIST [STRING_32] ; group_by:  detachable LIST [STRING_32] ; limit:  detachable INTEGER_32 ; page:  detachable STRING_32 ): detachable USAGE_RESPONSE


Get vector stores usage details for the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **INTEGER_32**| Start time (Unix seconds) of the query time range, inclusive. | [default to null]
 **end_time** | **INTEGER_32**| End time (Unix seconds) of the query time range, exclusive. | [optional] [default to null]
 **bucket_width** | **STRING_32**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to 1d]
 **project_ids** | [**LIST [STRING_32]**](STRING_32.md)| Return only usage for these projects. | [optional] [default to null]
 **group_by** | [**LIST [STRING_32]**](STRING_32.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] [default to null]
 **limit** | **INTEGER_32**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] [default to null]
 **page** | **STRING_32**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] [default to null]

### Return type

[**USAGE_RESPONSE**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

