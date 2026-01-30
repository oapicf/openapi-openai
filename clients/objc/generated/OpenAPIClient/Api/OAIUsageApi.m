#import "OAIUsageApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIUsageResponse.h"


@interface OAIUsageApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIUsageApi

NSString* kOAIUsageApiErrorDomain = @"OAIUsageApiErrorDomain";
NSInteger kOAIUsageApiMissingParamErrorCode = 234513;

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
/// Get audio speeches usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param userIds Return only usage for these users. (optional)
///
///  @param apiKeyIds Return only usage for these API keys. (optional)
///
///  @param models Return only usage for these models. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
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
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/audio_speeches"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (userIds != nil) {
        queryParams[@"user_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: userIds format: @"multi"];
    }
    if (apiKeyIds != nil) {
        queryParams[@"api_key_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: apiKeyIds format: @"multi"];
    }
    if (models != nil) {
        queryParams[@"models"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: models format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get audio transcriptions usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param userIds Return only usage for these users. (optional)
///
///  @param apiKeyIds Return only usage for these API keys. (optional)
///
///  @param models Return only usage for these models. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
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
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/audio_transcriptions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (userIds != nil) {
        queryParams[@"user_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: userIds format: @"multi"];
    }
    if (apiKeyIds != nil) {
        queryParams[@"api_key_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: apiKeyIds format: @"multi"];
    }
    if (models != nil) {
        queryParams[@"models"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: models format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get code interpreter sessions usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
-(NSURLSessionTask*) usageCodeInterpreterSessionsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/code_interpreter_sessions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get completions usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param userIds Return only usage for these users. (optional)
///
///  @param apiKeyIds Return only usage for these API keys. (optional)
///
///  @param models Return only usage for these models. (optional)
///
///  @param batch If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both.  (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
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
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/completions"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (userIds != nil) {
        queryParams[@"user_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: userIds format: @"multi"];
    }
    if (apiKeyIds != nil) {
        queryParams[@"api_key_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: apiKeyIds format: @"multi"];
    }
    if (models != nil) {
        queryParams[@"models"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: models format: @"multi"];
    }
    if (batch != nil) {
        queryParams[@"batch"] = [batch isEqual:@(YES)] ? @"true" : @"false";
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get costs details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently only `1d` is supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only costs for these projects. (optional)
///
///  @param groupBy Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them. (optional)
///
///  @param limit A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  (optional, default to @7)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
-(NSURLSessionTask*) usageCostsWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/costs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get embeddings usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param userIds Return only usage for these users. (optional)
///
///  @param apiKeyIds Return only usage for these API keys. (optional)
///
///  @param models Return only usage for these models. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
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
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/embeddings"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (userIds != nil) {
        queryParams[@"user_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: userIds format: @"multi"];
    }
    if (apiKeyIds != nil) {
        queryParams[@"api_key_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: apiKeyIds format: @"multi"];
    }
    if (models != nil) {
        queryParams[@"models"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: models format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get images usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param sources Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them. (optional)
///
///  @param sizes Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them. (optional)
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param userIds Return only usage for these users. (optional)
///
///  @param apiKeyIds Return only usage for these API keys. (optional)
///
///  @param models Return only usage for these models. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
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
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/images"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (sources != nil) {
        queryParams[@"sources"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: sources format: @"multi"];
    }
    if (sizes != nil) {
        queryParams[@"sizes"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: sizes format: @"multi"];
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (userIds != nil) {
        queryParams[@"user_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: userIds format: @"multi"];
    }
    if (apiKeyIds != nil) {
        queryParams[@"api_key_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: apiKeyIds format: @"multi"];
    }
    if (models != nil) {
        queryParams[@"models"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: models format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get moderations usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param userIds Return only usage for these users. (optional)
///
///  @param apiKeyIds Return only usage for these API keys. (optional)
///
///  @param models Return only usage for these models. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
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
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/moderations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (userIds != nil) {
        queryParams[@"user_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: userIds format: @"multi"];
    }
    if (apiKeyIds != nil) {
        queryParams[@"api_key_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: apiKeyIds format: @"multi"];
    }
    if (models != nil) {
        queryParams[@"models"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: models format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}

///
/// Get vector stores usage details for the organization.
/// 
///  @param startTime Start time (Unix seconds) of the query time range, inclusive. 
///
///  @param endTime End time (Unix seconds) of the query time range, exclusive. (optional)
///
///  @param bucketWidth Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`. (optional, default to @"1d")
///
///  @param projectIds Return only usage for these projects. (optional)
///
///  @param groupBy Group the usage data by the specified fields. Support fields include `project_id`. (optional)
///
///  @param limit Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440  (optional)
///
///  @param page A cursor for use in pagination. Corresponding to the `next_page` field from the previous response. (optional)
///
///  @returns OAIUsageResponse*
///
-(NSURLSessionTask*) usageVectorStoresWithStartTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    bucketWidth: (NSString*) bucketWidth
    projectIds: (NSArray<NSString*>*) projectIds
    groupBy: (NSArray<NSString*>*) groupBy
    limit: (NSNumber*) limit
    page: (NSString*) page
    completionHandler: (void (^)(OAIUsageResponse* output, NSError* error)) handler {
    // verify the required parameter 'startTime' is set
    if (startTime == nil) {
        NSParameterAssert(startTime);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startTime"] };
            NSError* error = [NSError errorWithDomain:kOAIUsageApiErrorDomain code:kOAIUsageApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/usage/vector_stores"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (bucketWidth != nil) {
        queryParams[@"bucket_width"] = bucketWidth;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (groupBy != nil) {
        queryParams[@"group_by"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: groupBy format: @"multi"];
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (page != nil) {
        queryParams[@"page"] = page;
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
                              responseType: @"OAIUsageResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIUsageResponse*)data, error);
                                }
                            }];
}



@end
