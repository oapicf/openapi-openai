# embeddings_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**createEmbedding**](embeddings_api.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **createEmbedding**
> models::CreateEmbeddingResponse createEmbedding(ctx, create_embedding_request)
Creates an embedding vector representing the input text.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**models::CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

