#import "OAIInvitesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIInvite.h"
#import "OAIInviteDeleteResponse.h"
#import "OAIInviteListResponse.h"
#import "OAIInviteRequest.h"


@interface OAIInvitesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIInvitesApi

NSString* kOAIInvitesApiErrorDomain = @"OAIInvitesApiErrorDomain";
NSInteger kOAIInvitesApiMissingParamErrorCode = 234513;

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
/// Delete an invite. If the invite has already been accepted, it cannot be deleted.
/// 
///  @param inviteId The ID of the invite to delete. 
///
///  @returns OAIInviteDeleteResponse*
///
-(NSURLSessionTask*) deleteInviteWithInviteId: (NSString*) inviteId
    completionHandler: (void (^)(OAIInviteDeleteResponse* output, NSError* error)) handler {
    // verify the required parameter 'inviteId' is set
    if (inviteId == nil) {
        NSParameterAssert(inviteId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"inviteId"] };
            NSError* error = [NSError errorWithDomain:kOAIInvitesApiErrorDomain code:kOAIInvitesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/invites/{invite_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (inviteId != nil) {
        pathParams[@"invite_id"] = inviteId;
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
                              responseType: @"OAIInviteDeleteResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInviteDeleteResponse*)data, error);
                                }
                            }];
}

///
/// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
/// 
///  @param inviteRequest The invite request payload. 
///
///  @returns OAIInvite*
///
-(NSURLSessionTask*) inviteUserWithInviteRequest: (OAIInviteRequest*) inviteRequest
    completionHandler: (void (^)(OAIInvite* output, NSError* error)) handler {
    // verify the required parameter 'inviteRequest' is set
    if (inviteRequest == nil) {
        NSParameterAssert(inviteRequest);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"inviteRequest"] };
            NSError* error = [NSError errorWithDomain:kOAIInvitesApiErrorDomain code:kOAIInvitesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/invites"];

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
    bodyParam = inviteRequest;

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
                              responseType: @"OAIInvite*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInvite*)data, error);
                                }
                            }];
}

///
/// Returns a list of invites in the organization.
/// 
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @returns OAIInviteListResponse*
///
-(NSURLSessionTask*) listInvitesWithLimit: (NSNumber*) limit
    after: (NSString*) after
    completionHandler: (void (^)(OAIInviteListResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/invites"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

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
                              responseType: @"OAIInviteListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInviteListResponse*)data, error);
                                }
                            }];
}

///
/// Retrieves an invite.
/// 
///  @param inviteId The ID of the invite to retrieve. 
///
///  @returns OAIInvite*
///
-(NSURLSessionTask*) retrieveInviteWithInviteId: (NSString*) inviteId
    completionHandler: (void (^)(OAIInvite* output, NSError* error)) handler {
    // verify the required parameter 'inviteId' is set
    if (inviteId == nil) {
        NSParameterAssert(inviteId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"inviteId"] };
            NSError* error = [NSError errorWithDomain:kOAIInvitesApiErrorDomain code:kOAIInvitesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/invites/{invite_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (inviteId != nil) {
        pathParams[@"invite_id"] = inviteId;
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
                              responseType: @"OAIInvite*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInvite*)data, error);
                                }
                            }];
}



@end
