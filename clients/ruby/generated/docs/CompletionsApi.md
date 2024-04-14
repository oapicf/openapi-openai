# OpenApiOpenAIClient::CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_completion**](CompletionsApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |


## create_completion

> <CreateCompletionResponse> create_completion(create_completion_request)

Creates a completion for the provided prompt and parameters.

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::CompletionsApi.new
create_completion_request = OpenApiOpenAIClient::CreateCompletionRequest.new({model: OpenApiOpenAIClient::CreateCompletionRequestModel.new, prompt: nil}) # CreateCompletionRequest | 

begin
  # Creates a completion for the provided prompt and parameters.
  result = api_instance.create_completion(create_completion_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling CompletionsApi->create_completion: #{e}"
end
```

#### Using the create_completion_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateCompletionResponse>, Integer, Hash)> create_completion_with_http_info(create_completion_request)

```ruby
begin
  # Creates a completion for the provided prompt and parameters.
  data, status_code, headers = api_instance.create_completion_with_http_info(create_completion_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateCompletionResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling CompletionsApi->create_completion_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  |  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

