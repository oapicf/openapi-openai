# OAIUploadsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUploadPart**](OAIUploadsApi.md#adduploadpart) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[**cancelUpload**](OAIUploadsApi.md#cancelupload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[**completeUpload**](OAIUploadsApi.md#completeupload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[**createUpload**](OAIUploadsApi.md#createupload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 


# **addUploadPart**
```objc
-(NSURLSessionTask*) addUploadPartWithUploadId: (NSString*) uploadId
    data: (NSURL*) data
        completionHandler: (void (^)(OAIUploadPart* output, NSError* error)) handler;
```

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* uploadId = upload_abc123; // The ID of the Upload. 
NSURL* data = [NSURL fileURLWithPath:@"/path/to/file"]; // The chunk of bytes for this Part. 

OAIUploadsApi*apiInstance = [[OAIUploadsApi alloc] init];

// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[apiInstance addUploadPartWithUploadId:uploadId
              data:data
          completionHandler: ^(OAIUploadPart* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUploadsApi->addUploadPart: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **NSString***| The ID of the Upload.  | 
 **data** | **NSURL*****NSURL***| The chunk of bytes for this Part.  | 

### Return type

[**OAIUploadPart***](OAIUploadPart.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancelUpload**
```objc
-(NSURLSessionTask*) cancelUploadWithUploadId: (NSString*) uploadId
        completionHandler: (void (^)(OAIUpload* output, NSError* error)) handler;
```

Cancels the Upload. No Parts may be added after an Upload is cancelled. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* uploadId = upload_abc123; // The ID of the Upload. 

OAIUploadsApi*apiInstance = [[OAIUploadsApi alloc] init];

// Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[apiInstance cancelUploadWithUploadId:uploadId
          completionHandler: ^(OAIUpload* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUploadsApi->cancelUpload: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **NSString***| The ID of the Upload.  | 

### Return type

[**OAIUpload***](OAIUpload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **completeUpload**
```objc
-(NSURLSessionTask*) completeUploadWithUploadId: (NSString*) uploadId
    completeUploadRequest: (OAICompleteUploadRequest*) completeUploadRequest
        completionHandler: (void (^)(OAIUpload* output, NSError* error)) handler;
```

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* uploadId = upload_abc123; // The ID of the Upload. 
OAICompleteUploadRequest* completeUploadRequest = [[OAICompleteUploadRequest alloc] init]; // 

OAIUploadsApi*apiInstance = [[OAIUploadsApi alloc] init];

// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[apiInstance completeUploadWithUploadId:uploadId
              completeUploadRequest:completeUploadRequest
          completionHandler: ^(OAIUpload* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUploadsApi->completeUpload: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadId** | **NSString***| The ID of the Upload.  | 
 **completeUploadRequest** | [**OAICompleteUploadRequest***](OAICompleteUploadRequest.md)|  | 

### Return type

[**OAIUpload***](OAIUpload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createUpload**
```objc
-(NSURLSessionTask*) createUploadWithCreateUploadRequest: (OAICreateUploadRequest*) createUploadRequest
        completionHandler: (void (^)(OAIUpload* output, NSError* error)) handler;
```

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateUploadRequest* createUploadRequest = [[OAICreateUploadRequest alloc] init]; // 

OAIUploadsApi*apiInstance = [[OAIUploadsApi alloc] init];

// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
[apiInstance createUploadWithCreateUploadRequest:createUploadRequest
          completionHandler: ^(OAIUpload* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUploadsApi->createUpload: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUploadRequest** | [**OAICreateUploadRequest***](OAICreateUploadRequest.md)|  | 

### Return type

[**OAIUpload***](OAIUpload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

