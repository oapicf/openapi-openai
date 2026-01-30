# OAIModelsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](OAIModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**listModels**](OAIModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveModel**](OAIModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **deleteModel**
```objc
-(NSURLSessionTask*) deleteModelWithModel: (NSString*) model
        completionHandler: (void (^)(OAIDeleteModelResponse* output, NSError* error)) handler;
```

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* model = ft:gpt-4o-mini:acemeco:suffix:abc123; // The model to delete

OAIModelsApi*apiInstance = [[OAIModelsApi alloc] init];

// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[apiInstance deleteModelWithModel:model
          completionHandler: ^(OAIDeleteModelResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIModelsApi->deleteModel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NSString***| The model to delete | 

### Return type

[**OAIDeleteModelResponse***](OAIDeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listModels**
```objc
-(NSURLSessionTask*) listModelsWithCompletionHandler: 
        (void (^)(OAIListModelsResponse* output, NSError* error)) handler;
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];



OAIModelsApi*apiInstance = [[OAIModelsApi alloc] init];

// Lists the currently available models, and provides basic information about each one such as the owner and availability.
[apiInstance listModelsWithCompletionHandler: 
          ^(OAIListModelsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIModelsApi->listModels: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIListModelsResponse***](OAIListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveModel**
```objc
-(NSURLSessionTask*) retrieveModelWithModel: (NSString*) model
        completionHandler: (void (^)(OAIModel* output, NSError* error)) handler;
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* model = gpt-4o-mini; // The ID of the model to use for this request

OAIModelsApi*apiInstance = [[OAIModelsApi alloc] init];

// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
[apiInstance retrieveModelWithModel:model
          completionHandler: ^(OAIModel* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIModelsApi->retrieveModel: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **NSString***| The ID of the model to use for this request | 

### Return type

[**OAIModel***](OAIModel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

