# OpenApiOpenAIClient::ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_moderation**](ModerationsApi.md#create_moderation) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).  |


## create_moderation

> <CreateModerationResponse> create_moderation(create_moderation_request)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::ModerationsApi.new
create_moderation_request = OpenApiOpenAIClient::CreateModerationRequest.new({input: nil}) # CreateModerationRequest | 

begin
  # Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
  result = api_instance.create_moderation(create_moderation_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModerationsApi->create_moderation: #{e}"
end
```

#### Using the create_moderation_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateModerationResponse>, Integer, Hash)> create_moderation_with_http_info(create_moderation_request)

```ruby
begin
  # Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
  data, status_code, headers = api_instance.create_moderation_with_http_info(create_moderation_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateModerationResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling ModerationsApi->create_moderation_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md) |  |  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

