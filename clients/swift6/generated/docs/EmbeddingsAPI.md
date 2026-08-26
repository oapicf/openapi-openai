# EmbeddingsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](EmbeddingsAPI.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **createEmbedding**
```swift
    open class func createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, completion: @escaping (_ data: CreateEmbeddingResponse?, _ error: Error?) -> Void)
```

Creates an embedding vector representing the input text.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let createEmbeddingRequest = CreateEmbeddingRequest(input: CreateEmbeddingRequest_input(), model: CreateEmbeddingRequest_model(), encodingFormat: "encodingFormat_example", dimensions: 123, user: "user_example") // CreateEmbeddingRequest | 

// Creates an embedding vector representing the input text.
EmbeddingsAPI.createEmbedding(createEmbeddingRequest: createEmbeddingRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

