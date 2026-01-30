# OpenApiOpenAIClient::ModelsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_model**](ModelsApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. |
| [**list_models**](ModelsApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**retrieve_model**](ModelsApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


## delete_model

> <DeleteModelResponse> delete_model(model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ModelsApi.new
model = 'ft:gpt-4o-mini:acemeco:suffix:abc123' # String | The model to delete

begin
  # Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
  result = api_instance.delete_model(model)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModelsApi->delete_model: #{e}"
end
```

#### Using the delete_model_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteModelResponse>, Integer, Hash)> delete_model_with_http_info(model)

```ruby
begin
  # Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
  data, status_code, headers = api_instance.delete_model_with_http_info(model)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteModelResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModelsApi->delete_model_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model** | **String** | The model to delete |  |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_models

> <ListModelsResponse> list_models

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ModelsApi.new

begin
  # Lists the currently available models, and provides basic information about each one such as the owner and availability.
  result = api_instance.list_models
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModelsApi->list_models: #{e}"
end
```

#### Using the list_models_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ListModelsResponse>, Integer, Hash)> list_models_with_http_info

```ruby
begin
  # Lists the currently available models, and provides basic information about each one such as the owner and availability.
  data, status_code, headers = api_instance.list_models_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ListModelsResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModelsApi->list_models_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve_model

> <Model> retrieve_model(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ModelsApi.new
model = 'gpt-4o-mini' # String | The ID of the model to use for this request

begin
  # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
  result = api_instance.retrieve_model(model)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModelsApi->retrieve_model: #{e}"
end
```

#### Using the retrieve_model_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Model>, Integer, Hash)> retrieve_model_with_http_info(model)

```ruby
begin
  # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
  data, status_code, headers = api_instance.retrieve_model_with_http_info(model)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Model>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModelsApi->retrieve_model_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model** | **String** | The ID of the model to use for this request |  |

### Return type

[**Model**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

