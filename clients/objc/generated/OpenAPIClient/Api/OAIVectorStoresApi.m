#import "OAIVectorStoresApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICreateVectorStoreFileBatchRequest.h"
#import "OAICreateVectorStoreFileRequest.h"
#import "OAICreateVectorStoreRequest.h"
#import "OAIDeleteVectorStoreFileResponse.h"
#import "OAIDeleteVectorStoreResponse.h"
#import "OAIListVectorStoreFilesResponse.h"
#import "OAIListVectorStoresResponse.h"
#import "OAIUpdateVectorStoreRequest.h"
#import "OAIVectorStoreFileBatchObject.h"
#import "OAIVectorStoreFileObject.h"
#import "OAIVectorStoreObject.h"


@interface OAIVectorStoresApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIVectorStoresApi

NSString* kOAIVectorStoresApiErrorDomain = @"OAIVectorStoresApiErrorDomain";
NSInteger kOAIVectorStoresApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
/// 
///  @param vectorStoreId The ID of the vector store that the file batch belongs to. 
///
///  @param batchId The ID of the file batch to cancel. 
///
///  @returns OAIVectorStoreFileBatchObject*
///
-(NSURLSessionTask*) cancelVectorStoreFileBatchWithVectorStoreId: (NSString*) vectorStoreId
    batchId: (NSString*) batchId
    completionHandler: (void (^)(OAIVectorStoreFileBatchObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'batchId' is set
    if (batchId == nil) {
        NSParameterAssert(batchId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"batchId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }
    if (batchId != nil) {
        pathParams[@"batch_id"] = batchId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreFileBatchObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreFileBatchObject*)data, error);
                                }
                            }];
}

///
/// Create a vector store.
/// 
///  @param createVectorStoreRequest  
///
///  @returns OAIVectorStoreObject*
///
-(NSURLSessionTask*) createVectorStoreWithCreateVectorStoreRequest: (OAICreateVectorStoreRequest*) createVectorStoreRequest
    completionHandler: (void (^)(OAIVectorStoreObject* output, NSError* error)) handler {
    // verify the required parameter 'createVectorStoreRequest' is set
    if (createVectorStoreRequest == nil) {
        NSParameterAssert(createVectorStoreRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createVectorStoreRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createVectorStoreRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreObject*)data, error);
                                }
                            }];
}

///
/// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
/// 
///  @param vectorStoreId The ID of the vector store for which to create a File.  
///
///  @param createVectorStoreFileRequest  
///
///  @returns OAIVectorStoreFileObject*
///
-(NSURLSessionTask*) createVectorStoreFileWithVectorStoreId: (NSString*) vectorStoreId
    createVectorStoreFileRequest: (OAICreateVectorStoreFileRequest*) createVectorStoreFileRequest
    completionHandler: (void (^)(OAIVectorStoreFileObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createVectorStoreFileRequest' is set
    if (createVectorStoreFileRequest == nil) {
        NSParameterAssert(createVectorStoreFileRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createVectorStoreFileRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createVectorStoreFileRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreFileObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreFileObject*)data, error);
                                }
                            }];
}

///
/// Create a vector store file batch.
/// 
///  @param vectorStoreId The ID of the vector store for which to create a File Batch.  
///
///  @param createVectorStoreFileBatchRequest  
///
///  @returns OAIVectorStoreFileBatchObject*
///
-(NSURLSessionTask*) createVectorStoreFileBatchWithVectorStoreId: (NSString*) vectorStoreId
    createVectorStoreFileBatchRequest: (OAICreateVectorStoreFileBatchRequest*) createVectorStoreFileBatchRequest
    completionHandler: (void (^)(OAIVectorStoreFileBatchObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createVectorStoreFileBatchRequest' is set
    if (createVectorStoreFileBatchRequest == nil) {
        NSParameterAssert(createVectorStoreFileBatchRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createVectorStoreFileBatchRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/file_batches"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = createVectorStoreFileBatchRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreFileBatchObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreFileBatchObject*)data, error);
                                }
                            }];
}

///
/// Delete a vector store.
/// 
///  @param vectorStoreId The ID of the vector store to delete. 
///
///  @returns OAIDeleteVectorStoreResponse*
///
-(NSURLSessionTask*) deleteVectorStoreWithVectorStoreId: (NSString*) vectorStoreId
    completionHandler: (void (^)(OAIDeleteVectorStoreResponse* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIDeleteVectorStoreResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteVectorStoreResponse*)data, error);
                                }
                            }];
}

///
/// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
/// 
///  @param vectorStoreId The ID of the vector store that the file belongs to. 
///
///  @param fileId The ID of the file to delete. 
///
///  @returns OAIDeleteVectorStoreFileResponse*
///
-(NSURLSessionTask*) deleteVectorStoreFileWithVectorStoreId: (NSString*) vectorStoreId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIDeleteVectorStoreFileResponse* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }
    if (fileId != nil) {
        pathParams[@"file_id"] = fileId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIDeleteVectorStoreFileResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteVectorStoreFileResponse*)data, error);
                                }
                            }];
}

///
/// Retrieves a vector store.
/// 
///  @param vectorStoreId The ID of the vector store to retrieve. 
///
///  @returns OAIVectorStoreObject*
///
-(NSURLSessionTask*) getVectorStoreWithVectorStoreId: (NSString*) vectorStoreId
    completionHandler: (void (^)(OAIVectorStoreObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreObject*)data, error);
                                }
                            }];
}

///
/// Retrieves a vector store file.
/// 
///  @param vectorStoreId The ID of the vector store that the file belongs to. 
///
///  @param fileId The ID of the file being retrieved. 
///
///  @returns OAIVectorStoreFileObject*
///
-(NSURLSessionTask*) getVectorStoreFileWithVectorStoreId: (NSString*) vectorStoreId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIVectorStoreFileObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }
    if (fileId != nil) {
        pathParams[@"file_id"] = fileId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreFileObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreFileObject*)data, error);
                                }
                            }];
}

///
/// Retrieves a vector store file batch.
/// 
///  @param vectorStoreId The ID of the vector store that the file batch belongs to. 
///
///  @param batchId The ID of the file batch being retrieved. 
///
///  @returns OAIVectorStoreFileBatchObject*
///
-(NSURLSessionTask*) getVectorStoreFileBatchWithVectorStoreId: (NSString*) vectorStoreId
    batchId: (NSString*) batchId
    completionHandler: (void (^)(OAIVectorStoreFileBatchObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'batchId' is set
    if (batchId == nil) {
        NSParameterAssert(batchId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"batchId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/file_batches/{batch_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }
    if (batchId != nil) {
        pathParams[@"batch_id"] = batchId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreFileBatchObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreFileBatchObject*)data, error);
                                }
                            }];
}

///
/// Returns a list of vector store files in a batch.
/// 
///  @param vectorStoreId The ID of the vector store that the files belong to. 
///
///  @param batchId The ID of the file batch that the files belong to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
///
///  @returns OAIListVectorStoreFilesResponse*
///
-(NSURLSessionTask*) listFilesInVectorStoreBatchWithVectorStoreId: (NSString*) vectorStoreId
    batchId: (NSString*) batchId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    filter: (NSString*) filter
    completionHandler: (void (^)(OAIListVectorStoreFilesResponse* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'batchId' is set
    if (batchId == nil) {
        NSParameterAssert(batchId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"batchId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/file_batches/{batch_id}/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }
    if (batchId != nil) {
        pathParams[@"batch_id"] = batchId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (before != nil) {
        queryParams[@"before"] = before;
    }
    if (filter != nil) {
        queryParams[@"filter"] = filter;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListVectorStoreFilesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListVectorStoreFilesResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of vector store files.
/// 
///  @param vectorStoreId The ID of the vector store that the files belong to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`. (optional)
///
///  @returns OAIListVectorStoreFilesResponse*
///
-(NSURLSessionTask*) listVectorStoreFilesWithVectorStoreId: (NSString*) vectorStoreId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    filter: (NSString*) filter
    completionHandler: (void (^)(OAIListVectorStoreFilesResponse* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (before != nil) {
        queryParams[@"before"] = before;
    }
    if (filter != nil) {
        queryParams[@"filter"] = filter;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListVectorStoreFilesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListVectorStoreFilesResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of vector stores.
/// 
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListVectorStoresResponse*
///
-(NSURLSessionTask*) listVectorStoresWithLimit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListVectorStoresResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (before != nil) {
        queryParams[@"before"] = before;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIListVectorStoresResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListVectorStoresResponse*)data, error);
                                }
                            }];
}

///
/// Modifies a vector store.
/// 
///  @param vectorStoreId The ID of the vector store to modify. 
///
///  @param updateVectorStoreRequest  
///
///  @returns OAIVectorStoreObject*
///
-(NSURLSessionTask*) modifyVectorStoreWithVectorStoreId: (NSString*) vectorStoreId
    updateVectorStoreRequest: (OAIUpdateVectorStoreRequest*) updateVectorStoreRequest
    completionHandler: (void (^)(OAIVectorStoreObject* output, NSError* error)) handler {
    // verify the required parameter 'vectorStoreId' is set
    if (vectorStoreId == nil) {
        NSParameterAssert(vectorStoreId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vectorStoreId"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'updateVectorStoreRequest' is set
    if (updateVectorStoreRequest == nil) {
        NSParameterAssert(updateVectorStoreRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateVectorStoreRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIVectorStoresApiErrorDomain code:kOAIVectorStoresApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/vector_stores/{vector_store_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vectorStoreId != nil) {
        pathParams[@"vector_store_id"] = vectorStoreId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = updateVectorStoreRequest;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIVectorStoreObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVectorStoreObject*)data, error);
                                }
                            }];
}



@end
