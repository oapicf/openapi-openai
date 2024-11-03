#import "OAIAssistantsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAssistantFileObject.h"
#import "OAIAssistantObject.h"
#import "OAICreateAssistantFileRequest.h"
#import "OAICreateAssistantRequest.h"
#import "OAICreateMessageRequest.h"
#import "OAICreateRunRequest.h"
#import "OAICreateThreadAndRunRequest.h"
#import "OAICreateThreadRequest.h"
#import "OAIDeleteAssistantFileResponse.h"
#import "OAIDeleteAssistantResponse.h"
#import "OAIDeleteThreadResponse.h"
#import "OAIListAssistantFilesResponse.h"
#import "OAIListAssistantsResponse.h"
#import "OAIListMessageFilesResponse.h"
#import "OAIListMessagesResponse.h"
#import "OAIListRunStepsResponse.h"
#import "OAIListRunsResponse.h"
#import "OAIMessageFileObject.h"
#import "OAIMessageObject.h"
#import "OAIModifyAssistantRequest.h"
#import "OAIModifyMessageRequest.h"
#import "OAIModifyRunRequest.h"
#import "OAIModifyThreadRequest.h"
#import "OAIRunObject.h"
#import "OAIRunStepObject.h"
#import "OAISubmitToolOutputsRunRequest.h"
#import "OAIThreadObject.h"


@interface OAIAssistantsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAssistantsApi

NSString* kOAIAssistantsApiErrorDomain = @"OAIAssistantsApiErrorDomain";
NSInteger kOAIAssistantsApiMissingParamErrorCode = 234513;

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
/// Cancels a run that is `in_progress`.
/// 
///  @param threadId The ID of the thread to which this run belongs. 
///
///  @param runId The ID of the run to cancel. 
///
///  @returns OAIRunObject*
///
-(NSURLSessionTask*) cancelRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'runId' is set
    if (runId == nil) {
        NSParameterAssert(runId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs/{run_id}/cancel"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (runId != nil) {
        pathParams[@"run_id"] = runId;
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
                              responseType: @"OAIRunObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunObject*)data, error);
                                }
                            }];
}

///
/// Create an assistant with a model and instructions.
/// 
///  @param createAssistantRequest  
///
///  @returns OAIAssistantObject*
///
-(NSURLSessionTask*) createAssistantWithCreateAssistantRequest: (OAICreateAssistantRequest*) createAssistantRequest
    completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler {
    // verify the required parameter 'createAssistantRequest' is set
    if (createAssistantRequest == nil) {
        NSParameterAssert(createAssistantRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createAssistantRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants"];

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
    bodyParam = createAssistantRequest;

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
                              responseType: @"OAIAssistantObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssistantObject*)data, error);
                                }
                            }];
}

///
/// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
/// 
///  @param assistantId The ID of the assistant for which to create a File.  
///
///  @param createAssistantFileRequest  
///
///  @returns OAIAssistantFileObject*
///
-(NSURLSessionTask*) createAssistantFileWithAssistantId: (NSString*) assistantId
    createAssistantFileRequest: (OAICreateAssistantFileRequest*) createAssistantFileRequest
    completionHandler: (void (^)(OAIAssistantFileObject* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createAssistantFileRequest' is set
    if (createAssistantFileRequest == nil) {
        NSParameterAssert(createAssistantFileRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createAssistantFileRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
    bodyParam = createAssistantFileRequest;

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
                              responseType: @"OAIAssistantFileObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssistantFileObject*)data, error);
                                }
                            }];
}

///
/// Create a message.
/// 
///  @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. 
///
///  @param createMessageRequest  
///
///  @returns OAIMessageObject*
///
-(NSURLSessionTask*) createMessageWithThreadId: (NSString*) threadId
    createMessageRequest: (OAICreateMessageRequest*) createMessageRequest
    completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createMessageRequest' is set
    if (createMessageRequest == nil) {
        NSParameterAssert(createMessageRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createMessageRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/messages"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
    bodyParam = createMessageRequest;

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
                              responseType: @"OAIMessageObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMessageObject*)data, error);
                                }
                            }];
}

///
/// Create a run.
/// 
///  @param threadId The ID of the thread to run. 
///
///  @param createRunRequest  
///
///  @returns OAIRunObject*
///
-(NSURLSessionTask*) createRunWithThreadId: (NSString*) threadId
    createRunRequest: (OAICreateRunRequest*) createRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createRunRequest' is set
    if (createRunRequest == nil) {
        NSParameterAssert(createRunRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createRunRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
    bodyParam = createRunRequest;

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
                              responseType: @"OAIRunObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunObject*)data, error);
                                }
                            }];
}

///
/// Create a thread.
/// 
///  @param createThreadRequest  (optional)
///
///  @returns OAIThreadObject*
///
-(NSURLSessionTask*) createThreadWithCreateThreadRequest: (OAICreateThreadRequest*) createThreadRequest
    completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads"];

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
    bodyParam = createThreadRequest;

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
                              responseType: @"OAIThreadObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIThreadObject*)data, error);
                                }
                            }];
}

///
/// Create a thread and run it in one request.
/// 
///  @param createThreadAndRunRequest  
///
///  @returns OAIRunObject*
///
-(NSURLSessionTask*) createThreadAndRunWithCreateThreadAndRunRequest: (OAICreateThreadAndRunRequest*) createThreadAndRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler {
    // verify the required parameter 'createThreadAndRunRequest' is set
    if (createThreadAndRunRequest == nil) {
        NSParameterAssert(createThreadAndRunRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createThreadAndRunRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/runs"];

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
    bodyParam = createThreadAndRunRequest;

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
                              responseType: @"OAIRunObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunObject*)data, error);
                                }
                            }];
}

///
/// Delete an assistant.
/// 
///  @param assistantId The ID of the assistant to delete. 
///
///  @returns OAIDeleteAssistantResponse*
///
-(NSURLSessionTask*) deleteAssistantWithAssistantId: (NSString*) assistantId
    completionHandler: (void (^)(OAIDeleteAssistantResponse* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
                              responseType: @"OAIDeleteAssistantResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteAssistantResponse*)data, error);
                                }
                            }];
}

///
/// Delete an assistant file.
/// 
///  @param assistantId The ID of the assistant that the file belongs to. 
///
///  @param fileId The ID of the file to delete. 
///
///  @returns OAIDeleteAssistantFileResponse*
///
-(NSURLSessionTask*) deleteAssistantFileWithAssistantId: (NSString*) assistantId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIDeleteAssistantFileResponse* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
                              responseType: @"OAIDeleteAssistantFileResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteAssistantFileResponse*)data, error);
                                }
                            }];
}

///
/// Delete a thread.
/// 
///  @param threadId The ID of the thread to delete. 
///
///  @returns OAIDeleteThreadResponse*
///
-(NSURLSessionTask*) deleteThreadWithThreadId: (NSString*) threadId
    completionHandler: (void (^)(OAIDeleteThreadResponse* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
                              responseType: @"OAIDeleteThreadResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDeleteThreadResponse*)data, error);
                                }
                            }];
}

///
/// Retrieves an assistant.
/// 
///  @param assistantId The ID of the assistant to retrieve. 
///
///  @returns OAIAssistantObject*
///
-(NSURLSessionTask*) getAssistantWithAssistantId: (NSString*) assistantId
    completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
                              responseType: @"OAIAssistantObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssistantObject*)data, error);
                                }
                            }];
}

///
/// Retrieves an AssistantFile.
/// 
///  @param assistantId The ID of the assistant who the file belongs to. 
///
///  @param fileId The ID of the file we're getting. 
///
///  @returns OAIAssistantFileObject*
///
-(NSURLSessionTask*) getAssistantFileWithAssistantId: (NSString*) assistantId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIAssistantFileObject* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
                              responseType: @"OAIAssistantFileObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssistantFileObject*)data, error);
                                }
                            }];
}

///
/// Retrieve a message.
/// 
///  @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. 
///
///  @param messageId The ID of the message to retrieve. 
///
///  @returns OAIMessageObject*
///
-(NSURLSessionTask*) getMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/messages/{message_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
                              responseType: @"OAIMessageObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMessageObject*)data, error);
                                }
                            }];
}

///
/// Retrieves a message file.
/// 
///  @param threadId The ID of the thread to which the message and File belong. 
///
///  @param messageId The ID of the message the file belongs to. 
///
///  @param fileId The ID of the file being retrieved. 
///
///  @returns OAIMessageFileObject*
///
-(NSURLSessionTask*) getMessageFileWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    fileId: (NSString*) fileId
    completionHandler: (void (^)(OAIMessageFileObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'fileId' is set
    if (fileId == nil) {
        NSParameterAssert(fileId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fileId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/messages/{message_id}/files/{file_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
                              responseType: @"OAIMessageFileObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMessageFileObject*)data, error);
                                }
                            }];
}

///
/// Retrieves a run.
/// 
///  @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. 
///
///  @param runId The ID of the run to retrieve. 
///
///  @returns OAIRunObject*
///
-(NSURLSessionTask*) getRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'runId' is set
    if (runId == nil) {
        NSParameterAssert(runId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs/{run_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (runId != nil) {
        pathParams[@"run_id"] = runId;
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
                              responseType: @"OAIRunObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunObject*)data, error);
                                }
                            }];
}

///
/// Retrieves a run step.
/// 
///  @param threadId The ID of the thread to which the run and run step belongs. 
///
///  @param runId The ID of the run to which the run step belongs. 
///
///  @param stepId The ID of the run step to retrieve. 
///
///  @returns OAIRunStepObject*
///
-(NSURLSessionTask*) getRunStepWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    stepId: (NSString*) stepId
    completionHandler: (void (^)(OAIRunStepObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'runId' is set
    if (runId == nil) {
        NSParameterAssert(runId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'stepId' is set
    if (stepId == nil) {
        NSParameterAssert(stepId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"stepId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs/{run_id}/steps/{step_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (runId != nil) {
        pathParams[@"run_id"] = runId;
    }
    if (stepId != nil) {
        pathParams[@"step_id"] = stepId;
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
                              responseType: @"OAIRunStepObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunStepObject*)data, error);
                                }
                            }];
}

///
/// Retrieves a thread.
/// 
///  @param threadId The ID of the thread to retrieve. 
///
///  @returns OAIThreadObject*
///
-(NSURLSessionTask*) getThreadWithThreadId: (NSString*) threadId
    completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
                              responseType: @"OAIThreadObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIThreadObject*)data, error);
                                }
                            }];
}

///
/// Returns a list of assistant files.
/// 
///  @param assistantId The ID of the assistant the file belongs to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListAssistantFilesResponse*
///
-(NSURLSessionTask*) listAssistantFilesWithAssistantId: (NSString*) assistantId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListAssistantFilesResponse* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
                              responseType: @"OAIListAssistantFilesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListAssistantFilesResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of assistants.
/// 
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListAssistantsResponse*
///
-(NSURLSessionTask*) listAssistantsWithLimit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListAssistantsResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants"];

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
                              responseType: @"OAIListAssistantsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListAssistantsResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of message files.
/// 
///  @param threadId The ID of the thread that the message and files belong to. 
///
///  @param messageId The ID of the message that the files belongs to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListMessageFilesResponse*
///
-(NSURLSessionTask*) listMessageFilesWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListMessageFilesResponse* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/messages/{message_id}/files"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
                              responseType: @"OAIListMessageFilesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListMessageFilesResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of messages for a given thread.
/// 
///  @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @param runId Filter messages by the run ID that generated them.  (optional)
///
///  @returns OAIListMessagesResponse*
///
-(NSURLSessionTask*) listMessagesWithThreadId: (NSString*) threadId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    runId: (NSString*) runId
    completionHandler: (void (^)(OAIListMessagesResponse* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/messages"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
    if (runId != nil) {
        queryParams[@"run_id"] = runId;
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
                              responseType: @"OAIListMessagesResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListMessagesResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of run steps belonging to a run.
/// 
///  @param threadId The ID of the thread the run and run steps belong to. 
///
///  @param runId The ID of the run the run steps belong to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListRunStepsResponse*
///
-(NSURLSessionTask*) listRunStepsWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListRunStepsResponse* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'runId' is set
    if (runId == nil) {
        NSParameterAssert(runId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs/{run_id}/steps"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (runId != nil) {
        pathParams[@"run_id"] = runId;
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
                              responseType: @"OAIListRunStepsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListRunStepsResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of runs belonging to a thread.
/// 
///  @param threadId The ID of the thread the run belongs to. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  (optional, default to @"desc")
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListRunsResponse*
///
-(NSURLSessionTask*) listRunsWithThreadId: (NSString*) threadId
    limit: (NSNumber*) limit
    order: (NSString*) order
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListRunsResponse* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
                              responseType: @"OAIListRunsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListRunsResponse*)data, error);
                                }
                            }];
}

///
/// Modifies an assistant.
/// 
///  @param assistantId The ID of the assistant to modify. 
///
///  @param modifyAssistantRequest  
///
///  @returns OAIAssistantObject*
///
-(NSURLSessionTask*) modifyAssistantWithAssistantId: (NSString*) assistantId
    modifyAssistantRequest: (OAIModifyAssistantRequest*) modifyAssistantRequest
    completionHandler: (void (^)(OAIAssistantObject* output, NSError* error)) handler {
    // verify the required parameter 'assistantId' is set
    if (assistantId == nil) {
        NSParameterAssert(assistantId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assistantId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'modifyAssistantRequest' is set
    if (modifyAssistantRequest == nil) {
        NSParameterAssert(modifyAssistantRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"modifyAssistantRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/assistants/{assistant_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assistantId != nil) {
        pathParams[@"assistant_id"] = assistantId;
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
    bodyParam = modifyAssistantRequest;

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
                              responseType: @"OAIAssistantObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssistantObject*)data, error);
                                }
                            }];
}

///
/// Modifies a message.
/// 
///  @param threadId The ID of the thread to which this message belongs. 
///
///  @param messageId The ID of the message to modify. 
///
///  @param modifyMessageRequest  
///
///  @returns OAIMessageObject*
///
-(NSURLSessionTask*) modifyMessageWithThreadId: (NSString*) threadId
    messageId: (NSString*) messageId
    modifyMessageRequest: (OAIModifyMessageRequest*) modifyMessageRequest
    completionHandler: (void (^)(OAIMessageObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'messageId' is set
    if (messageId == nil) {
        NSParameterAssert(messageId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"messageId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'modifyMessageRequest' is set
    if (modifyMessageRequest == nil) {
        NSParameterAssert(modifyMessageRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"modifyMessageRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/messages/{message_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (messageId != nil) {
        pathParams[@"message_id"] = messageId;
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
    bodyParam = modifyMessageRequest;

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
                              responseType: @"OAIMessageObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMessageObject*)data, error);
                                }
                            }];
}

///
/// Modifies a run.
/// 
///  @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. 
///
///  @param runId The ID of the run to modify. 
///
///  @param modifyRunRequest  
///
///  @returns OAIRunObject*
///
-(NSURLSessionTask*) modifyRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    modifyRunRequest: (OAIModifyRunRequest*) modifyRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'runId' is set
    if (runId == nil) {
        NSParameterAssert(runId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'modifyRunRequest' is set
    if (modifyRunRequest == nil) {
        NSParameterAssert(modifyRunRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"modifyRunRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs/{run_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (runId != nil) {
        pathParams[@"run_id"] = runId;
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
    bodyParam = modifyRunRequest;

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
                              responseType: @"OAIRunObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunObject*)data, error);
                                }
                            }];
}

///
/// Modifies a thread.
/// 
///  @param threadId The ID of the thread to modify. Only the `metadata` can be modified. 
///
///  @param modifyThreadRequest  
///
///  @returns OAIThreadObject*
///
-(NSURLSessionTask*) modifyThreadWithThreadId: (NSString*) threadId
    modifyThreadRequest: (OAIModifyThreadRequest*) modifyThreadRequest
    completionHandler: (void (^)(OAIThreadObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'modifyThreadRequest' is set
    if (modifyThreadRequest == nil) {
        NSParameterAssert(modifyThreadRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"modifyThreadRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
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
    bodyParam = modifyThreadRequest;

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
                              responseType: @"OAIThreadObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIThreadObject*)data, error);
                                }
                            }];
}

///
/// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
/// 
///  @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. 
///
///  @param runId The ID of the run that requires the tool output submission. 
///
///  @param submitToolOutputsRunRequest  
///
///  @returns OAIRunObject*
///
-(NSURLSessionTask*) submitToolOuputsToRunWithThreadId: (NSString*) threadId
    runId: (NSString*) runId
    submitToolOutputsRunRequest: (OAISubmitToolOutputsRunRequest*) submitToolOutputsRunRequest
    completionHandler: (void (^)(OAIRunObject* output, NSError* error)) handler {
    // verify the required parameter 'threadId' is set
    if (threadId == nil) {
        NSParameterAssert(threadId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"threadId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'runId' is set
    if (runId == nil) {
        NSParameterAssert(runId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"runId"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'submitToolOutputsRunRequest' is set
    if (submitToolOutputsRunRequest == nil) {
        NSParameterAssert(submitToolOutputsRunRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"submitToolOutputsRunRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIAssistantsApiErrorDomain code:kOAIAssistantsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (threadId != nil) {
        pathParams[@"thread_id"] = threadId;
    }
    if (runId != nil) {
        pathParams[@"run_id"] = runId;
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
    bodyParam = submitToolOutputsRunRequest;

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
                              responseType: @"OAIRunObject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIRunObject*)data, error);
                                }
                            }];
}



@end
