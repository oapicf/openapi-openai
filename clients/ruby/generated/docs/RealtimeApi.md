# OpenApiOpenAIClient::RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_realtime_session**](RealtimeApi.md#create_realtime_session) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API.  |


## create_realtime_session

> <RealtimeSessionCreateResponse> create_realtime_session(realtime_session_create_request)

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Examples

```ruby
require 'time'
require 'openapi_openai'
# setup authorization
OpenApiOpenAIClient.configure do |config|
  # Configure Bearer authorization: ApiKeyAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenApiOpenAIClient::RealtimeApi.new
realtime_session_create_request = OpenApiOpenAIClient::RealtimeSessionCreateRequest.new({model: 'gpt-4o-realtime-preview'}) # RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.

begin
  # Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
  result = api_instance.create_realtime_session(realtime_session_create_request)
  p result
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling RealtimeApi->create_realtime_session: #{e}"
end
```

#### Using the create_realtime_session_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RealtimeSessionCreateResponse>, Integer, Hash)> create_realtime_session_with_http_info(realtime_session_create_request)

```ruby
begin
  # Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
  data, status_code, headers = api_instance.create_realtime_session_with_http_info(realtime_session_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RealtimeSessionCreateResponse>
rescue OpenApiOpenAIClient::ApiError => e
  puts "Error when calling RealtimeApi->create_realtime_session_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **realtime_session_create_request** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) | Create an ephemeral API key with the given session configuration. |  |

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

