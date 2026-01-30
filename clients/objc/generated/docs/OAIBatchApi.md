# OAIBatchApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBatch**](OAIBatchApi.md#cancelbatch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**createBatch**](OAIBatchApi.md#createbatch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**listBatches**](OAIBatchApi.md#listbatches) | **GET** /batches | List your organization&#39;s batches.
[**retrieveBatch**](OAIBatchApi.md#retrievebatch) | **GET** /batches/{batch_id} | Retrieves a batch.


# **cancelBatch**
```objc
-(NSURLSessionTask*) cancelBatchWithBatchId: (NSString*) batchId
        completionHandler: (void (^)(OAIBatch* output, NSError* error)) handler;
```

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* batchId = @"batchId_example"; // The ID of the batch to cancel.

OAIBatchApi*apiInstance = [[OAIBatchApi alloc] init];

// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.
[apiInstance cancelBatchWithBatchId:batchId
          completionHandler: ^(OAIBatch* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBatchApi->cancelBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **NSString***| The ID of the batch to cancel. | 

### Return type

[**OAIBatch***](OAIBatch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createBatch**
```objc
-(NSURLSessionTask*) createBatchWithCreateBatchRequest: (OAICreateBatchRequest*) createBatchRequest
        completionHandler: (void (^)(OAIBatch* output, NSError* error)) handler;
```

Creates and executes a batch from an uploaded file of requests

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateBatchRequest* createBatchRequest = [[OAICreateBatchRequest alloc] init]; // 

OAIBatchApi*apiInstance = [[OAIBatchApi alloc] init];

// Creates and executes a batch from an uploaded file of requests
[apiInstance createBatchWithCreateBatchRequest:createBatchRequest
          completionHandler: ^(OAIBatch* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBatchApi->createBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBatchRequest** | [**OAICreateBatchRequest***](OAICreateBatchRequest.md)|  | 

### Return type

[**OAIBatch***](OAIBatch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listBatches**
```objc
-(NSURLSessionTask*) listBatchesWithAfter: (NSString*) after
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIListBatchesResponse* output, NSError* error)) handler;
```

List your organization's batches.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)

OAIBatchApi*apiInstance = [[OAIBatchApi alloc] init];

// List your organization's batches.
[apiInstance listBatchesWithAfter:after
              limit:limit
          completionHandler: ^(OAIListBatchesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBatchApi->listBatches: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]

### Return type

[**OAIListBatchesResponse***](OAIListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveBatch**
```objc
-(NSURLSessionTask*) retrieveBatchWithBatchId: (NSString*) batchId
        completionHandler: (void (^)(OAIBatch* output, NSError* error)) handler;
```

Retrieves a batch.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* batchId = @"batchId_example"; // The ID of the batch to retrieve.

OAIBatchApi*apiInstance = [[OAIBatchApi alloc] init];

// Retrieves a batch.
[apiInstance retrieveBatchWithBatchId:batchId
          completionHandler: ^(OAIBatch* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIBatchApi->retrieveBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **NSString***| The ID of the batch to retrieve. | 

### Return type

[**OAIBatch***](OAIBatch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

