# Org.OpenAPITools.Api.EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateEmbedding**](EmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |

<a id="createembedding"></a>
# **CreateEmbedding**
> CreateEmbeddingResponse CreateEmbedding (CreateEmbeddingRequest createEmbeddingRequest)

Creates an embedding vector representing the input text.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

