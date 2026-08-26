# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](EmbeddingsApi.md#createEmbedding) | **Post** /embeddings | Creates an embedding vector representing the input text.


<a name="createEmbedding"></a>
# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = EmbeddingsApi()
val createEmbeddingRequest : CreateEmbeddingRequest =  // CreateEmbeddingRequest | 
try {
    val result : CreateEmbeddingResponse = apiInstance.createEmbedding(createEmbeddingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmbeddingsApi#createEmbedding")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmbeddingsApi#createEmbedding")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: APPLICATION_JSON
 - **Accept**: APPLICATION_JSON

