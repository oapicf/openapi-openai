# .EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)


### Example


```typescript
import { createConfiguration, EmbeddingsApi } from '';
import type { EmbeddingsApiCreateEmbeddingRequest } from '';

const configuration = createConfiguration();
const apiInstance = new EmbeddingsApi(configuration);

const request: EmbeddingsApiCreateEmbeddingRequest = {
  
  createEmbeddingRequest: {
    input: null,
    model: null,
    encodingFormat: "float",
    dimensions: 1,
    user: "user-1234",
  },
};

const data = await apiInstance.createEmbedding(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | **CreateEmbeddingRequest**|  |


### Return type

**CreateEmbeddingResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


