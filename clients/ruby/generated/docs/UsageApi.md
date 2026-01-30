# OpenApiOpenAIClient::UsageApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**usage_audio_speeches**](UsageApi.md#usage_audio_speeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization. |
| [**usage_audio_transcriptions**](UsageApi.md#usage_audio_transcriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization. |
| [**usage_code_interpreter_sessions**](UsageApi.md#usage_code_interpreter_sessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization. |
| [**usage_completions**](UsageApi.md#usage_completions) | **GET** /organization/usage/completions | Get completions usage details for the organization. |
| [**usage_costs**](UsageApi.md#usage_costs) | **GET** /organization/costs | Get costs details for the organization. |
| [**usage_embeddings**](UsageApi.md#usage_embeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization. |
| [**usage_images**](UsageApi.md#usage_images) | **GET** /organization/usage/images | Get images usage details for the organization. |
| [**usage_moderations**](UsageApi.md#usage_moderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization. |
| [**usage_vector_stores**](UsageApi.md#usage_vector_stores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization. |


## usage_audio_speeches

> <UsageResponse> usage_audio_speeches(start_time, opts)

Get audio speeches usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  user_ids: ['inner_example'], # Array<String> | Return only usage for these users.
  api_key_ids: ['inner_example'], # Array<String> | Return only usage for these API keys.
  models: ['inner_example'], # Array<String> | Return only usage for these models.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get audio speeches usage details for the organization.
  result = api_instance.usage_audio_speeches(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_audio_speeches: #{e}"
end
```

#### Using the usage_audio_speeches_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_audio_speeches_with_http_info(start_time, opts)

```ruby
begin
  # Get audio speeches usage details for the organization.
  data, status_code, headers = api_instance.usage_audio_speeches_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_audio_speeches_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **user_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these users. | [optional] |
| **api_key_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these API keys. | [optional] |
| **models** | [**Array&lt;String&gt;**](String.md) | Return only usage for these models. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_audio_transcriptions

> <UsageResponse> usage_audio_transcriptions(start_time, opts)

Get audio transcriptions usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  user_ids: ['inner_example'], # Array<String> | Return only usage for these users.
  api_key_ids: ['inner_example'], # Array<String> | Return only usage for these API keys.
  models: ['inner_example'], # Array<String> | Return only usage for these models.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get audio transcriptions usage details for the organization.
  result = api_instance.usage_audio_transcriptions(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_audio_transcriptions: #{e}"
end
```

#### Using the usage_audio_transcriptions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_audio_transcriptions_with_http_info(start_time, opts)

```ruby
begin
  # Get audio transcriptions usage details for the organization.
  data, status_code, headers = api_instance.usage_audio_transcriptions_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_audio_transcriptions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **user_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these users. | [optional] |
| **api_key_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these API keys. | [optional] |
| **models** | [**Array&lt;String&gt;**](String.md) | Return only usage for these models. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_code_interpreter_sessions

> <UsageResponse> usage_code_interpreter_sessions(start_time, opts)

Get code interpreter sessions usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get code interpreter sessions usage details for the organization.
  result = api_instance.usage_code_interpreter_sessions(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_code_interpreter_sessions: #{e}"
end
```

#### Using the usage_code_interpreter_sessions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_code_interpreter_sessions_with_http_info(start_time, opts)

```ruby
begin
  # Get code interpreter sessions usage details for the organization.
  data, status_code, headers = api_instance.usage_code_interpreter_sessions_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_code_interpreter_sessions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_completions

> <UsageResponse> usage_completions(start_time, opts)

Get completions usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  user_ids: ['inner_example'], # Array<String> | Return only usage for these users.
  api_key_ids: ['inner_example'], # Array<String> | Return only usage for these API keys.
  models: ['inner_example'], # Array<String> | Return only usage for these models.
  batch: true, # Boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get completions usage details for the organization.
  result = api_instance.usage_completions(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_completions: #{e}"
end
```

#### Using the usage_completions_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_completions_with_http_info(start_time, opts)

```ruby
begin
  # Get completions usage details for the organization.
  data, status_code, headers = api_instance.usage_completions_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_completions_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **user_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these users. | [optional] |
| **api_key_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these API keys. | [optional] |
| **models** | [**Array&lt;String&gt;**](String.md) | Return only usage for these models. | [optional] |
| **batch** | **Boolean** | If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_costs

> <UsageResponse> usage_costs(start_time, opts)

Get costs details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1d', # String | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only costs for these projects.
  group_by: ['project_id'], # Array<String> | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
  limit: 56, # Integer | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get costs details for the organization.
  result = api_instance.usage_costs(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_costs: #{e}"
end
```

#### Using the usage_costs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_costs_with_http_info(start_time, opts)

```ruby
begin
  # Get costs details for the organization.
  data, status_code, headers = api_instance.usage_costs_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_costs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only costs for these projects. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] |
| **limit** | **Integer** | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional][default to 7] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_embeddings

> <UsageResponse> usage_embeddings(start_time, opts)

Get embeddings usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  user_ids: ['inner_example'], # Array<String> | Return only usage for these users.
  api_key_ids: ['inner_example'], # Array<String> | Return only usage for these API keys.
  models: ['inner_example'], # Array<String> | Return only usage for these models.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get embeddings usage details for the organization.
  result = api_instance.usage_embeddings(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_embeddings: #{e}"
end
```

#### Using the usage_embeddings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_embeddings_with_http_info(start_time, opts)

```ruby
begin
  # Get embeddings usage details for the organization.
  data, status_code, headers = api_instance.usage_embeddings_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_embeddings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **user_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these users. | [optional] |
| **api_key_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these API keys. | [optional] |
| **models** | [**Array&lt;String&gt;**](String.md) | Return only usage for these models. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_images

> <UsageResponse> usage_images(start_time, opts)

Get images usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  sources: ['image.generation'], # Array<String> | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
  sizes: ['256x256'], # Array<String> | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  user_ids: ['inner_example'], # Array<String> | Return only usage for these users.
  api_key_ids: ['inner_example'], # Array<String> | Return only usage for these API keys.
  models: ['inner_example'], # Array<String> | Return only usage for these models.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get images usage details for the organization.
  result = api_instance.usage_images(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_images: #{e}"
end
```

#### Using the usage_images_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_images_with_http_info(start_time, opts)

```ruby
begin
  # Get images usage details for the organization.
  data, status_code, headers = api_instance.usage_images_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_images_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **sources** | [**Array&lt;String&gt;**](String.md) | Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] |
| **sizes** | [**Array&lt;String&gt;**](String.md) | Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **user_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these users. | [optional] |
| **api_key_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these API keys. | [optional] |
| **models** | [**Array&lt;String&gt;**](String.md) | Return only usage for these models. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_moderations

> <UsageResponse> usage_moderations(start_time, opts)

Get moderations usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  user_ids: ['inner_example'], # Array<String> | Return only usage for these users.
  api_key_ids: ['inner_example'], # Array<String> | Return only usage for these API keys.
  models: ['inner_example'], # Array<String> | Return only usage for these models.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get moderations usage details for the organization.
  result = api_instance.usage_moderations(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_moderations: #{e}"
end
```

#### Using the usage_moderations_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_moderations_with_http_info(start_time, opts)

```ruby
begin
  # Get moderations usage details for the organization.
  data, status_code, headers = api_instance.usage_moderations_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_moderations_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **user_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these users. | [optional] |
| **api_key_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these API keys. | [optional] |
| **models** | [**Array&lt;String&gt;**](String.md) | Return only usage for these models. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## usage_vector_stores

> <UsageResponse> usage_vector_stores(start_time, opts)

Get vector stores usage details for the organization.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::UsageApi.new
start_time = 56 # Integer | Start time (Unix seconds) of the query time range, inclusive.
opts = {
  end_time: 56, # Integer | End time (Unix seconds) of the query time range, exclusive.
  bucket_width: '1m', # String | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
  project_ids: ['inner_example'], # Array<String> | Return only usage for these projects.
  group_by: ['project_id'], # Array<String> | Group the usage data by the specified fields. Support fields include `project_id`.
  limit: 56, # Integer | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
  page: 'page_example' # String | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.
}

begin
  # Get vector stores usage details for the organization.
  result = api_instance.usage_vector_stores(start_time, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_vector_stores: #{e}"
end
```

#### Using the usage_vector_stores_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UsageResponse>, Integer, Hash)> usage_vector_stores_with_http_info(start_time, opts)

```ruby
begin
  # Get vector stores usage details for the organization.
  data, status_code, headers = api_instance.usage_vector_stores_with_http_info(start_time, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UsageResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling UsageApi->usage_vector_stores_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **Integer** | Start time (Unix seconds) of the query time range, inclusive. |  |
| **end_time** | **Integer** | End time (Unix seconds) of the query time range, exclusive. | [optional] |
| **bucket_width** | **String** | Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional][default to &#39;1d&#39;] |
| **project_ids** | [**Array&lt;String&gt;**](String.md) | Return only usage for these projects. | [optional] |
| **group_by** | [**Array&lt;String&gt;**](String.md) | Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] |
| **limit** | **Integer** | Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] |
| **page** | **String** | A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] |

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

