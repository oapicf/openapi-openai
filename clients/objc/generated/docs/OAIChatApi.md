# OAIChatApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChatCompletion**](OAIChatApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


# **createChatCompletion**
```objc
-(NSURLSessionTask*) createChatCompletionWithCreateChatCompletionRequest: (OAICreateChatCompletionRequest*) createChatCompletionRequest
        completionHandler: (void (^)(OAICreateChatCompletionResponse* output, NSError* error)) handler;
```

Creates a model response for the given chat conversation.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateChatCompletionRequest* createChatCompletionRequest = [[OAICreateChatCompletionRequest alloc] init]; // 

OAIChatApi*apiInstance = [[OAIChatApi alloc] init];

// Creates a model response for the given chat conversation.
[apiInstance createChatCompletionWithCreateChatCompletionRequest:createChatCompletionRequest
          completionHandler: ^(OAICreateChatCompletionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIChatApi->createChatCompletion: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createChatCompletionRequest** | [**OAICreateChatCompletionRequest***](OAICreateChatCompletionRequest.md)|  | 

### Return type

[**OAICreateChatCompletionResponse***](OAICreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

