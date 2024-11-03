#import "OAIFineTuningApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICreateFineTuningJobRequest.h"
#import "OAIFineTuningJob.h"
#import "OAIListFineTuningJobCheckpointsResponse.h"
#import "OAIListFineTuningJobEventsResponse.h"
#import "OAIListPaginatedFineTuningJobsResponse.h"


@interface OAIFineTuningApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIFineTuningApi

NSString* kOAIFineTuningApiErrorDomain = @"OAIFineTuningApiErrorDomain";
NSInteger kOAIFineTuningApiMissingParamErrorCode = 234513;

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
/// Immediately cancel a fine-tune job. 
/// 
///  @param fineTuningJobId The ID of the fine-tuning job to cancel.  
///
///  @returns OAIFineTuningJob*
///
-(NSURLSessionTask*) cancelFineTuningJobWithFineTuningJobId: (NSString*) fineTuningJobId
    completionHandler: (void (^)(OAIFineTuningJob* output, NSError* error)) handler {
    // verify the required parameter 'fineTuningJobId' is set
    if (fineTuningJobId == nil) {
        NSParameterAssert(fineTuningJobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuningJobId"] };
            NSError* error = [NSError errorWithDomain:kOAIFineTuningApiErrorDomain code:kOAIFineTuningApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine_tuning/jobs/{fine_tuning_job_id}/cancel"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuningJobId != nil) {
        pathParams[@"fine_tuning_job_id"] = fineTuningJobId;
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
                              responseType: @"OAIFineTuningJob*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFineTuningJob*)data, error);
                                }
                            }];
}

///
/// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
/// 
///  @param createFineTuningJobRequest  
///
///  @returns OAIFineTuningJob*
///
-(NSURLSessionTask*) createFineTuningJobWithCreateFineTuningJobRequest: (OAICreateFineTuningJobRequest*) createFineTuningJobRequest
    completionHandler: (void (^)(OAIFineTuningJob* output, NSError* error)) handler {
    // verify the required parameter 'createFineTuningJobRequest' is set
    if (createFineTuningJobRequest == nil) {
        NSParameterAssert(createFineTuningJobRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createFineTuningJobRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIFineTuningApiErrorDomain code:kOAIFineTuningApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine_tuning/jobs"];

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
    bodyParam = createFineTuningJobRequest;

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
                              responseType: @"OAIFineTuningJob*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFineTuningJob*)data, error);
                                }
                            }];
}

///
/// Get status updates for a fine-tuning job. 
/// 
///  @param fineTuningJobId The ID of the fine-tuning job to get events for.  
///
///  @param after Identifier for the last event from the previous pagination request. (optional)
///
///  @param limit Number of events to retrieve. (optional, default to @20)
///
///  @returns OAIListFineTuningJobEventsResponse*
///
-(NSURLSessionTask*) listFineTuningEventsWithFineTuningJobId: (NSString*) fineTuningJobId
    after: (NSString*) after
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIListFineTuningJobEventsResponse* output, NSError* error)) handler {
    // verify the required parameter 'fineTuningJobId' is set
    if (fineTuningJobId == nil) {
        NSParameterAssert(fineTuningJobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuningJobId"] };
            NSError* error = [NSError errorWithDomain:kOAIFineTuningApiErrorDomain code:kOAIFineTuningApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine_tuning/jobs/{fine_tuning_job_id}/events"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuningJobId != nil) {
        pathParams[@"fine_tuning_job_id"] = fineTuningJobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIListFineTuningJobEventsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListFineTuningJobEventsResponse*)data, error);
                                }
                            }];
}

///
/// List checkpoints for a fine-tuning job. 
/// 
///  @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  
///
///  @param after Identifier for the last checkpoint ID from the previous pagination request. (optional)
///
///  @param limit Number of checkpoints to retrieve. (optional, default to @10)
///
///  @returns OAIListFineTuningJobCheckpointsResponse*
///
-(NSURLSessionTask*) listFineTuningJobCheckpointsWithFineTuningJobId: (NSString*) fineTuningJobId
    after: (NSString*) after
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIListFineTuningJobCheckpointsResponse* output, NSError* error)) handler {
    // verify the required parameter 'fineTuningJobId' is set
    if (fineTuningJobId == nil) {
        NSParameterAssert(fineTuningJobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuningJobId"] };
            NSError* error = [NSError errorWithDomain:kOAIFineTuningApiErrorDomain code:kOAIFineTuningApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuningJobId != nil) {
        pathParams[@"fine_tuning_job_id"] = fineTuningJobId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIListFineTuningJobCheckpointsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListFineTuningJobCheckpointsResponse*)data, error);
                                }
                            }];
}

///
/// List your organization's fine-tuning jobs 
/// 
///  @param after Identifier for the last job from the previous pagination request. (optional)
///
///  @param limit Number of fine-tuning jobs to retrieve. (optional, default to @20)
///
///  @returns OAIListPaginatedFineTuningJobsResponse*
///
-(NSURLSessionTask*) listPaginatedFineTuningJobsWithAfter: (NSString*) after
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIListPaginatedFineTuningJobsResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine_tuning/jobs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIListPaginatedFineTuningJobsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListPaginatedFineTuningJobsResponse*)data, error);
                                }
                            }];
}

///
/// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
/// 
///  @param fineTuningJobId The ID of the fine-tuning job.  
///
///  @returns OAIFineTuningJob*
///
-(NSURLSessionTask*) retrieveFineTuningJobWithFineTuningJobId: (NSString*) fineTuningJobId
    completionHandler: (void (^)(OAIFineTuningJob* output, NSError* error)) handler {
    // verify the required parameter 'fineTuningJobId' is set
    if (fineTuningJobId == nil) {
        NSParameterAssert(fineTuningJobId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"fineTuningJobId"] };
            NSError* error = [NSError errorWithDomain:kOAIFineTuningApiErrorDomain code:kOAIFineTuningApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fine_tuning/jobs/{fine_tuning_job_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (fineTuningJobId != nil) {
        pathParams[@"fine_tuning_job_id"] = fineTuningJobId;
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
                              responseType: @"OAIFineTuningJob*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFineTuningJob*)data, error);
                                }
                            }];
}



@end
