# RealtimeApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateRealtimeSession**](RealtimeApi.md#CreateRealtimeSession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **CreateRealtimeSession**
> RealtimeSessionCreateResponse CreateRealtimeSession(realtime_session_create_request)

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Example
```R
library(openapi)

# Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
#
# prepare function argument(s)
var_realtime_session_create_request <- RealtimeSessionCreateRequest$new("gpt-4o-realtime-preview", c("text"), "instructions_example", "alloy", "pcm16", "pcm16", RealtimeSession_input_audio_transcription$new("model_example"), RealtimeSessionCreateRequest_turn_detection$new("type_example", 123, 123, 123, "create_response_example"), c(RealtimeResponseCreateParams_tools_inner$new("function", "name_example", "description_example", 123)), "tool_choice_example", 123, RealtimeResponseCreateParams_max_response_output_tokens$new()) # RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.

api_instance <- RealtimeApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateRealtimeSession(var_realtime_session_create_requestdata_file = "result.txt")
result <- api_instance$CreateRealtimeSession(var_realtime_session_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtime_session_create_request** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. | 

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Session created successfully. |  -  |

