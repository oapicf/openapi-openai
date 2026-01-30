# OAIVectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVectorStoreFileBatch**](OAIVectorStoresApi.md#cancelvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**createVectorStore**](OAIVectorStoresApi.md#createvectorstore) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreFile**](OAIVectorStoresApi.md#createvectorstorefile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileBatch**](OAIVectorStoresApi.md#createvectorstorefilebatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**deleteVectorStore**](OAIVectorStoresApi.md#deletevectorstore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreFile**](OAIVectorStoresApi.md#deletevectorstorefile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**getVectorStore**](OAIVectorStoresApi.md#getvectorstore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreFile**](OAIVectorStoresApi.md#getvectorstorefile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileBatch**](OAIVectorStoresApi.md#getvectorstorefilebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**listFilesInVectorStoreBatch**](OAIVectorStoresApi.md#listfilesinvectorstorebatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listVectorStoreFiles**](OAIVectorStoresApi.md#listvectorstorefiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStores**](OAIVectorStoresApi.md#listvectorstores) | **GET** /vector_stores | Returns a list of vector stores.
[**modifyVectorStore**](OAIVectorStoresApi.md#modifyvectorstore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


# **cancelVectorStoreFileBatch**
```objc
-(NSURLSessionTask*) cancelVectorStoreFileBatchWithVectorStoreId: (NSString*) vectorStoreId
    batchId: (NSString*) batchId
        completionHandler: (void (^)(OAIVectorStoreFileBatchObject* output, NSError* error)) handler;
```

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store that the file batch belongs to.
NSString* batchId = @"batchId_example"; // The ID of the file batch to cancel.

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[apiInstance cancelVectorStoreFileBatchWithVectorStoreId:vectorStoreId
              batchId:batchId
          completionHandler: ^(OAIVectorStoreFileBatchObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->cancelVectorStoreFileBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store that the file batch belongs to. | 
 **batchId** | **NSString***| The ID of the file batch to cancel. | 

### Return type

[**OAIVectorStoreFileBatchObject***](OAIVectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStore**
```objc
-(NSURLSessionTask*) createVectorStoreWithCreateVectorStoreRequest: (OAICreateVectorStoreRequest*) createVectorStoreRequest
        completionHandler: (void (^)(OAIVectorStoreObject* output, NSError* error)) handler;
```

Create a vector store.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAICreateVectorStoreRequest* createVectorStoreRequest = [[OAICreateVectorStoreRequest alloc] init]; // 

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Create a vector store.
[apiInstance createVectorStoreWithCreateVectorStoreRequest:createVectorStoreRequest
          completionHandler: ^(OAIVectorStoreObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->createVectorStore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | [**OAICreateVectorStoreRequest***](OAICreateVectorStoreRequest.md)|  | 

### Return type

[**OAIVectorStoreObject***](OAIVectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFile**
```objc
-(NSURLSessionTask*) createVectorStoreFileWithVectorStoreId: (NSString*) vectorStoreId
    createVectorStoreFileRequest: (OAICreateVectorStoreFileRequest*) createVectorStoreFileRequest
        completionHandler: (void (^)(OAIVectorStoreFileObject* output, NSError* error)) handler;
```

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = vs_abc123; // The ID of the vector store for which to create a File. 
OAICreateVectorStoreFileRequest* createVectorStoreFileRequest = [[OAICreateVectorStoreFileRequest alloc] init]; // 

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[apiInstance createVectorStoreFileWithVectorStoreId:vectorStoreId
              createVectorStoreFileRequest:createVectorStoreFileRequest
          completionHandler: ^(OAIVectorStoreFileObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->createVectorStoreFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store for which to create a File.  | 
 **createVectorStoreFileRequest** | [**OAICreateVectorStoreFileRequest***](OAICreateVectorStoreFileRequest.md)|  | 

### Return type

[**OAIVectorStoreFileObject***](OAIVectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createVectorStoreFileBatch**
```objc
-(NSURLSessionTask*) createVectorStoreFileBatchWithVectorStoreId: (NSString*) vectorStoreId
    createVectorStoreFileBatchRequest: (OAICreateVectorStoreFileBatchRequest*) createVectorStoreFileBatchRequest
        completionHandler: (void (^)(OAIVectorStoreFileBatchObject* output, NSError* error)) handler;
```

Create a vector store file batch.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = vs_abc123; // The ID of the vector store for which to create a File Batch. 
OAICreateVectorStoreFileBatchRequest* createVectorStoreFileBatchRequest = [[OAICreateVectorStoreFileBatchRequest alloc] init]; // 

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Create a vector store file batch.
[apiInstance createVectorStoreFileBatchWithVectorStoreId:vectorStoreId
              createVectorStoreFileBatchRequest:createVectorStoreFileBatchRequest
          completionHandler: ^(OAIVectorStoreFileBatchObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->createVectorStoreFileBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store for which to create a File Batch.  | 
 **createVectorStoreFileBatchRequest** | [**OAICreateVectorStoreFileBatchRequest***](OAICreateVectorStoreFileBatchRequest.md)|  | 

### Return type

[**OAIVectorStoreFileBatchObject***](OAIVectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStore**
```objc
-(NSURLSessionTask*) deleteVectorStoreWithVectorStoreId: (NSString*) vectorStoreId
        completionHandler: (void (^)(OAIDeleteVectorStoreResponse* output, NSError* error)) handler;
```

Delete a vector store.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store to delete.

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Delete a vector store.
[apiInstance deleteVectorStoreWithVectorStoreId:vectorStoreId
          completionHandler: ^(OAIDeleteVectorStoreResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->deleteVectorStore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store to delete. | 

### Return type

[**OAIDeleteVectorStoreResponse***](OAIDeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteVectorStoreFile**
```objc
-(NSURLSessionTask*) deleteVectorStoreFileWithVectorStoreId: (NSString*) vectorStoreId
    fileId: (NSString*) fileId
        completionHandler: (void (^)(OAIDeleteVectorStoreFileResponse* output, NSError* error)) handler;
```

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store that the file belongs to.
NSString* fileId = @"fileId_example"; // The ID of the file to delete.

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[apiInstance deleteVectorStoreFileWithVectorStoreId:vectorStoreId
              fileId:fileId
          completionHandler: ^(OAIDeleteVectorStoreFileResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->deleteVectorStoreFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store that the file belongs to. | 
 **fileId** | **NSString***| The ID of the file to delete. | 

### Return type

[**OAIDeleteVectorStoreFileResponse***](OAIDeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStore**
```objc
-(NSURLSessionTask*) getVectorStoreWithVectorStoreId: (NSString*) vectorStoreId
        completionHandler: (void (^)(OAIVectorStoreObject* output, NSError* error)) handler;
```

Retrieves a vector store.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store to retrieve.

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Retrieves a vector store.
[apiInstance getVectorStoreWithVectorStoreId:vectorStoreId
          completionHandler: ^(OAIVectorStoreObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->getVectorStore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store to retrieve. | 

### Return type

[**OAIVectorStoreObject***](OAIVectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFile**
```objc
-(NSURLSessionTask*) getVectorStoreFileWithVectorStoreId: (NSString*) vectorStoreId
    fileId: (NSString*) fileId
        completionHandler: (void (^)(OAIVectorStoreFileObject* output, NSError* error)) handler;
```

Retrieves a vector store file.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = vs_abc123; // The ID of the vector store that the file belongs to.
NSString* fileId = file-abc123; // The ID of the file being retrieved.

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Retrieves a vector store file.
[apiInstance getVectorStoreFileWithVectorStoreId:vectorStoreId
              fileId:fileId
          completionHandler: ^(OAIVectorStoreFileObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->getVectorStoreFile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store that the file belongs to. | 
 **fileId** | **NSString***| The ID of the file being retrieved. | 

### Return type

[**OAIVectorStoreFileObject***](OAIVectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getVectorStoreFileBatch**
```objc
-(NSURLSessionTask*) getVectorStoreFileBatchWithVectorStoreId: (NSString*) vectorStoreId
    batchId: (NSString*) batchId
        completionHandler: (void (^)(OAIVectorStoreFileBatchObject* output, NSError* error)) handler;
```

Retrieves a vector store file batch.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = vs_abc123; // The ID of the vector store that the file batch belongs to.
NSString* batchId = vsfb_abc123; // The ID of the file batch being retrieved.

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Retrieves a vector store file batch.
[apiInstance getVectorStoreFileBatchWithVectorStoreId:vectorStoreId
              batchId:batchId
          completionHandler: ^(OAIVectorStoreFileBatchObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->getVectorStoreFileBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store that the file batch belongs to. | 
 **batchId** | **NSString***| The ID of the file batch being retrieved. | 

### Return type

[**OAIVectorStoreFileBatchObject***](OAIVectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listFilesInVectorStoreBatch**
```objc
-(NSURLSessionTask*) listFilesInVectorStoreBatchWithVectorStoreId: (NSString*) vectorStoreId
    batchId: (NSString*) batchId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    filter: (NSString*) filter
        completionHandler: (void (^)(OAIListVectorStoreFilesResponse* output, NSError* error)) handler;
```

Returns a list of vector store files in a batch.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store that the files belong to.
NSString* batchId = @"batchId_example"; // The ID of the file batch that the files belong to.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
NSString* filter = @"filter_example"; // Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Returns a list of vector store files in a batch.
[apiInstance listFilesInVectorStoreBatchWithVectorStoreId:vectorStoreId
              batchId:batchId
              limit:limit
              order:order
              after:after
              before:before
              filter:filter
          completionHandler: ^(OAIListVectorStoreFilesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->listFilesInVectorStoreBatch: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store that the files belong to. | 
 **batchId** | **NSString***| The ID of the file batch that the files belong to. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | **NSString***| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**OAIListVectorStoreFilesResponse***](OAIListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStoreFiles**
```objc
-(NSURLSessionTask*) listVectorStoreFilesWithVectorStoreId: (NSString*) vectorStoreId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    filter: (NSString*) filter
        completionHandler: (void (^)(OAIListVectorStoreFilesResponse* output, NSError* error)) handler;
```

Returns a list of vector store files.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store that the files belong to.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
NSString* filter = @"filter_example"; // Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Returns a list of vector store files.
[apiInstance listVectorStoreFilesWithVectorStoreId:vectorStoreId
              limit:limit
              order:order
              after:after
              before:before
              filter:filter
          completionHandler: ^(OAIListVectorStoreFilesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->listVectorStoreFiles: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store that the files belong to. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | **NSString***| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**OAIListVectorStoreFilesResponse***](OAIListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listVectorStores**
```objc
-(NSURLSessionTask*) listVectorStoresWithLimit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
        completionHandler: (void (^)(OAIListVectorStoresResponse* output, NSError* error)) handler;
```

Returns a list of vector stores.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* order = @"desc"; // Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional) (default to @"desc")
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Returns a list of vector stores.
[apiInstance listVectorStoresWithLimit:limit
              order:order
              after:after
              before:before
          completionHandler: ^(OAIListVectorStoresResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->listVectorStores: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **order** | **NSString***| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to @&quot;desc&quot;]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**OAIListVectorStoresResponse***](OAIListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyVectorStore**
```objc
-(NSURLSessionTask*) modifyVectorStoreWithVectorStoreId: (NSString*) vectorStoreId
    updateVectorStoreRequest: (OAIUpdateVectorStoreRequest*) updateVectorStoreRequest
        completionHandler: (void (^)(OAIVectorStoreObject* output, NSError* error)) handler;
```

Modifies a vector store.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* vectorStoreId = @"vectorStoreId_example"; // The ID of the vector store to modify.
OAIUpdateVectorStoreRequest* updateVectorStoreRequest = [[OAIUpdateVectorStoreRequest alloc] init]; // 

OAIVectorStoresApi*apiInstance = [[OAIVectorStoresApi alloc] init];

// Modifies a vector store.
[apiInstance modifyVectorStoreWithVectorStoreId:vectorStoreId
              updateVectorStoreRequest:updateVectorStoreRequest
          completionHandler: ^(OAIVectorStoreObject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIVectorStoresApi->modifyVectorStore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **NSString***| The ID of the vector store to modify. | 
 **updateVectorStoreRequest** | [**OAIUpdateVectorStoreRequest***](OAIUpdateVectorStoreRequest.md)|  | 

### Return type

[**OAIVectorStoreObject***](OAIVectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

