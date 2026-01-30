# OAIFilesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFile**](OAIFilesApi.md#createfile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**deleteFile**](OAIFilesApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file.
[**downloadFile**](OAIFilesApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**listFiles**](OAIFilesApi.md#listfiles) | **GET** /files | Returns a list of files.
[**retrieveFile**](OAIFilesApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file.


# **createFile**
```objc
-(NSURLSessionTask*) createFileWithFile: (NSURL*) file
    purpose: (NSString*) purpose
        completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler;
```

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The File object (not file name) to be uploaded. 
NSString* purpose = @"purpose_example"; // The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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
 **purpose** | **NSString***| The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | 

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
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
        completionHandler: (void (^)(OAIListFilesResponse* output, NSError* error)) handler;
```

Returns a list of files.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* purpose = @"purpose_example"; // Only return files with the given purpose. (optional)
NSNumber* limit = @10000; // A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional) (default to @10000)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

OAIFilesApi*apiInstance = [[OAIFilesApi alloc] init];

// Returns a list of files.
[apiInstance listFilesWithPurpose:purpose
              limit:limit
              order:order
              after:after
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
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional] [default to @10000]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

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

