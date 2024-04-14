# EmbeddingsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EmbeddingsAPI_createEmbedding**](EmbeddingsAPI.md#EmbeddingsAPI_createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **EmbeddingsAPI_createEmbedding**
```c
// Creates an embedding vector representing the input text.
//
create_embedding_response_t* EmbeddingsAPI_createEmbedding(apiClient_t *apiClient, create_embedding_request_t *create_embedding_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**create_embedding_request** | **[create_embedding_request_t](create_embedding_request.md) \*** |  | 

### Return type

[create_embedding_response_t](create_embedding_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

