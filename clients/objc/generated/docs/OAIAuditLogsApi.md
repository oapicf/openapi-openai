# OAIAuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](OAIAuditLogsApi.md#listauditlogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.


# **listAuditLogs**
```objc
-(NSURLSessionTask*) listAuditLogsWithEffectiveAt: (OAIListAuditLogsEffectiveAtParameter) effectiveAt
    projectIds: (NSArray<NSString*>*) projectIds
    eventTypes: (NSArray<OAIAuditLogEventType>*) eventTypes
    actorIds: (NSArray<NSString*>*) actorIds
    actorEmails: (NSArray<NSString*>*) actorEmails
    resourceIds: (NSArray<NSString*>*) resourceIds
    limit: (NSNumber*) limit
    after: (NSString*) after
    before: (NSString*) before
        completionHandler: (void (^)(OAIListAuditLogsResponse* output, NSError* error)) handler;
```

List user actions and configuration changes within this organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAIListAuditLogsEffectiveAtParameter effectiveAt = [[OAIListAuditLogsEffectiveAtParameter alloc] init]; // Return only events whose `effective_at` (Unix seconds) is in this range. (optional)
NSArray<NSString*>* projectIds = @[@"projectIds_example"]; // Return only events for these projects. (optional)
NSArray<OAIAuditLogEventType>* eventTypes = @[[[OAIAuditLogEventType alloc] init]]; // Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). (optional)
NSArray<NSString*>* actorIds = @[@"actorIds_example"]; // Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. (optional)
NSArray<NSString*>* actorEmails = @[@"actorEmails_example"]; // Return only events performed by users with these emails. (optional)
NSArray<NSString*>* resourceIds = @[@"resourceIds_example"]; // Return only events performed on these targets. For example, a project ID updated. (optional)
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

OAIAuditLogsApi*apiInstance = [[OAIAuditLogsApi alloc] init];

// List user actions and configuration changes within this organization.
[apiInstance listAuditLogsWithEffectiveAt:effectiveAt
              projectIds:projectIds
              eventTypes:eventTypes
              actorIds:actorIds
              actorEmails:actorEmails
              resourceIds:resourceIds
              limit:limit
              after:after
              before:before
          completionHandler: ^(OAIListAuditLogsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAuditLogsApi->listAuditLogs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**OAIListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional] 
 **projectIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only events for these projects. | [optional] 
 **eventTypes** | [**NSArray&lt;OAIAuditLogEventType&gt;***](OAIAuditLogEventType*.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional] 
 **actorIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional] 
 **actorEmails** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only events performed by users with these emails. | [optional] 
 **resourceIds** | [**NSArray&lt;NSString*&gt;***](NSString*.md)| Return only events performed on these targets. For example, a project ID updated. | [optional] 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**OAIListAuditLogsResponse***](OAIListAuditLogsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

