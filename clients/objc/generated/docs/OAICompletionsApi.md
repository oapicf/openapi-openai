# OAICompletionsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompletion**](OAICompletionsApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **createCompletion**
```objc
-(NSURLSessionTask*) createCompletionWithCreateCompletionRequest: (OAICreateCompletionRequest*) createCompletionRequest
        completionHandler: (void (^)(OAICreateCompletionResponse* output, NSError* error)) handler;
```

Creates a completion for the provided prompt and parameters.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateCompletionRequest* createCompletionRequest = [[OAICreateCompletionRequest alloc] init]; // 

OAICompletionsApi*apiInstance = [[OAICompletionsApi alloc] init];

// Creates a completion for the provided prompt and parameters.
[apiInstance createCompletionWithCreateCompletionRequest:createCompletionRequest
          completionHandler: ^(OAICreateCompletionResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICompletionsApi->createCompletion: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**OAICreateCompletionRequest***](OAICreateCompletionRequest.md)|  | 

### Return type

[**OAICreateCompletionResponse***](OAICreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

