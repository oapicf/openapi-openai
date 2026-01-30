# OAIRealtimeApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRealtimeSession**](OAIRealtimeApi.md#createrealtimesession) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **createRealtimeSession**
```objc
-(NSURLSessionTask*) createRealtimeSessionWithRealtimeSessionCreateRequest: (OAIRealtimeSessionCreateRequest*) realtimeSessionCreateRequest
        completionHandler: (void (^)(OAIRealtimeSessionCreateResponse* output, NSError* error)) handler;
```

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAIRealtimeSessionCreateRequest* realtimeSessionCreateRequest = [[OAIRealtimeSessionCreateRequest alloc] init]; // Create an ephemeral API key with the given session configuration.

OAIRealtimeApi*apiInstance = [[OAIRealtimeApi alloc] init];

// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
[apiInstance createRealtimeSessionWithRealtimeSessionCreateRequest:realtimeSessionCreateRequest
          completionHandler: ^(OAIRealtimeSessionCreateResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRealtimeApi->createRealtimeSession: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtimeSessionCreateRequest** | [**OAIRealtimeSessionCreateRequest***](OAIRealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. | 

### Return type

[**OAIRealtimeSessionCreateResponse***](OAIRealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

