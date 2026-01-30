#import "OAIProjectsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIErrorResponse.h"
#import "OAIProject.h"
#import "OAIProjectApiKey.h"
#import "OAIProjectApiKeyDeleteResponse.h"
#import "OAIProjectApiKeyListResponse.h"
#import "OAIProjectCreateRequest.h"
#import "OAIProjectListResponse.h"
#import "OAIProjectRateLimit.h"
#import "OAIProjectRateLimitListResponse.h"
#import "OAIProjectRateLimitUpdateRequest.h"
#import "OAIProjectServiceAccount.h"
#import "OAIProjectServiceAccountCreateRequest.h"
#import "OAIProjectServiceAccountCreateResponse.h"
#import "OAIProjectServiceAccountDeleteResponse.h"
#import "OAIProjectServiceAccountListResponse.h"
#import "OAIProjectUpdateRequest.h"
#import "OAIProjectUser.h"
#import "OAIProjectUserCreateRequest.h"
#import "OAIProjectUserDeleteResponse.h"
#import "OAIProjectUserListResponse.h"
#import "OAIProjectUserUpdateRequest.h"


@interface OAIProjectsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIProjectsApi

NSString* kOAIProjectsApiErrorDomain = @"OAIProjectsApiErrorDomain";
NSInteger kOAIProjectsApiMissingParamErrorCode = 234513;

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
/// Archives a project in the organization. Archived projects cannot be used or updated.
/// 
///  @param projectId The ID of the project. 
///
///  @returns OAIProject*
///
-(NSURLSessionTask*) archiveProjectWithProjectId: (NSString*) projectId
    completionHandler: (void (^)(OAIProject* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/archive"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
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
                              responseType: @"OAIProject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProject*)data, error);
                                }
                            }];
}

///
/// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
/// 
///  @param projectCreateRequest The project create request payload. 
///
///  @returns OAIProject*
///
-(NSURLSessionTask*) createProjectWithProjectCreateRequest: (OAIProjectCreateRequest*) projectCreateRequest
    completionHandler: (void (^)(OAIProject* output, NSError* error)) handler {
    // verify the required parameter 'projectCreateRequest' is set
    if (projectCreateRequest == nil) {
        NSParameterAssert(projectCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects"];

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
    bodyParam = projectCreateRequest;

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
                              responseType: @"OAIProject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProject*)data, error);
                                }
                            }];
}

///
/// Creates a new service account in the project. This also returns an unredacted API key for the service account.
/// 
///  @param projectId The ID of the project. 
///
///  @param projectServiceAccountCreateRequest The project service account create request payload. 
///
///  @returns OAIProjectServiceAccountCreateResponse*
///
-(NSURLSessionTask*) createProjectServiceAccountWithProjectId: (NSString*) projectId
    projectServiceAccountCreateRequest: (OAIProjectServiceAccountCreateRequest*) projectServiceAccountCreateRequest
    completionHandler: (void (^)(OAIProjectServiceAccountCreateResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'projectServiceAccountCreateRequest' is set
    if (projectServiceAccountCreateRequest == nil) {
        NSParameterAssert(projectServiceAccountCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectServiceAccountCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/service_accounts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
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
    bodyParam = projectServiceAccountCreateRequest;

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
                              responseType: @"OAIProjectServiceAccountCreateResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectServiceAccountCreateResponse*)data, error);
                                }
                            }];
}

///
/// Adds a user to the project. Users must already be members of the organization to be added to a project.
/// 
///  @param projectId The ID of the project. 
///
///  @param projectUserCreateRequest The project user create request payload. 
///
///  @returns OAIProjectUser*
///
-(NSURLSessionTask*) createProjectUserWithProjectId: (NSString*) projectId
    projectUserCreateRequest: (OAIProjectUserCreateRequest*) projectUserCreateRequest
    completionHandler: (void (^)(OAIProjectUser* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'projectUserCreateRequest' is set
    if (projectUserCreateRequest == nil) {
        NSParameterAssert(projectUserCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectUserCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/users"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
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
    bodyParam = projectUserCreateRequest;

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
                              responseType: @"OAIProjectUser*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectUser*)data, error);
                                }
                            }];
}

///
/// Deletes an API key from the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param keyId The ID of the API key. 
///
///  @returns OAIProjectApiKeyDeleteResponse*
///
-(NSURLSessionTask*) deleteProjectApiKeyWithProjectId: (NSString*) projectId
    keyId: (NSString*) keyId
    completionHandler: (void (^)(OAIProjectApiKeyDeleteResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'keyId' is set
    if (keyId == nil) {
        NSParameterAssert(keyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keyId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/api_keys/{key_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (keyId != nil) {
        pathParams[@"key_id"] = keyId;
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
                              responseType: @"OAIProjectApiKeyDeleteResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectApiKeyDeleteResponse*)data, error);
                                }
                            }];
}

///
/// Deletes a service account from the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param serviceAccountId The ID of the service account. 
///
///  @returns OAIProjectServiceAccountDeleteResponse*
///
-(NSURLSessionTask*) deleteProjectServiceAccountWithProjectId: (NSString*) projectId
    serviceAccountId: (NSString*) serviceAccountId
    completionHandler: (void (^)(OAIProjectServiceAccountDeleteResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == nil) {
        NSParameterAssert(serviceAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"serviceAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/service_accounts/{service_account_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (serviceAccountId != nil) {
        pathParams[@"service_account_id"] = serviceAccountId;
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
                              responseType: @"OAIProjectServiceAccountDeleteResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectServiceAccountDeleteResponse*)data, error);
                                }
                            }];
}

///
/// Deletes a user from the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param userId The ID of the user. 
///
///  @returns OAIProjectUserDeleteResponse*
///
-(NSURLSessionTask*) deleteProjectUserWithProjectId: (NSString*) projectId
    userId: (NSString*) userId
    completionHandler: (void (^)(OAIProjectUserDeleteResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/users/{user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
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
                              responseType: @"OAIProjectUserDeleteResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectUserDeleteResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of API keys in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @returns OAIProjectApiKeyListResponse*
///
-(NSURLSessionTask*) listProjectApiKeysWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
    completionHandler: (void (^)(OAIProjectApiKeyListResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/api_keys"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIProjectApiKeyListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectApiKeyListResponse*)data, error);
                                }
                            }];
}

///
/// Returns the rate limits per model for a project.
/// 
///  @param projectId The ID of the project. 
///
///  @param limit A limit on the number of objects to be returned. The default is 100.  (optional, default to @100)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIProjectRateLimitListResponse*
///
-(NSURLSessionTask*) listProjectRateLimitsWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIProjectRateLimitListResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/rate_limits"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIProjectRateLimitListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectRateLimitListResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of service accounts in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @returns OAIProjectServiceAccountListResponse*
///
-(NSURLSessionTask*) listProjectServiceAccountsWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
    completionHandler: (void (^)(OAIProjectServiceAccountListResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/service_accounts"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIProjectServiceAccountListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectServiceAccountListResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of users in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @returns OAIProjectUserListResponse*
///
-(NSURLSessionTask*) listProjectUsersWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
    completionHandler: (void (^)(OAIProjectUserListResponse* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/users"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIProjectUserListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectUserListResponse*)data, error);
                                }
                            }];
}

///
/// Returns a list of projects.
/// 
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param includeArchived If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional, default to @(NO))
///
///  @returns OAIProjectListResponse*
///
-(NSURLSessionTask*) listProjectsWithLimit: (NSNumber*) limit
    after: (NSString*) after
    includeArchived: (NSNumber*) includeArchived
    completionHandler: (void (^)(OAIProjectListResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (limit != nil) {
        queryParams[@"limit"] = limit;
    }
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (includeArchived != nil) {
        queryParams[@"include_archived"] = [includeArchived isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAIProjectListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectListResponse*)data, error);
                                }
                            }];
}

///
/// Modifies a project in the organization.
/// 
///  @param projectId The ID of the project. 
///
///  @param projectUpdateRequest The project update request payload. 
///
///  @returns OAIProject*
///
-(NSURLSessionTask*) modifyProjectWithProjectId: (NSString*) projectId
    projectUpdateRequest: (OAIProjectUpdateRequest*) projectUpdateRequest
    completionHandler: (void (^)(OAIProject* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'projectUpdateRequest' is set
    if (projectUpdateRequest == nil) {
        NSParameterAssert(projectUpdateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectUpdateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
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
    bodyParam = projectUpdateRequest;

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
                              responseType: @"OAIProject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProject*)data, error);
                                }
                            }];
}

///
/// Modifies a user's role in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param userId The ID of the user. 
///
///  @param projectUserUpdateRequest The project user update request payload. 
///
///  @returns OAIProjectUser*
///
-(NSURLSessionTask*) modifyProjectUserWithProjectId: (NSString*) projectId
    userId: (NSString*) userId
    projectUserUpdateRequest: (OAIProjectUserUpdateRequest*) projectUserUpdateRequest
    completionHandler: (void (^)(OAIProjectUser* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'projectUserUpdateRequest' is set
    if (projectUserUpdateRequest == nil) {
        NSParameterAssert(projectUserUpdateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectUserUpdateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/users/{user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
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
    bodyParam = projectUserUpdateRequest;

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
                              responseType: @"OAIProjectUser*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectUser*)data, error);
                                }
                            }];
}

///
/// Retrieves a project.
/// 
///  @param projectId The ID of the project. 
///
///  @returns OAIProject*
///
-(NSURLSessionTask*) retrieveProjectWithProjectId: (NSString*) projectId
    completionHandler: (void (^)(OAIProject* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
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
                              responseType: @"OAIProject*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProject*)data, error);
                                }
                            }];
}

///
/// Retrieves an API key in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param keyId The ID of the API key. 
///
///  @returns OAIProjectApiKey*
///
-(NSURLSessionTask*) retrieveProjectApiKeyWithProjectId: (NSString*) projectId
    keyId: (NSString*) keyId
    completionHandler: (void (^)(OAIProjectApiKey* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'keyId' is set
    if (keyId == nil) {
        NSParameterAssert(keyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keyId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/api_keys/{key_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (keyId != nil) {
        pathParams[@"key_id"] = keyId;
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
                              responseType: @"OAIProjectApiKey*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectApiKey*)data, error);
                                }
                            }];
}

///
/// Retrieves a service account in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param serviceAccountId The ID of the service account. 
///
///  @returns OAIProjectServiceAccount*
///
-(NSURLSessionTask*) retrieveProjectServiceAccountWithProjectId: (NSString*) projectId
    serviceAccountId: (NSString*) serviceAccountId
    completionHandler: (void (^)(OAIProjectServiceAccount* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'serviceAccountId' is set
    if (serviceAccountId == nil) {
        NSParameterAssert(serviceAccountId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"serviceAccountId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/service_accounts/{service_account_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (serviceAccountId != nil) {
        pathParams[@"service_account_id"] = serviceAccountId;
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
                              responseType: @"OAIProjectServiceAccount*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectServiceAccount*)data, error);
                                }
                            }];
}

///
/// Retrieves a user in the project.
/// 
///  @param projectId The ID of the project. 
///
///  @param userId The ID of the user. 
///
///  @returns OAIProjectUser*
///
-(NSURLSessionTask*) retrieveProjectUserWithProjectId: (NSString*) projectId
    userId: (NSString*) userId
    completionHandler: (void (^)(OAIProjectUser* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'userId' is set
    if (userId == nil) {
        NSParameterAssert(userId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"userId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/users/{user_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (userId != nil) {
        pathParams[@"user_id"] = userId;
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
                              responseType: @"OAIProjectUser*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectUser*)data, error);
                                }
                            }];
}

///
/// Updates a project rate limit.
/// 
///  @param projectId The ID of the project. 
///
///  @param rateLimitId The ID of the rate limit. 
///
///  @param projectRateLimitUpdateRequest The project rate limit update request payload. 
///
///  @returns OAIProjectRateLimit*
///
-(NSURLSessionTask*) updateProjectRateLimitsWithProjectId: (NSString*) projectId
    rateLimitId: (NSString*) rateLimitId
    projectRateLimitUpdateRequest: (OAIProjectRateLimitUpdateRequest*) projectRateLimitUpdateRequest
    completionHandler: (void (^)(OAIProjectRateLimit* output, NSError* error)) handler {
    // verify the required parameter 'projectId' is set
    if (projectId == nil) {
        NSParameterAssert(projectId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'rateLimitId' is set
    if (rateLimitId == nil) {
        NSParameterAssert(rateLimitId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"rateLimitId"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'projectRateLimitUpdateRequest' is set
    if (projectRateLimitUpdateRequest == nil) {
        NSParameterAssert(projectRateLimitUpdateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"projectRateLimitUpdateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIProjectsApiErrorDomain code:kOAIProjectsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/projects/{project_id}/rate_limits/{rate_limit_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (projectId != nil) {
        pathParams[@"project_id"] = projectId;
    }
    if (rateLimitId != nil) {
        pathParams[@"rate_limit_id"] = rateLimitId;
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
    bodyParam = projectRateLimitUpdateRequest;

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
                              responseType: @"OAIProjectRateLimit*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIProjectRateLimit*)data, error);
                                }
                            }];
}



@end
