# OAIModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](OAIModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful.


# **createModeration**
```objc
-(NSURLSessionTask*) createModerationWithCreateModerationRequest: (OAICreateModerationRequest*) createModerationRequest
        completionHandler: (void (^)(OAICreateModerationResponse* output, NSError* error)) handler;
```

Classifies if text is potentially harmful.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateModerationRequest* createModerationRequest = [[OAICreateModerationRequest alloc] init]; // 

OAIModerationsApi*apiInstance = [[OAIModerationsApi alloc] init];

// Classifies if text is potentially harmful.
[apiInstance createModerationWithCreateModerationRequest:createModerationRequest
          completionHandler: ^(OAICreateModerationResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIModerationsApi->createModeration: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**OAICreateModerationRequest***](OAICreateModerationRequest.md)|  | 

### Return type

[**OAICreateModerationResponse***](OAICreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

