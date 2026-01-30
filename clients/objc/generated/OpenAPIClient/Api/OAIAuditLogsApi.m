#import "OAIAuditLogsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAuditLogEventType.h"
#import "OAIListAuditLogsEffectiveAtParameter.h"
#import "OAIListAuditLogsResponse.h"


@interface OAIAuditLogsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIAuditLogsApi

NSString* kOAIAuditLogsApiErrorDomain = @"OAIAuditLogsApiErrorDomain";
NSInteger kOAIAuditLogsApiMissingParamErrorCode = 234513;

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
/// List user actions and configuration changes within this organization.
/// 
///  @param effectiveAt Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
///
///  @param projectIds Return only events for these projects. (optional)
///
///  @param eventTypes Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
///
///  @param actorIds Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
///
///  @param actorEmails Return only events performed by users with these emails. (optional)
///
///  @param resourceIds Return only events performed on these targets. For example, a project ID updated. (optional)
///
///  @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to @20)
///
///  @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
///
///  @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)
///
///  @returns OAIListAuditLogsResponse*
///
-(NSURLSessionTask*) listAuditLogsWithEffectiveAt: (OAIListAuditLogsEffectiveAtParameter) effectiveAt
    projectIds: (NSArray<NSString*>*) projectIds
    eventTypes: (NSArray<OAIAuditLogEventType>*) eventTypes
    actorIds: (NSArray<NSString*>*) actorIds
    actorEmails: (NSArray<NSString*>*) actorEmails
    resourceIds: (NSArray<NSString*>*) resourceIds
    limit: (NSNumber*) limit
    after: (NSString*) after
    before: (NSString*) before
    completionHandler: (void (^)(OAIListAuditLogsResponse* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/organization/audit_logs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (effectiveAt != nil) {
        queryParams[@"effective_at"] = effectiveAt;
    }
    if (projectIds != nil) {
        queryParams[@"project_ids[]"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: projectIds format: @"multi"];
    }
    if (eventTypes != nil) {
        queryParams[@"event_types[]"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: eventTypes format: @"multi"];
    }
    if (actorIds != nil) {
        queryParams[@"actor_ids[]"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: actorIds format: @"multi"];
    }
    if (actorEmails != nil) {
        queryParams[@"actor_emails[]"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: actorEmails format: @"multi"];
    }
    if (resourceIds != nil) {
        queryParams[@"resource_ids[]"] = [[OAIQueryParamCollection alloc] initWithValuesAndFormat: resourceIds format: @"multi"];
    }
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
                              responseType: @"OAIListAuditLogsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIListAuditLogsResponse*)data, error);
                                }
                            }];
}



@end
