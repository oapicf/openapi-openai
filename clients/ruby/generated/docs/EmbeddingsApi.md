# OpenApiOpenAIClient::EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_embedding**](EmbeddingsApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |


## create_embedding

> <CreateEmbeddingResponse> create_embedding(create_embedding_request)

Creates an embedding vector representing the input text.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::EmbeddingsApi.new
create_embedding_request = OpenApiOpenAIClient::CreateEmbeddingRequest.new({input: nil, model: OpenApiOpenAIClient::CreateEmbeddingRequestModel.new}) # CreateEmbeddingRequest | 

begin
  # Creates an embedding vector representing the input text.
  result = api_instance.create_embedding(create_embedding_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling EmbeddingsApi->create_embedding: #{e}"
end
```

#### Using the create_embedding_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateEmbeddingResponse>, Integer, Hash)> create_embedding_with_http_info(create_embedding_request)

```ruby
begin
  # Creates an embedding vector representing the input text.
  data, status_code, headers = api_instance.create_embedding_with_http_info(create_embedding_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateEmbeddingResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling EmbeddingsApi->create_embedding_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  |  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

