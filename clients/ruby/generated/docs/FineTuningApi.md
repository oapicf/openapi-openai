# OpenApiOpenAIClient::FineTuningApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**cancel_fine_tuning_job**](FineTuningApi.md#cancel_fine_tuning_job) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job.  |
| [**create_fine_tuning_job**](FineTuningApi.md#create_fine_tuning_job) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |
| [**list_fine_tuning_events**](FineTuningApi.md#list_fine_tuning_events) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job.  |
| [**list_fine_tuning_job_checkpoints**](FineTuningApi.md#list_fine_tuning_job_checkpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job.  |
| [**list_paginated_fine_tuning_jobs**](FineTuningApi.md#list_paginated_fine_tuning_jobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs  |
| [**retrieve_fine_tuning_job**](FineTuningApi.md#retrieve_fine_tuning_job) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning)  |


## cancel_fine_tuning_job

> <FineTuningJob> cancel_fine_tuning_job(fine_tuning_job_id)

Immediately cancel a fine-tune job. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FineTuningApi.new
fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tuning job to cancel. 

begin
  # Immediately cancel a fine-tune job. 
  result = api_instance.cancel_fine_tuning_job(fine_tuning_job_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->cancel_fine_tuning_job: #{e}"
end
```

#### Using the cancel_fine_tuning_job_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FineTuningJob>, Integer, Hash)> cancel_fine_tuning_job_with_http_info(fine_tuning_job_id)

```ruby
begin
  # Immediately cancel a fine-tune job. 
  data, status_code, headers = api_instance.cancel_fine_tuning_job_with_http_info(fine_tuning_job_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FineTuningJob>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->cancel_fine_tuning_job_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tuning_job_id** | **String** | The ID of the fine-tuning job to cancel.  |  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## create_fine_tuning_job

> <FineTuningJob> create_fine_tuning_job(create_fine_tuning_job_request)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FineTuningApi.new
create_fine_tuning_job_request = OpenApiOpenAIClient::CreateFineTuningJobRequest.new({model: OpenApiOpenAIClient::CreateFineTuningJobRequestModel.new, training_file: 'file-abc123'}) # CreateFineTuningJobRequest | 

begin
  # Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  result = api_instance.create_fine_tuning_job(create_fine_tuning_job_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->create_fine_tuning_job: #{e}"
end
```

#### Using the create_fine_tuning_job_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FineTuningJob>, Integer, Hash)> create_fine_tuning_job_with_http_info(create_fine_tuning_job_request)

```ruby
begin
  # Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  data, status_code, headers = api_instance.create_fine_tuning_job_with_http_info(create_fine_tuning_job_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FineTuningJob>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->create_fine_tuning_job_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_fine_tuning_job_request** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md) |  |  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## list_fine_tuning_events

> <ListFineTuningJobEventsResponse> list_fine_tuning_events(fine_tuning_job_id, opts)

Get status updates for a fine-tuning job. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FineTuningApi.new
fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tuning job to get events for. 
opts = {
  after: 'after_example', # String | Identifier for the last event from the previous pagination request.
  limit: 56 # Integer | Number of events to retrieve.
}

begin
  # Get status updates for a fine-tuning job. 
  result = api_instance.list_fine_tuning_events(fine_tuning_job_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->list_fine_tuning_events: #{e}"
end
```

#### Using the list_fine_tuning_events_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListFineTuningJobEventsResponse>, Integer, Hash)> list_fine_tuning_events_with_http_info(fine_tuning_job_id, opts)

```ruby
begin
  # Get status updates for a fine-tuning job. 
  data, status_code, headers = api_instance.list_fine_tuning_events_with_http_info(fine_tuning_job_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListFineTuningJobEventsResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->list_fine_tuning_events_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tuning_job_id** | **String** | The ID of the fine-tuning job to get events for.  |  |
| **after** | **String** | Identifier for the last event from the previous pagination request. | [optional] |
| **limit** | **Integer** | Number of events to retrieve. | [optional][default to 20] |

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_fine_tuning_job_checkpoints

> <ListFineTuningJobCheckpointsResponse> list_fine_tuning_job_checkpoints(fine_tuning_job_id, opts)

List checkpoints for a fine-tuning job. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FineTuningApi.new
fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tuning job to get checkpoints for. 
opts = {
  after: 'after_example', # String | Identifier for the last checkpoint ID from the previous pagination request.
  limit: 56 # Integer | Number of checkpoints to retrieve.
}

begin
  # List checkpoints for a fine-tuning job. 
  result = api_instance.list_fine_tuning_job_checkpoints(fine_tuning_job_id, opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->list_fine_tuning_job_checkpoints: #{e}"
end
```

#### Using the list_fine_tuning_job_checkpoints_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListFineTuningJobCheckpointsResponse>, Integer, Hash)> list_fine_tuning_job_checkpoints_with_http_info(fine_tuning_job_id, opts)

```ruby
begin
  # List checkpoints for a fine-tuning job. 
  data, status_code, headers = api_instance.list_fine_tuning_job_checkpoints_with_http_info(fine_tuning_job_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListFineTuningJobCheckpointsResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->list_fine_tuning_job_checkpoints_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tuning_job_id** | **String** | The ID of the fine-tuning job to get checkpoints for.  |  |
| **after** | **String** | Identifier for the last checkpoint ID from the previous pagination request. | [optional] |
| **limit** | **Integer** | Number of checkpoints to retrieve. | [optional][default to 10] |

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_paginated_fine_tuning_jobs

> <ListPaginatedFineTuningJobsResponse> list_paginated_fine_tuning_jobs(opts)

List your organization's fine-tuning jobs 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FineTuningApi.new
opts = {
  after: 'after_example', # String | Identifier for the last job from the previous pagination request.
  limit: 56 # Integer | Number of fine-tuning jobs to retrieve.
}

begin
  # List your organization's fine-tuning jobs 
  result = api_instance.list_paginated_fine_tuning_jobs(opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->list_paginated_fine_tuning_jobs: #{e}"
end
```

#### Using the list_paginated_fine_tuning_jobs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListPaginatedFineTuningJobsResponse>, Integer, Hash)> list_paginated_fine_tuning_jobs_with_http_info(opts)

```ruby
begin
  # List your organization's fine-tuning jobs 
  data, status_code, headers = api_instance.list_paginated_fine_tuning_jobs_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListPaginatedFineTuningJobsResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->list_paginated_fine_tuning_jobs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **after** | **String** | Identifier for the last job from the previous pagination request. | [optional] |
| **limit** | **Integer** | Number of fine-tuning jobs to retrieve. | [optional][default to 20] |

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_fine_tuning_job

> <FineTuningJob> retrieve_fine_tuning_job(fine_tuning_job_id)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::FineTuningApi.new
fine_tuning_job_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # String | The ID of the fine-tuning job. 

begin
  # Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  result = api_instance.retrieve_fine_tuning_job(fine_tuning_job_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->retrieve_fine_tuning_job: #{e}"
end
```

#### Using the retrieve_fine_tuning_job_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FineTuningJob>, Integer, Hash)> retrieve_fine_tuning_job_with_http_info(fine_tuning_job_id)

```ruby
begin
  # Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  data, status_code, headers = api_instance.retrieve_fine_tuning_job_with_http_info(fine_tuning_job_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FineTuningJob>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling FineTuningApi->retrieve_fine_tuning_job_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fine_tuning_job_id** | **String** | The ID of the fine-tuning job.  |  |

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

