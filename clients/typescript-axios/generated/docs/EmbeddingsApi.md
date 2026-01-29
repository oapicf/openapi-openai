# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**createEmbedding**](#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.|

# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)


### Example

```typescript
import {
    EmbeddingsApi,
    Configuration,
    CreateEmbeddingRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new EmbeddingsApi(configuration);

let createEmbeddingRequest: CreateEmbeddingRequest; //

const { status, data } = await apiInstance.createEmbedding(
    createEmbeddingRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createEmbeddingRequest** | **CreateEmbeddingRequest**|  | |


### Return type

**CreateEmbeddingResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

