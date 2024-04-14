# EmbeddingsController

All URIs are relative to `"/v1"`

The controller class is defined in **[EmbeddingsController.java](../../src/main/java/org/openapitools/controller/EmbeddingsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.

<a id="createEmbedding"></a>
# **createEmbedding**
```java
Mono<CreateEmbeddingResponse> EmbeddingsController.createEmbedding(createEmbeddingRequest)
```

Creates an embedding vector representing the input text.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**createEmbeddingRequest** | [**CreateEmbeddingRequest**](../../docs/models/CreateEmbeddingRequest.md) |  |

### Return type
[**CreateEmbeddingResponse**](../../docs/models/CreateEmbeddingResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

