# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateModeration**](ModerationsApi.md#CreateModeration) | **POST** /moderations | Classifies if text is potentially harmful.


# **CreateModeration**
> CreateModerationResponse CreateModeration(create_moderation_request)

Classifies if text is potentially harmful.

### Example
```R
library(openapi)

# Classifies if text is potentially harmful.
#
# prepare function argument(s)
var_create_moderation_request <- CreateModerationRequest$new(CreateModerationRequest_input$new(), CreateModerationRequest_model$new()) # CreateModerationRequest | 

api_instance <- ModerationsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateModeration(var_create_moderation_requestdata_file = "result.txt")
result <- api_instance$CreateModeration(var_create_moderation_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

