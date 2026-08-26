# UsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usage_audio_speeches**](UsageApi.md#usage_audio_speeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usage_audio_transcriptions**](UsageApi.md#usage_audio_transcriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usage_code_interpreter_sessions**](UsageApi.md#usage_code_interpreter_sessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usage_completions**](UsageApi.md#usage_completions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usage_costs**](UsageApi.md#usage_costs) | **GET** /organization/costs | Get costs details for the organization.
[**usage_embeddings**](UsageApi.md#usage_embeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usage_images**](UsageApi.md#usage_images) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usage_moderations**](UsageApi.md#usage_moderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usage_vector_stores**](UsageApi.md#usage_vector_stores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **usage_audio_speeches**
> `usage_audio_speeches`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_audio_speeches`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get audio speeches usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`user_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these users. | [default to nothing]
 **`api_key_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these API keys. | [default to nothing]
 **`models`** | [**`Vector{String}`**](String.md) | Return only usage for these models. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_audio_transcriptions**
> `usage_audio_transcriptions`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_audio_transcriptions`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get audio transcriptions usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`user_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these users. | [default to nothing]
 **`api_key_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these API keys. | [default to nothing]
 **`models`** | [**`Vector{String}`**](String.md) | Return only usage for these models. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_code_interpreter_sessions**
> `usage_code_interpreter_sessions`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_code_interpreter_sessions`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get code interpreter sessions usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_completions**
> `usage_completions`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `batch`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_completions`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `batch`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get completions usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`user_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these users. | [default to nothing]
 **`api_key_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these API keys. | [default to nothing]
 **`models`** | [**`Vector{String}`**](String.md) | Return only usage for these models. | [default to nothing]
 **`batch`** | **`Bool`** | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_costs**
> `usage_costs`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_costs`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get costs details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only costs for these projects. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [default to 7]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_embeddings**
> `usage_embeddings`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_embeddings`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get embeddings usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`user_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these users. | [default to nothing]
 **`api_key_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these API keys. | [default to nothing]
 **`models`** | [**`Vector{String}`**](String.md) | Return only usage for these models. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_images**
> `usage_images`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `sources`=nothing, `sizes`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_images`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `sources`=nothing, `sizes`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get images usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`sources`** | [**`Vector{String}`**](String.md) | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [default to nothing]
 **`sizes`** | [**`Vector{String}`**](String.md) | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [default to nothing]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`user_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these users. | [default to nothing]
 **`api_key_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these API keys. | [default to nothing]
 **`models`** | [**`Vector{String}`**](String.md) | Return only usage for these models. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_moderations**
> `usage_moderations`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_moderations`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `user_ids`=nothing, `api_key_ids`=nothing, `models`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get moderations usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`user_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these users. | [default to nothing]
 **`api_key_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these API keys. | [default to nothing]
 **`models`** | [**`Vector{String}`**](String.md) | Return only usage for these models. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **usage_vector_stores**
> `usage_vector_stores`(_api::`UsageApi`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `UsageResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `usage_vector_stores`(_api::`UsageApi`, response_stream::`Channel`, `start_time`::`Int64`; `end_time`=nothing, `bucket_width`=nothing, `project_ids`=nothing, `group_by`=nothing, `limit`=nothing, `page`=nothing, _mediaType=nothing) -> `Channel`{ `UsageResponse` }, `OpenAPI.Clients.ApiResponse`

Get vector stores usage details for the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`UsageApi`** | API context | 
**`start_time`** | **`Int64`** | Start time (Unix seconds) of the query time range, inclusive. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`end_time`** | **`Int64`** | End time (Unix seconds) of the query time range, exclusive. | [default to nothing]
 **`bucket_width`** | **`String`** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [default to &quot;1d&quot;]
 **`project_ids`** | [**`Vector{String}`**](String.md) | Return only usage for these projects. | [default to nothing]
 **`group_by`** | [**`Vector{String}`**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [default to nothing]
 **`limit`** | **`Int64`** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [default to nothing]
 **`page`** | **`String`** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [default to nothing]

### Return type

[**`UsageResponse`**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

