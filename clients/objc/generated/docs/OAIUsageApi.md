# OAIUsageApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usageAudioSpeeches**](OAIUsageApi.md#usageaudiospeeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usageAudioTranscriptions**](OAIUsageApi.md#usageaudiotranscriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usageCodeInterpreterSessions**](OAIUsageApi.md#usagecodeinterpretersessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usageCompletions**](OAIUsageApi.md#usagecompletions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usageCosts**](OAIUsageApi.md#usagecosts) | **GET** /organization/costs | Get costs details for the organization.
[**usageEmbeddings**](OAIUsageApi.md#usageembeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usageImages**](OAIUsageApi.md#usageimages) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usageModerations**](OAIUsageApi.md#usagemoderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usageVectorStores**](OAIUsageApi.md#usagevectorstores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **usageAudioSpeeches**
```objc
-(NSURLSessionTask*) usageAudioSpeechesWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    userIds: (NSArray<NSString*>*) userIds
    apiKeyIds: (NSArray<NSString*>*) apiKeyIds
    models: (NSArray<NSString*>*) models
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get audio speeches usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* userIds = @[@"userIds_example"]; // Return only usage for these users. (optional)
NSArray<NSString*>* apiKeyIds = @[@"apiKeyIds_example"]; // Return only usage for these API keys. (optional)
NSArray<NSString*>* models = @[@"models_example"]; // Return only usage for these models. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get audio speeches usage details for the organization.
[apiInstance usageAudioSpeechesWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              userIds:userIds
              apiKeyIds:apiKeyIds
              models:models
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageAudioSpeeches: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these API keys. | [optional] 
 **models** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageAudioTranscriptions**
```objc
-(NSURLSessionTask*) usageAudioTranscriptionsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    userIds: (NSArray<NSString*>*) userIds
    apiKeyIds: (NSArray<NSString*>*) apiKeyIds
    models: (NSArray<NSString*>*) models
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get audio transcriptions usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* userIds = @[@"userIds_example"]; // Return only usage for these users. (optional)
NSArray<NSString*>* apiKeyIds = @[@"apiKeyIds_example"]; // Return only usage for these API keys. (optional)
NSArray<NSString*>* models = @[@"models_example"]; // Return only usage for these models. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get audio transcriptions usage details for the organization.
[apiInstance usageAudioTranscriptionsWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              userIds:userIds
              apiKeyIds:apiKeyIds
              models:models
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageAudioTranscriptions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these API keys. | [optional] 
 **models** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCodeInterpreterSessions**
```objc
-(NSURLSessionTask*) usageCodeInterpreterSessionsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get code interpreter sessions usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get code interpreter sessions usage details for the organization.
[apiInstance usageCodeInterpreterSessionsWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageCodeInterpreterSessions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCompletions**
```objc
-(NSURLSessionTask*) usageCompletionsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    userIds: (NSArray<NSString*>*) userIds
    apiKeyIds: (NSArray<NSString*>*) apiKeyIds
    models: (NSArray<NSString*>*) models
    batch: (NSNumber*) batch
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get completions usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* userIds = @[@"userIds_example"]; // Return only usage for these users. (optional)
NSArray<NSString*>* apiKeyIds = @[@"apiKeyIds_example"]; // Return only usage for these API keys. (optional)
NSArray<NSString*>* models = @[@"models_example"]; // Return only usage for these models. (optional)
NSNumber* batch = @56; // If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get completions usage details for the organization.
[apiInstance usageCompletionsWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              userIds:userIds
              apiKeyIds:apiKeyIds
              models:models
              batch:batch
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageCompletions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these API keys. | [optional] 
 **models** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these models. | [optional] 
 **batch** | **NSNumber***| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageCosts**
```objc
-(NSURLSessionTask*) usageCostsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get costs details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only costs for these projects. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
NSNumber* limit = @7; // A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional) (default to @7)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get costs details for the organization.
[apiInstance usageCostsWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageCosts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only costs for these projects. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
 **limit** | **NSNumber***| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to @7]
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageEmbeddings**
```objc
-(NSURLSessionTask*) usageEmbeddingsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    userIds: (NSArray<NSString*>*) userIds
    apiKeyIds: (NSArray<NSString*>*) apiKeyIds
    models: (NSArray<NSString*>*) models
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get embeddings usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* userIds = @[@"userIds_example"]; // Return only usage for these users. (optional)
NSArray<NSString*>* apiKeyIds = @[@"apiKeyIds_example"]; // Return only usage for these API keys. (optional)
NSArray<NSString*>* models = @[@"models_example"]; // Return only usage for these models. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get embeddings usage details for the organization.
[apiInstance usageEmbeddingsWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              userIds:userIds
              apiKeyIds:apiKeyIds
              models:models
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageEmbeddings: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these API keys. | [optional] 
 **models** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageImages**
```objc
-(NSURLSessionTask*) usageImagesWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    sources: (NSArray<NSString*>*) sources
    sizes: (NSArray<NSString*>*) sizes
    projectIds: (NSArray<NSString*>*) projectIds
    userIds: (NSArray<NSString*>*) userIds
    apiKeyIds: (NSArray<NSString*>*) apiKeyIds
    models: (NSArray<NSString*>*) models
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get images usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* sources = @[@"sources_example"]; // Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
NSArray<NSString*>* sizes = @[@"sizes_example"]; // Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* userIds = @[@"userIds_example"]; // Return only usage for these users. (optional)
NSArray<NSString*>* apiKeyIds = @[@"apiKeyIds_example"]; // Return only usage for these API keys. (optional)
NSArray<NSString*>* models = @[@"models_example"]; // Return only usage for these models. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get images usage details for the organization.
[apiInstance usageImagesWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              sources:sources
              sizes:sizes
              projectIds:projectIds
              userIds:userIds
              apiKeyIds:apiKeyIds
              models:models
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageImages: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **sources** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
 **sizes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these API keys. | [optional] 
 **models** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageModerations**
```objc
-(NSURLSessionTask*) usageModerationsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    userIds: (NSArray<NSString*>*) userIds
    apiKeyIds: (NSArray<NSString*>*) apiKeyIds
    models: (NSArray<NSString*>*) models
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get moderations usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* userIds = @[@"userIds_example"]; // Return only usage for these users. (optional)
NSArray<NSString*>* apiKeyIds = @[@"apiKeyIds_example"]; // Return only usage for these API keys. (optional)
NSArray<NSString*>* models = @[@"models_example"]; // Return only usage for these models. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get moderations usage details for the organization.
[apiInstance usageModerationsWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              userIds:userIds
              apiKeyIds:apiKeyIds
              models:models
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageModerations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **userIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these users. | [optional] 
 **apiKeyIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these API keys. | [optional] 
 **models** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these models. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usageVectorStores**
```objc
-(NSURLSessionTask*) usageVectorStoresWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
        completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler;
```

Get vector stores usage details for the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* startTime = @56; // Start time (Unix seconds) of the query time range, inclusive.
NSNumber* endTime = @56; // End time (Unix seconds) of the query time range, exclusive. (optional)
NSString* bucketWidth = @"1d"; // Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional) (default to @"1d")
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only usage for these projects. (optional)
NSArray<NSString*>* groupBy = @[@"groupBy_example"]; // Group the usage data by the specified fields. Support fields include `project_id`. (optional)
NSNumber* limit = @56; // Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
NSString* page = @"page_example"; // A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)

OAIUsageApi*apiInstance = [[OAIUsageApi alloc] init];

// Get vector stores usage details for the organization.
[apiInstance usageVectorStoresWithStartTime:startTime
              endTime:endTime
              bucketWidth:bucketWidth
              projectIds:projectIds
              groupBy:groupBy
              limit:limit
              page:page
          completionHandler: ^(OAIUsageResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsageApi->usageVectorStores: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | **NSNumber***| Start time (Unix seconds) of the query time range, inclusive. | 
 **endTime** | **NSNumber***| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucketWidth** | **NSString***| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to @&quot;1d&quot;]
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only usage for these projects. | [optional] 
 **groupBy** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **NSNumber***| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **NSString***| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**OAIUsageResponse***](OAIUsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

