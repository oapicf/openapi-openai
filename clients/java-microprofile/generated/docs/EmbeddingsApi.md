# EmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmbedding**](EmbeddingsApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |



## createEmbedding

> CreateEmbeddingResponse createEmbedding(createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.EmbeddingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openai.com/v1");
        
        // Configure HTTP bearer authorization: ApiKeyAuth
        HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setBearerToken("BEARER TOKEN");

        EmbeddingsApi apiInstance = new EmbeddingsApi(defaultClient);
        CreateEmbeddingRequest createEmbeddingRequest = new CreateEmbeddingRequest(); // CreateEmbeddingRequest | 
        try {
            CreateEmbeddingResponse result = apiInstance.createEmbedding(createEmbeddingRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmbeddingsApi#createEmbedding");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | |

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

