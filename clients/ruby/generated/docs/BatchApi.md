# OpenApiOpenAIClient::BatchApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**cancel_batch**](BatchApi.md#cancel_batch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file. |
| [**create_batch**](BatchApi.md#create_batch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests |
| [**list_batches**](BatchApi.md#list_batches) | **GET** /batches | List your organization&#39;s batches. |
| [**retrieve_batch**](BatchApi.md#retrieve_batch) | **GET** /batches/{batch_id} | Retrieves a batch. |


## cancel_batch

> <Batch> cancel_batch(batch_id)

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::BatchApi.new
batch_id = 'batch_id_example' # String | The ID of the batch to cancel.

begin
  # Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
  result = api_instance.cancel_batch(batch_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->cancel_batch: #{e}"
end
```

#### Using the cancel_batch_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Batch>, Integer, Hash)> cancel_batch_with_http_info(batch_id)

```ruby
begin
  # Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
  data, status_code, headers = api_instance.cancel_batch_with_http_info(batch_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Batch>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->cancel_batch_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | The ID of the batch to cancel. |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## create_batch

> <Batch> create_batch(create_batch_request)

Creates and executes a batch from an uploaded file of requests

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::BatchApi.new
create_batch_request = OpenApiOpenAIClient::CreateBatchRequest.new({input_file_id: 'input_file_id_example', endpoint: '/v1/chat/completions', completion_window: '24h'}) # CreateBatchRequest | 

begin
  # Creates and executes a batch from an uploaded file of requests
  result = api_instance.create_batch(create_batch_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->create_batch: #{e}"
end
```

#### Using the create_batch_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Batch>, Integer, Hash)> create_batch_with_http_info(create_batch_request)

```ruby
begin
  # Creates and executes a batch from an uploaded file of requests
  data, status_code, headers = api_instance.create_batch_with_http_info(create_batch_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Batch>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->create_batch_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_batch_request** | [**CreateBatchRequest**](CreateBatchRequest.md) |  |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## list_batches

> <ListBatchesResponse> list_batches(opts)

List your organization's batches.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::BatchApi.new
opts = {
  after: 'after_example', # String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
  limit: 56 # Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
}

begin
  # List your organization's batches.
  result = api_instance.list_batches(opts)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->list_batches: #{e}"
end
```

#### Using the list_batches_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListBatchesResponse>, Integer, Hash)> list_batches_with_http_info(opts)

```ruby
begin
  # List your organization's batches.
  data, status_code, headers = api_instance.list_batches_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListBatchesResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->list_batches_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **after** | **String** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **limit** | **Integer** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional][default to 20] |

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_batch

> <Batch> retrieve_batch(batch_id)

Retrieves a batch.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::BatchApi.new
batch_id = 'batch_id_example' # String | The ID of the batch to retrieve.

begin
  # Retrieves a batch.
  result = api_instance.retrieve_batch(batch_id)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->retrieve_batch: #{e}"
end
```

#### Using the retrieve_batch_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Batch>, Integer, Hash)> retrieve_batch_with_http_info(batch_id)

```ruby
begin
  # Retrieves a batch.
  data, status_code, headers = api_instance.retrieve_batch_with_http_info(batch_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Batch>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling BatchApi->retrieve_batch_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | The ID of the batch to retrieve. |  |

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

