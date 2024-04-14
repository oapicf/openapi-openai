# OAIFilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](OAIFilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](OAIFilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](OAIFilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](OAIFilesApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**retrieveFile**](OAIFilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.


# **createFile**
```objc
-(NSURLSessionTask*) createFileWithFile: (NSURL*) file
    purpose: (NSString*) purpose
        completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler;
```

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The File object (not file name) to be uploaded. 
NSString* purpose = @"purpose_example"; // The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[apiInstance createFileWithFile:file
              purpose:purpose
          completionHandler: ^(OAIOpenAIFile* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFilesApi->createFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **NSURL*****NSURL***| The File object (not file name) to be uploaded.  | 
 **purpose** | **NSString***| The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | 

### Return type

[**OAIOpenAIFile***](OAIOpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteFile**
```objc
-(NSURLSessionTask*) deleteFileWithFileId: (NSString*) fileId
        completionHandler: (void (^)(OAIDeleteFileResponse* output, NSError* error)) handler;
```

Delete a file.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fileId = @"fileId_example"; // The ID of the file to use for this request.

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Delete a file.
[apiInstance deleteFileWithFileId:fileId
          completionHandler: ^(OAIDeleteFileResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFilesApi->deleteFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **NSString***| The ID of the file to use for this request. | 

### Return type

[**OAIDeleteFileResponse***](OAIDeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **downloadFile**
```objc
-(NSURLSessionTask*) downloadFileWithFileId: (NSString*) fileId
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```

Returns the contents of the specified file.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fileId = @"fileId_example"; // The ID of the file to use for this request.

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Returns the contents of the specified file.
[apiInstance downloadFileWithFileId:fileId
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFilesApi->downloadFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **NSString***| The ID of the file to use for this request. | 

### Return type

**NSString***

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFiles**
```objc
-(NSURLSessionTask*) listFilesWithPurpose: (NSString*) purpose
        completionHandler: (void (^)(OAIListFilesResponse* output, NSError* error)) handler;
```

Returns a list of files that belong to the user's organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* purpose = @"purpose_example"; // Only return files with the given purpose. (optional)

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Returns a list of files that belong to the user's organization.
[apiInstance listFilesWithPurpose:purpose
          completionHandler: ^(OAIListFilesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFilesApi->listFiles: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **NSString***| Only return files with the given purpose. | [optional] 

### Return type

[**OAIListFilesResponse***](OAIListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveFile**
```objc
-(NSURLSessionTask*) retrieveFileWithFileId: (NSString*) fileId
        completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler;
```

Returns information about a specific file.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* fileId = @"fileId_example"; // The ID of the file to use for this request.

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Returns information about a specific file.
[apiInstance retrieveFileWithFileId:fileId
          completionHandler: ^(OAIOpenAIFile* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIFilesApi->retrieveFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **NSString***| The ID of the file to use for this request. | 

### Return type

[**OAIOpenAIFile***](OAIOpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

