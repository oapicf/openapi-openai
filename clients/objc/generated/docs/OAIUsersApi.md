# OAIUsersApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](OAIUsersApi.md#deleteuser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**listUsers**](OAIUsersApi.md#listusers) | **GET** /organization/users | Lists all of the users in the organization.
[**modifyUser**](OAIUsersApi.md#modifyuser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieveUser**](OAIUsersApi.md#retrieveuser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **deleteUser**
```objc
-(NSURLSessionTask*) deleteUserWithUserId: (NSString*) userId
        completionHandler: (void (^)(OAIUserDeleteResponse* output, NSError* error)) handler;
```

Deletes a user from the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* userId = @"userId_example"; // The ID of the user.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Deletes a user from the organization.
[apiInstance deleteUserWithUserId:userId
          completionHandler: ^(OAIUserDeleteResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->deleteUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSString***| The ID of the user. | 

### Return type

[**OAIUserDeleteResponse***](OAIUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUsers**
```objc
-(NSURLSessionTask*) listUsersWithLimit: (NSNumber*) limit
    after: (NSString*) after
        completionHandler: (void (^)(OAIUserListResponse* output, NSError* error)) handler;
```

Lists all of the users in the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Lists all of the users in the organization.
[apiInstance listUsersWithLimit:limit
              after:after
          completionHandler: ^(OAIUserListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->listUsers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**OAIUserListResponse***](OAIUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyUser**
```objc
-(NSURLSessionTask*) modifyUserWithUserId: (NSString*) userId
    userRoleUpdateRequest: (OAIUserRoleUpdateRequest*) userRoleUpdateRequest
        completionHandler: (void (^)(OAIUser* output, NSError* error)) handler;
```

Modifies a user's role in the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* userId = @"userId_example"; // The ID of the user.
OAIUserRoleUpdateRequest* userRoleUpdateRequest = [[OAIUserRoleUpdateRequest alloc] init]; // The new user role to modify. This must be one of `owner` or `member`.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Modifies a user's role in the organization.
[apiInstance modifyUserWithUserId:userId
              userRoleUpdateRequest:userRoleUpdateRequest
          completionHandler: ^(OAIUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->modifyUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSString***| The ID of the user. | 
 **userRoleUpdateRequest** | [**OAIUserRoleUpdateRequest***](OAIUserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | 

### Return type

[**OAIUser***](OAIUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveUser**
```objc
-(NSURLSessionTask*) retrieveUserWithUserId: (NSString*) userId
        completionHandler: (void (^)(OAIUser* output, NSError* error)) handler;
```

Retrieves a user by their identifier.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* userId = @"userId_example"; // The ID of the user.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// Retrieves a user by their identifier.
[apiInstance retrieveUserWithUserId:userId
          completionHandler: ^(OAIUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->retrieveUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **NSString***| The ID of the user. | 

### Return type

[**OAIUser***](OAIUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

