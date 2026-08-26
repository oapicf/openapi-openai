# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_embedding**](EmbeddingsApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **create_embedding**
> `create_embedding`(_api::`EmbeddingsApi`, `create_embedding_request`::`CreateEmbeddingRequest`; _mediaType=nothing) -> `CreateEmbeddingResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_embedding`(_api::`EmbeddingsApi`, response_stream::`Channel`, `create_embedding_request`::`CreateEmbeddingRequest`; _mediaType=nothing) -> `Channel`{ `CreateEmbeddingResponse` }, `OpenAPI.Clients.ApiResponse`

Creates an embedding vector representing the input text.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`EmbeddingsApi`** | API context | 
**`create_embedding_request`** | [**`CreateEmbeddingRequest`**](CreateEmbeddingRequest.md) |  |

### Return type

[**`CreateEmbeddingResponse`**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

