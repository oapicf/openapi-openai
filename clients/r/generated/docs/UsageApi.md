# UsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UsageAudioSpeeches**](UsageApi.md#UsageAudioSpeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**UsageAudioTranscriptions**](UsageApi.md#UsageAudioTranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**UsageCodeInterpreterSessions**](UsageApi.md#UsageCodeInterpreterSessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**UsageCompletions**](UsageApi.md#UsageCompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**UsageCosts**](UsageApi.md#UsageCosts) | **GET** /organization/costs | Get costs details for the organization.
[**UsageEmbeddings**](UsageApi.md#UsageEmbeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**UsageImages**](UsageApi.md#UsageImages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**UsageModerations**](UsageApi.md#UsageModerations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**UsageVectorStores**](UsageApi.md#UsageVectorStores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **UsageAudioSpeeches**
> UsageResponse UsageAudioSpeeches(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, user_ids = var.user_ids, api_key_ids = var.api_key_ids, models = var.models, group_by = var.group_by, limit = var.limit, page = var.page)

Get audio speeches usage details for the organization.

### Example
```R
library(openapi)

# Get audio speeches usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_user_ids <- c("inner_example") # array[character] | Return only usage for these users. (Optional)
var_api_key_ids <- c("inner_example") # array[character] | Return only usage for these API keys. (Optional)
var_models <- c("inner_example") # array[character] | Return only usage for these models. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageAudioSpeeches(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageAudioSpeeches(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **user_ids** | list( **character** )| Return only usage for these users. | [optional] 
 **api_key_ids** | list( **character** )| Return only usage for these API keys. | [optional] 
 **models** | list( **character** )| Return only usage for these models. | [optional] 
 **group_by** | Enum [project_id, user_id, api_key_id, model] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageAudioTranscriptions**
> UsageResponse UsageAudioTranscriptions(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, user_ids = var.user_ids, api_key_ids = var.api_key_ids, models = var.models, group_by = var.group_by, limit = var.limit, page = var.page)

Get audio transcriptions usage details for the organization.

### Example
```R
library(openapi)

# Get audio transcriptions usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_user_ids <- c("inner_example") # array[character] | Return only usage for these users. (Optional)
var_api_key_ids <- c("inner_example") # array[character] | Return only usage for these API keys. (Optional)
var_models <- c("inner_example") # array[character] | Return only usage for these models. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageAudioTranscriptions(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageAudioTranscriptions(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **user_ids** | list( **character** )| Return only usage for these users. | [optional] 
 **api_key_ids** | list( **character** )| Return only usage for these API keys. | [optional] 
 **models** | list( **character** )| Return only usage for these models. | [optional] 
 **group_by** | Enum [project_id, user_id, api_key_id, model] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageCodeInterpreterSessions**
> UsageResponse UsageCodeInterpreterSessions(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, group_by = var.group_by, limit = var.limit, page = var.page)

Get code interpreter sessions usage details for the organization.

### Example
```R
library(openapi)

# Get code interpreter sessions usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageCodeInterpreterSessions(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageCodeInterpreterSessions(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **group_by** | Enum [project_id] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageCompletions**
> UsageResponse UsageCompletions(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, user_ids = var.user_ids, api_key_ids = var.api_key_ids, models = var.models, batch = var.batch, group_by = var.group_by, limit = var.limit, page = var.page)

Get completions usage details for the organization.

### Example
```R
library(openapi)

# Get completions usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_user_ids <- c("inner_example") # array[character] | Return only usage for these users. (Optional)
var_api_key_ids <- c("inner_example") # array[character] | Return only usage for these API keys. (Optional)
var_models <- c("inner_example") # array[character] | Return only usage for these models. (Optional)
var_batch <- "batch_example" # character | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageCompletions(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, batch = var_batch, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageCompletions(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, batch = var_batch, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **user_ids** | list( **character** )| Return only usage for these users. | [optional] 
 **api_key_ids** | list( **character** )| Return only usage for these API keys. | [optional] 
 **models** | list( **character** )| Return only usage for these models. | [optional] 
 **batch** | **character**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
 **group_by** | Enum [project_id, user_id, api_key_id, model, batch] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageCosts**
> UsageResponse UsageCosts(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, group_by = var.group_by, limit = 7, page = var.page)

Get costs details for the organization.

### Example
```R
library(openapi)

# Get costs details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only costs for these projects. (Optional)
var_group_by <- c("project_id") # array[character] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (Optional)
var_limit <- 7 # integer | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageCosts(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageCosts(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1d] | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only costs for these projects. | [optional] 
 **group_by** | Enum [project_id, line_item] | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
 **limit** | **integer**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageEmbeddings**
> UsageResponse UsageEmbeddings(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, user_ids = var.user_ids, api_key_ids = var.api_key_ids, models = var.models, group_by = var.group_by, limit = var.limit, page = var.page)

Get embeddings usage details for the organization.

### Example
```R
library(openapi)

# Get embeddings usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_user_ids <- c("inner_example") # array[character] | Return only usage for these users. (Optional)
var_api_key_ids <- c("inner_example") # array[character] | Return only usage for these API keys. (Optional)
var_models <- c("inner_example") # array[character] | Return only usage for these models. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageEmbeddings(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageEmbeddings(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **user_ids** | list( **character** )| Return only usage for these users. | [optional] 
 **api_key_ids** | list( **character** )| Return only usage for these API keys. | [optional] 
 **models** | list( **character** )| Return only usage for these models. | [optional] 
 **group_by** | Enum [project_id, user_id, api_key_id, model] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageImages**
> UsageResponse UsageImages(start_time, end_time = var.end_time, bucket_width = "1d", sources = var.sources, sizes = var.sizes, project_ids = var.project_ids, user_ids = var.user_ids, api_key_ids = var.api_key_ids, models = var.models, group_by = var.group_by, limit = var.limit, page = var.page)

Get images usage details for the organization.

### Example
```R
library(openapi)

# Get images usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_sources <- c("image.generation") # array[character] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (Optional)
var_sizes <- c("256x256") # array[character] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_user_ids <- c("inner_example") # array[character] | Return only usage for these users. (Optional)
var_api_key_ids <- c("inner_example") # array[character] | Return only usage for these API keys. (Optional)
var_models <- c("inner_example") # array[character] | Return only usage for these models. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageImages(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, sources = var_sources, sizes = var_sizes, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageImages(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, sources = var_sources, sizes = var_sizes, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **sources** | Enum [image.generation, image.edit, image.variation] | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
 **sizes** | Enum [256x256, 512x512, 1024x1024, 1792x1792, 1024x1792] | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **user_ids** | list( **character** )| Return only usage for these users. | [optional] 
 **api_key_ids** | list( **character** )| Return only usage for these API keys. | [optional] 
 **models** | list( **character** )| Return only usage for these models. | [optional] 
 **group_by** | Enum [project_id, user_id, api_key_id, model, size, source] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageModerations**
> UsageResponse UsageModerations(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, user_ids = var.user_ids, api_key_ids = var.api_key_ids, models = var.models, group_by = var.group_by, limit = var.limit, page = var.page)

Get moderations usage details for the organization.

### Example
```R
library(openapi)

# Get moderations usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_user_ids <- c("inner_example") # array[character] | Return only usage for these users. (Optional)
var_api_key_ids <- c("inner_example") # array[character] | Return only usage for these API keys. (Optional)
var_models <- c("inner_example") # array[character] | Return only usage for these models. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageModerations(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageModerations(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, user_ids = var_user_ids, api_key_ids = var_api_key_ids, models = var_models, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **user_ids** | list( **character** )| Return only usage for these users. | [optional] 
 **api_key_ids** | list( **character** )| Return only usage for these API keys. | [optional] 
 **models** | list( **character** )| Return only usage for these models. | [optional] 
 **group_by** | Enum [project_id, user_id, api_key_id, model] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

# **UsageVectorStores**
> UsageResponse UsageVectorStores(start_time, end_time = var.end_time, bucket_width = "1d", project_ids = var.project_ids, group_by = var.group_by, limit = var.limit, page = var.page)

Get vector stores usage details for the organization.

### Example
```R
library(openapi)

# Get vector stores usage details for the organization.
#
# prepare function argument(s)
var_start_time <- 56 # integer | Start time (Unix seconds) of the query time range, inclusive.
var_end_time <- 56 # integer | End time (Unix seconds) of the query time range, exclusive. (Optional)
var_bucket_width <- "1d" # character | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (Optional)
var_project_ids <- c("inner_example") # array[character] | Return only usage for these projects. (Optional)
var_group_by <- c("project_id") # array[character] | Group the usage data by the specified fields. Support fields include `project_id`. (Optional)
var_limit <- 56 # integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (Optional)
var_page <- "page_example" # character | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (Optional)

api_instance <- UsageApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UsageVectorStores(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, group_by = var_group_by, limit = var_limit, page = var_pagedata_file = "result.txt")
result <- api_instance$UsageVectorStores(var_start_time, end_time = var_end_time, bucket_width = var_bucket_width, project_ids = var_project_ids, group_by = var_group_by, limit = var_limit, page = var_page)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **integer**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **integer**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | Enum [1m, 1h, 1d] | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &quot;1d&quot;]
 **project_ids** | list( **character** )| Return only usage for these projects. | [optional] 
 **group_by** | Enum [project_id] | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **integer**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **character**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

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

