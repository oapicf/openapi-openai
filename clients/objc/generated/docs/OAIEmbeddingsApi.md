# OAIEmbeddingsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedding**](OAIEmbeddingsApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **createEmbedding**
```objc
-(NSURLSessionTask*) createEmbeddingWithCreateEmbeddingRequest: (OAICreateEmbeddingRequest*) createEmbeddingRequest
        completionHandler: (void (^)(OAICreateEmbeddingResponse* output, NSError* error)) handler;
```

Creates an embedding vector representing the input text.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateEmbeddingRequest* createEmbeddingRequest = [[OAICreateEmbeddingRequest alloc] init]; // 

OAIEmbeddingsApi*apiInstance = [[OAIEmbeddingsApi alloc] init];

// Creates an embedding vector representing the input text.
[apiInstance createEmbeddingWithCreateEmbeddingRequest:createEmbeddingRequest
          completionHandler: ^(OAICreateEmbeddingResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEmbeddingsApi->createEmbedding: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**OAICreateEmbeddingRequest***](OAICreateEmbeddingRequest.md)|  | 

### Return type

[**OAICreateEmbeddingResponse***](OAICreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

