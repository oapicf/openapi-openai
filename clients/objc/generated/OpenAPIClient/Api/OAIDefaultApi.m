#import "OAIDefaultApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAdminApiKey.h"
#import "OAIAdminApiKeysCreateRequest.h"
#import "OAIAdminApiKeysDelete200Response.h"
#import "OAIApiKeyList.h"


@interface OAIDefaultApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIDefaultApi

NSString* kOAIDefaultApiErrorDomain = @"OAIDefaultApiErrorDomain";
NSInteger kOAIDefaultApiMissingParamErrorCode = 234513;

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
/// Create an organization admin API key
/// Create a new admin-level API key for the organization.
///  @param adminApiKeysCreateRequest  
///
///  @returns OAIAdminApiKey*
///
-(NSURLSessionTask*) adminApiKeysCreateWithAdminApiKeysCreateRequest: (OAIAdminApiKeysCreateRequest*) adminApiKeysCreateRequest
    completionHandler: (void (^)(OAIAdminApiKey* output, NSError* error)) handler {
    // verify the required parameter 'adminApiKeysCreateRequest' is set
    if (adminApiKeysCreateRequest == nil) {
        NSParameterAssert(adminApiKeysCreateRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"adminApiKeysCreateRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIDefaultApiErrorDomain code:kOAIDefaultApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/admin_api_keys"];

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
    bodyParam = adminApiKeysCreateRequest;

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
                              responseType: @"OAIAdminApiKey*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdminApiKey*)data, error);
                                }
                            }];
}

///
/// Delete an organization admin API key
/// Delete the specified admin API key.
///  @param keyId  
///
///  @returns OAIAdminApiKeysDelete200Response*
///
-(NSURLSessionTask*) adminApiKeysDeleteWithKeyId: (NSString*) keyId
    completionHandler: (void (^)(OAIAdminApiKeysDelete200Response* output, NSError* error)) handler {
    // verify the required parameter 'keyId' is set
    if (keyId == nil) {
        NSParameterAssert(keyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keyId"] };
            NSError* error = [NSError errorWithDomain:kOAIDefaultApiErrorDomain code:kOAIDefaultApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/admin_api_keys/{key_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIAdminApiKeysDelete200Response*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdminApiKeysDelete200Response*)data, error);
                                }
                            }];
}

///
/// Retrieve a single organization API key
/// Get details for a specific organization API key by its ID.
///  @param keyId  
///
///  @returns OAIAdminApiKey*
///
-(NSURLSessionTask*) adminApiKeysGetWithKeyId: (NSString*) keyId
    completionHandler: (void (^)(OAIAdminApiKey* output, NSError* error)) handler {
    // verify the required parameter 'keyId' is set
    if (keyId == nil) {
        NSParameterAssert(keyId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"keyId"] };
            NSError* error = [NSError errorWithDomain:kOAIDefaultApiErrorDomain code:kOAIDefaultApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/admin_api_keys/{key_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"OAIAdminApiKey*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAdminApiKey*)data, error);
                                }
                            }];
}

///
/// List organization API keys
/// Retrieve a paginated list of organization admin API keys.
///  @param after  (optional)
///
///  @param order  (optional, default to @"asc")
///
///  @param limit  (optional, default to @20)
///
///  @returns OAIApiKeyList*
///
-(NSURLSessionTask*) adminApiKeysListWithAfter: (NSString*) after
    order: (NSString*) order
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIApiKeyList* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/admin_api_keys"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (after != nil) {
        queryParams[@"after"] = after;
    }
    if (order != nil) {
        queryParams[@"order"] = order;
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
                              responseType: @"OAIApiKeyList*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIApiKeyList*)data, error);
                                }
                            }];
}



@end
