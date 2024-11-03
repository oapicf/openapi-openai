# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateEmbedding**](EmbeddingsApi.md#CreateEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **CreateEmbedding**
> CreateEmbeddingResponse CreateEmbedding(create_embedding_request)

Creates an embedding vector representing the input text.

### Example
```R
library(openapi)

# Creates an embedding vector representing the input text.
#
# prepare function argument(s)
var_create_embedding_request <- CreateEmbeddingRequest$new(CreateEmbeddingRequest_input$new(), CreateEmbeddingRequest_model$new(), "float", 123, "user_example") # CreateEmbeddingRequest | 

api_instance <- EmbeddingsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateEmbedding(var_create_embedding_requestdata_file = "result.txt")
result <- api_instance$CreateEmbedding(var_create_embedding_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

