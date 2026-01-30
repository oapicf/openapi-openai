# OAIInvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvite**](OAIInvitesApi.md#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**inviteUser**](OAIInvitesApi.md#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**listInvites**](OAIInvitesApi.md#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieveInvite**](OAIInvitesApi.md#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **deleteInvite**
```objc
-(NSURLSessionTask*) deleteInviteWithInviteId: (NSString*) inviteId
        completionHandler: (void (^)(OAIInviteDeleteResponse* output, NSError* error)) handler;
```

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* inviteId = @"inviteId_example"; // The ID of the invite to delete.

OAIInvitesApi*apiInstance = [[OAIInvitesApi alloc] init];

// Delete an invite. If the invite has already been accepted, it cannot be deleted.
[apiInstance deleteInviteWithInviteId:inviteId
          completionHandler: ^(OAIInviteDeleteResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIInvitesApi->deleteInvite: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **NSString***| The ID of the invite to delete. | 

### Return type

[**OAIInviteDeleteResponse***](OAIInviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **inviteUser**
```objc
-(NSURLSessionTask*) inviteUserWithInviteRequest: (OAIInviteRequest*) inviteRequest
        completionHandler: (void (^)(OAIInvite* output, NSError* error)) handler;
```

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAIInviteRequest* inviteRequest = [[OAIInviteRequest alloc] init]; // The invite request payload.

OAIInvitesApi*apiInstance = [[OAIInvitesApi alloc] init];

// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[apiInstance inviteUserWithInviteRequest:inviteRequest
          completionHandler: ^(OAIInvite* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIInvitesApi->inviteUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteRequest** | [**OAIInviteRequest***](OAIInviteRequest.md)| The invite request payload. | 

### Return type

[**OAIInvite***](OAIInvite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listInvites**
```objc
-(NSURLSessionTask*) listInvitesWithLimit: (NSNumber*) limit
    after: (NSString*) after
        completionHandler: (void (^)(OAIInviteListResponse* output, NSError* error)) handler;
```

Returns a list of invites in the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

OAIInvitesApi*apiInstance = [[OAIInvitesApi alloc] init];

// Returns a list of invites in the organization.
[apiInstance listInvitesWithLimit:limit
              after:after
          completionHandler: ^(OAIInviteListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIInvitesApi->listInvites: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**OAIInviteListResponse***](OAIInviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveInvite**
```objc
-(NSURLSessionTask*) retrieveInviteWithInviteId: (NSString*) inviteId
        completionHandler: (void (^)(OAIInvite* output, NSError* error)) handler;
```

Retrieves an invite.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* inviteId = @"inviteId_example"; // The ID of the invite to retrieve.

OAIInvitesApi*apiInstance = [[OAIInvitesApi alloc] init];

// Retrieves an invite.
[apiInstance retrieveInviteWithInviteId:inviteId
          completionHandler: ^(OAIInvite* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIInvitesApi->retrieveInvite: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | **NSString***| The ID of the invite to retrieve. | 

### Return type

[**OAIInvite***](OAIInvite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

