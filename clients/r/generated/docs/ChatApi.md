# ChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateChatCompletion**](ChatApi.md#CreateChatCompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 


# **CreateChatCompletion**
> CreateChatCompletionResponse CreateChatCompletion(create_chat_completion_request)

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

### Example
```R
library(openapi)

# Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
#
# prepare function argument(s)
var_create_chat_completion_request <- CreateChatCompletionRequest$new(c(ChatCompletionRequestMessage$new("content_example", "function", "name_example", "tool_call_id_example", "refusal_example", ChatCompletionRequestAssistantMessage_audio$new("id_example"), c(ChatCompletionMessageToolCall$new("id_example", "function", ChatCompletionMessageToolCall_function$new("name_example", "arguments_example"))), ChatCompletionRequestAssistantMessage_function_call$new("arguments_example", "name_example"))), CreateChatCompletionRequest_model$new(), "store_example", "low", c(key = "inner_example"), 123, c(key = 123), "logprobs_example", 123, 123, 123, 123, c("text"), PredictionContent$new("content", PredictionContent_content$new()), CreateChatCompletionRequest_audio$new("alloy", "wav"), 123, CreateChatCompletionRequest_response_format$new("text", ResponseFormatJsonSchema_json_schema$new("name_example", "description_example", c(key = TODO), "strict_example")), 123, "auto", CreateChatCompletionRequest_stop$new(), "stream_example", ChatCompletionStreamOptions$new("include_usage_example"), 123, 123, c(ChatCompletionTool$new("function", FunctionObject$new("name_example", "description_example", c(key = TODO), "strict_example"))), ChatCompletionToolChoiceOption$new("function", AssistantsNamedToolChoice_function$new("name_example")), "parallel_tool_calls_example", "user_example", CreateChatCompletionRequest_function_call$new("name_example"), c(ChatCompletionFunctions$new("name_example", "description_example", c(key = TODO)))) # CreateChatCompletionRequest | 

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

