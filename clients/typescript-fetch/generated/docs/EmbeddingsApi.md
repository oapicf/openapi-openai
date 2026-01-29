# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmbedding**](EmbeddingsApi.md#createembeddingoperation) | **POST** /embeddings | Creates an embedding vector representing the input text. |



## createEmbedding

> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example

```ts
import {
  Configuration,
  EmbeddingsApi,
} from '';
import type { CreateEmbeddingOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new EmbeddingsApi(config);

  const body = {
    // CreateEmbeddingRequest
    createEmbeddingRequest: ...,
  } satisfies CreateEmbeddingOperationRequest;

  try {
    const data = await api.createEmbedding(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmbeddingRequest** | [CreateEmbeddingRequest](CreateEmbeddingRequest.md) |  | |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

