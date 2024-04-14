# ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateChatCompletion**](ChatApi.md#CreateChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


# **CreateChatCompletion**
> CreateChatCompletionResponse CreateChatCompletion(create_chat_completion_request)

Creates a model response for the given chat conversation.

### Example
```R
library(openapi)

# Creates a model response for the given chat conversation.
#
# prepare function argument(s)
var_create_chat_completion_request <- CreateChatCompletionRequest$new(c(ChatCompletionRequestMessage$new("content_example", "function", "name_example", "tool_call_id_example", c(ChatCompletionMessageToolCall$new("id_example", "function", ChatCompletionMessageToolCall_function$new("name_example", "arguments_example"))), ChatCompletionRequestAssistantMessage_function_call$new("arguments_example", "name_example"))), CreateChatCompletionRequest_model$new(), 123, c(key = 123), "logprobs_example", 123, 123, 123, 123, CreateChatCompletionRequest_response_format$new("text"), 123, CreateChatCompletionRequest_stop$new(), "stream_example", 123, 123, c(ChatCompletionTool$new("function", FunctionObject$new("name_example", "description_example", c(key = TODO)))), ChatCompletionToolChoiceOption$new("function", ChatCompletionNamedToolChoice_function$new("name_example")), "user_example", CreateChatCompletionRequest_function_call$new("name_example"), c(ChatCompletionFunctions$new("name_example", "description_example", c(key = TODO)))) # CreateChatCompletionRequest | 

api_instance <- ChatApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateChatCompletion(var_create_chat_completion_requestdata_file = "result.txt")
result <- api_instance$CreateChatCompletion(var_create_chat_completion_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

