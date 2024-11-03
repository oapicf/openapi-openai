# OpenApiOpenAIClient::ChatApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_chat_completion**](ChatApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |


## create_chat_completion

> <CreateChatCompletionResponse> create_chat_completion(create_chat_completion_request)

Creates a model response for the given chat conversation.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ChatApi.new
create_chat_completion_request = OpenApiOpenAIClient::CreateChatCompletionRequest.new({messages: [OpenApiOpenAIClient::ChatCompletionRequestAssistantMessage.new({role: 'assistant'})], model: OpenApiOpenAIClient::CreateChatCompletionRequestModel.new}) # CreateChatCompletionRequest | 

begin
  # Creates a model response for the given chat conversation.
  result = api_instance.create_chat_completion(create_chat_completion_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ChatApi->create_chat_completion: #{e}"
end
```

#### Using the create_chat_completion_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateChatCompletionResponse>, Integer, Hash)> create_chat_completion_with_http_info(create_chat_completion_request)

```ruby
begin
  # Creates a model response for the given chat conversation.
  data, status_code, headers = api_instance.create_chat_completion_with_http_info(create_chat_completion_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateChatCompletionResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ChatApi->create_chat_completion_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  |  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

