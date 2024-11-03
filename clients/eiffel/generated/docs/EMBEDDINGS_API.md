# EMBEDDINGS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_embedding**](EMBEDDINGS_API.md#create_embedding) | **Post** /embeddings | Creates an embedding vector representing the input text.


# **create_embedding**
> create_embedding (create_embedding_request: CREATE_EMBEDDING_REQUEST ): detachable CREATE_EMBEDDING_RESPONSE


Creates an embedding vector representing the input text.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CREATE_EMBEDDING_REQUEST**](CREATE_EMBEDDING_REQUEST.md)|  | 

### Return type

[**CREATE_EMBEDDING_RESPONSE**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

