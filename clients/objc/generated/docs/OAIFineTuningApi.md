# OAIFineTuningApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTuningJob**](OAIFineTuningApi.md#cancelfinetuningjob) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**createFineTuningJob**](OAIFineTuningApi.md#createfinetuningjob) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**listFineTuningEvents**](OAIFineTuningApi.md#listfinetuningevents) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**listFineTuningJobCheckpoints**](OAIFineTuningApi.md#listfinetuningjobcheckpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**listPaginatedFineTuningJobs**](OAIFineTuningApi.md#listpaginatedfinetuningjobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieveFineTuningJob**](OAIFineTuningApi.md#retrievefinetuningjob) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancelFineTuningJob**
```objc
-(NSURLSessionTask*) cancelFineTuningJobWithFineTuningJobId: (NSString*) fineTuningJobId
        completionHandler: (void (^)(OAIFineTuningJob* output, NSError* error)) handler;
```

Immediately cancel a fine-tune job. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tuning job to cancel. 

OAIFineTuningApi*apiInstance = [[OAIFineTuningApi alloc] init];

// Immediately cancel a fine-tune job. 
[apiInstance cancelFineTuningJobWithFineTuningJobId:fineTuningJobId
          completionHandler: ^(OAIFineTuningJob* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFineTuningApi->cancelFineTuningJob: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **NSString***| The ID of the fine-tuning job to cancel.  | 

### Return type

[**OAIFineTuningJob***](OAIFineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createFineTuningJob**
```objc
-(NSURLSessionTask*) createFineTuningJobWithCreateFineTuningJobRequest: (OAICreateFineTuningJobRequest*) createFineTuningJobRequest
        completionHandler: (void (^)(OAIFineTuningJob* output, NSError* error)) handler;
```

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateFineTuningJobRequest* createFineTuningJobRequest = [[OAICreateFineTuningJobRequest alloc] init]; // 

OAIFineTuningApi*apiInstance = [[OAIFineTuningApi alloc] init];

// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[apiInstance createFineTuningJobWithCreateFineTuningJobRequest:createFineTuningJobRequest
          completionHandler: ^(OAIFineTuningJob* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFineTuningApi->createFineTuningJob: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuningJobRequest** | [**OAICreateFineTuningJobRequest***](OAICreateFineTuningJobRequest.md)|  | 

### Return type

[**OAIFineTuningJob***](OAIFineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuningEvents**
```objc
-(NSURLSessionTask*) listFineTuningEventsWithFineTuningJobId: (NSString*) fineTuningJobId
    after: (NSString*) after
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIListFineTuningJobEventsResponse* output, NSError* error)) handler;
```

Get status updates for a fine-tuning job. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tuning job to get events for. 
NSString* after = @"after_example"; // Identifier for the last event from the previous pagination request. (optional)
NSNumber* limit = @20; // Number of events to retrieve. (optional) (default to @20)

OAIFineTuningApi*apiInstance = [[OAIFineTuningApi alloc] init];

// Get status updates for a fine-tuning job. 
[apiInstance listFineTuningEventsWithFineTuningJobId:fineTuningJobId
              after:after
              limit:limit
          completionHandler: ^(OAIListFineTuningJobEventsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFineTuningApi->listFineTuningEvents: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **NSString***| The ID of the fine-tuning job to get events for.  | 
 **after** | **NSString***| Identifier for the last event from the previous pagination request. | [optional] 
 **limit** | **NSNumber***| Number of events to retrieve. | [optional] [default to @20]

### Return type

[**OAIListFineTuningJobEventsResponse***](OAIListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFineTuningJobCheckpoints**
```objc
-(NSURLSessionTask*) listFineTuningJobCheckpointsWithFineTuningJobId: (NSString*) fineTuningJobId
    after: (NSString*) after
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIListFineTuningJobCheckpointsResponse* output, NSError* error)) handler;
```

List checkpoints for a fine-tuning job. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tuning job to get checkpoints for. 
NSString* after = @"after_example"; // Identifier for the last checkpoint ID from the previous pagination request. (optional)
NSNumber* limit = @10; // Number of checkpoints to retrieve. (optional) (default to @10)

OAIFineTuningApi*apiInstance = [[OAIFineTuningApi alloc] init];

// List checkpoints for a fine-tuning job. 
[apiInstance listFineTuningJobCheckpointsWithFineTuningJobId:fineTuningJobId
              after:after
              limit:limit
          completionHandler: ^(OAIListFineTuningJobCheckpointsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFineTuningApi->listFineTuningJobCheckpoints: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **NSString***| The ID of the fine-tuning job to get checkpoints for.  | 
 **after** | **NSString***| Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
 **limit** | **NSNumber***| Number of checkpoints to retrieve. | [optional] [default to @10]

### Return type

[**OAIListFineTuningJobCheckpointsResponse***](OAIListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listPaginatedFineTuningJobs**
```objc
-(NSURLSessionTask*) listPaginatedFineTuningJobsWithAfter: (NSString*) after
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIListPaginatedFineTuningJobsResponse* output, NSError* error)) handler;
```

List your organization's fine-tuning jobs 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* after = @"after_example"; // Identifier for the last job from the previous pagination request. (optional)
NSNumber* limit = @20; // Number of fine-tuning jobs to retrieve. (optional) (default to @20)

OAIFineTuningApi*apiInstance = [[OAIFineTuningApi alloc] init];

// List your organization's fine-tuning jobs 
[apiInstance listPaginatedFineTuningJobsWithAfter:after
              limit:limit
          completionHandler: ^(OAIListPaginatedFineTuningJobsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFineTuningApi->listPaginatedFineTuningJobs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **NSString***| Identifier for the last job from the previous pagination request. | [optional] 
 **limit** | **NSNumber***| Number of fine-tuning jobs to retrieve. | [optional] [default to @20]

### Return type

[**OAIListPaginatedFineTuningJobsResponse***](OAIListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFineTuningJob**
```objc
-(NSURLSessionTask*) retrieveFineTuningJobWithFineTuningJobId: (NSString*) fineTuningJobId
        completionHandler: (void (^)(OAIFineTuningJob* output, NSError* error)) handler;
```

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fineTuningJobId = ft-AF1WoRqd3aJAHsqc9NY7iL8F; // The ID of the fine-tuning job. 

OAIFineTuningApi*apiInstance = [[OAIFineTuningApi alloc] init];

// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[apiInstance retrieveFineTuningJobWithFineTuningJobId:fineTuningJobId
          completionHandler: ^(OAIFineTuningJob* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFineTuningApi->retrieveFineTuningJob: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuningJobId** | **NSString***| The ID of the fine-tuning job.  | 

### Return type

[**OAIFineTuningJob***](OAIFineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

