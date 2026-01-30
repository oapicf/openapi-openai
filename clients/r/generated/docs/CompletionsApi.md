# CompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCompletion**](CompletionsApi.md#CreateCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **CreateCompletion**
> CreateCompletionResponse CreateCompletion(create_completion_request)

Creates a completion for the provided prompt and parameters.

### Example
```R
library(openapi)

# Creates a completion for the provided prompt and parameters.
#
# prepare function argument(s)
var_create_completion_request <- CreateCompletionRequest$new(CreateCompletionRequest_model$new(), CreateCompletionRequest_prompt$new(), 123, "echo_example", 123, c(key = 123), 123, 123, 123, 123, 123, CreateCompletionRequest_stop$new(), "stream_example", ChatCompletionStreamOptions$new("include_usage_example"), "suffix_example", 123, 123, "user_example") # CreateCompletionRequest | 

api_instance <- CompletionsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateCompletion(var_create_completion_requestdata_file = "result.txt")
result <- api_instance$CreateCompletion(var_create_completion_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

