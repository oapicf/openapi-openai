#import "OAIFilesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIDeleteFileResponse.h"
#import "OAIListFilesResponse.h"
#import "OAIOpenAIFile.h"


@interface OAIFilesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIFilesApi

NSString* kOAIFilesApiErrorDomain = @"OAIFilesApiErrorDomain";
NSInteger kOAIFilesApiMissingParamErrorCode = 234513;

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
/// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
/// 
///  @param file The File object (not file name) to be uploaded.  
///
///  @param purpose The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning).  
///
///  @returns OAIOpenAIFile*
///
-(NSURLSessionTask*) createFileWithFile: (NSURL*) file
    purpose: (NSString*) purpose
    completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler {
    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kOAIFilesApiErrorDomain code:kOAIFilesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'purpose' is set
    if (purpose == nil) {
        NSParameterAssert(purpose);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"purpose"] };
            NSError* error = [NSError errorWithDomain:kOAIFilesApiErrorDomain code:kOAIFilesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files"];

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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"ApiKeyAuth"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"file"] = file;
    if (purpose) {
        formParams[@"purpose"] = purpose;
    }

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
                              responseType: @"OAIOpenAIFile*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIOpenAIFile*)data, error);
                                }
                            }];
}

///
/// Delete a file.
/// 
///  @param fileId The ID of the file to use for this request. 
///
///  @returns OAIDeleteFileResponse*
///
-(NSURLSessionTask*) deleteFileWithFileId: (NSString*) fileId
    completionHandler: (void (^)(OAIDeleteFileResponse* output, NSError* error)) handler {
    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIFilesApiErrorDomain code:kOAIFilesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIDeleteFileResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteFileResponse*)data, error);
                                }
                            }];
}

///
/// Returns the contents of the specified file.
/// 
///  @param fileId The ID of the file to use for this request. 
///
///  @returns NSString*
///
-(NSURLSessionTask*) downloadFileWithFileId: (NSString*) fileId
    completionHandler: (void (^)(NSString* output, NSError* error)) handler {
    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIFilesApiErrorDomain code:kOAIFilesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files/{file_id}/content"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"NSString*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSString*)data, error);
                                }
                            }];
}

///
/// Returns a list of files.
/// 
///  @param purpose Only return files with the given purpose. (optional)
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  (optional, default to @10000)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @returns OAIListFilesResponse*
///
-(NSURLSessionTask*) listFilesWithPurpose: (NSString*) purpose
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    completionHandler: (void (^)(OAIListFilesResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (purpose != nil) {
        queryParams[@"purpose"] = purpose;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
    }
    if (after != nil) {
        queryParams[@"after"] = after;
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
                              responseType: @"OAIListFilesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListFilesResponse*)data, error);
                                }
                            }];
}

///
/// Returns information about a specific file.
/// 
///  @param fileId The ID of the file to use for this request. 
///
///  @returns OAIOpenAIFile*
///
-(NSURLSessionTask*) retrieveFileWithFileId: (NSString*) fileId
    completionHandler: (void (^)(OAIOpenAIFile* output, NSError* error)) handler {
    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIFilesApiErrorDomain code:kOAIFilesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIOpenAIFile*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIOpenAIFile*)data, error);
                                }
                            }];
}



@end
