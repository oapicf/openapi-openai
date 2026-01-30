# OAIProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveProject**](OAIProjectsApi.md#archiveproject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**createProject**](OAIProjectsApi.md#createproject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**createProjectServiceAccount**](OAIProjectsApi.md#createprojectserviceaccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**createProjectUser**](OAIProjectsApi.md#createprojectuser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**deleteProjectApiKey**](OAIProjectsApi.md#deleteprojectapikey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**deleteProjectServiceAccount**](OAIProjectsApi.md#deleteprojectserviceaccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**deleteProjectUser**](OAIProjectsApi.md#deleteprojectuser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**listProjectApiKeys**](OAIProjectsApi.md#listprojectapikeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**listProjectRateLimits**](OAIProjectsApi.md#listprojectratelimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**listProjectServiceAccounts**](OAIProjectsApi.md#listprojectserviceaccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**listProjectUsers**](OAIProjectsApi.md#listprojectusers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**listProjects**](OAIProjectsApi.md#listprojects) | **GET** /organization/projects | Returns a list of projects.
[**modifyProject**](OAIProjectsApi.md#modifyproject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modifyProjectUser**](OAIProjectsApi.md#modifyprojectuser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieveProject**](OAIProjectsApi.md#retrieveproject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieveProjectApiKey**](OAIProjectsApi.md#retrieveprojectapikey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieveProjectServiceAccount**](OAIProjectsApi.md#retrieveprojectserviceaccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieveProjectUser**](OAIProjectsApi.md#retrieveprojectuser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**updateProjectRateLimits**](OAIProjectsApi.md#updateprojectratelimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **archiveProject**
```objc
-(NSURLSessionTask*) archiveProjectWithProjectId: (NSString*) projectId
        completionHandler: (void (^)(OAIProject* output, NSError* error)) handler;
```

Archives a project in the organization. Archived projects cannot be used or updated.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Archives a project in the organization. Archived projects cannot be used or updated.
[apiInstance archiveProjectWithProjectId:projectId
          completionHandler: ^(OAIProject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->archiveProject: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 

### Return type

[**OAIProject***](OAIProject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createProject**
```objc
-(NSURLSessionTask*) createProjectWithProjectCreateRequest: (OAIProjectCreateRequest*) projectCreateRequest
        completionHandler: (void (^)(OAIProject* output, NSError* error)) handler;
```

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


OAIProjectCreateRequest* projectCreateRequest = [[OAIProjectCreateRequest alloc] init]; // The project create request payload.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[apiInstance createProjectWithProjectCreateRequest:projectCreateRequest
          completionHandler: ^(OAIProject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->createProject: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectCreateRequest** | [**OAIProjectCreateRequest***](OAIProjectCreateRequest.md)| The project create request payload. | 

### Return type

[**OAIProject***](OAIProject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createProjectServiceAccount**
```objc
-(NSURLSessionTask*) createProjectServiceAccountWithProjectId: (NSString*) projectId
    projectServiceAccountCreateRequest: (OAIProjectServiceAccountCreateRequest*) projectServiceAccountCreateRequest
        completionHandler: (void (^)(OAIProjectServiceAccountCreateResponse* output, NSError* error)) handler;
```

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
OAIProjectServiceAccountCreateRequest* projectServiceAccountCreateRequest = [[OAIProjectServiceAccountCreateRequest alloc] init]; // The project service account create request payload.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Creates a new service account in the project. This also returns an unredacted API key for the service account.
[apiInstance createProjectServiceAccountWithProjectId:projectId
              projectServiceAccountCreateRequest:projectServiceAccountCreateRequest
          completionHandler: ^(OAIProjectServiceAccountCreateResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->createProjectServiceAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **projectServiceAccountCreateRequest** | [**OAIProjectServiceAccountCreateRequest***](OAIProjectServiceAccountCreateRequest.md)| The project service account create request payload. | 

### Return type

[**OAIProjectServiceAccountCreateResponse***](OAIProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **createProjectUser**
```objc
-(NSURLSessionTask*) createProjectUserWithProjectId: (NSString*) projectId
    projectUserCreateRequest: (OAIProjectUserCreateRequest*) projectUserCreateRequest
        completionHandler: (void (^)(OAIProjectUser* output, NSError* error)) handler;
```

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
OAIProjectUserCreateRequest* projectUserCreateRequest = [[OAIProjectUserCreateRequest alloc] init]; // The project user create request payload.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Adds a user to the project. Users must already be members of the organization to be added to a project.
[apiInstance createProjectUserWithProjectId:projectId
              projectUserCreateRequest:projectUserCreateRequest
          completionHandler: ^(OAIProjectUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->createProjectUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **projectUserCreateRequest** | [**OAIProjectUserCreateRequest***](OAIProjectUserCreateRequest.md)| The project user create request payload. | 

### Return type

[**OAIProjectUser***](OAIProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProjectApiKey**
```objc
-(NSURLSessionTask*) deleteProjectApiKeyWithProjectId: (NSString*) projectId
    keyId: (NSString*) keyId
        completionHandler: (void (^)(OAIProjectApiKeyDeleteResponse* output, NSError* error)) handler;
```

Deletes an API key from the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* keyId = @"keyId_example"; // The ID of the API key.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Deletes an API key from the project.
[apiInstance deleteProjectApiKeyWithProjectId:projectId
              keyId:keyId
          completionHandler: ^(OAIProjectApiKeyDeleteResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->deleteProjectApiKey: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **keyId** | **NSString***| The ID of the API key. | 

### Return type

[**OAIProjectApiKeyDeleteResponse***](OAIProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProjectServiceAccount**
```objc
-(NSURLSessionTask*) deleteProjectServiceAccountWithProjectId: (NSString*) projectId
    serviceAccountId: (NSString*) serviceAccountId
        completionHandler: (void (^)(OAIProjectServiceAccountDeleteResponse* output, NSError* error)) handler;
```

Deletes a service account from the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* serviceAccountId = @"serviceAccountId_example"; // The ID of the service account.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Deletes a service account from the project.
[apiInstance deleteProjectServiceAccountWithProjectId:projectId
              serviceAccountId:serviceAccountId
          completionHandler: ^(OAIProjectServiceAccountDeleteResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->deleteProjectServiceAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **serviceAccountId** | **NSString***| The ID of the service account. | 

### Return type

[**OAIProjectServiceAccountDeleteResponse***](OAIProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteProjectUser**
```objc
-(NSURLSessionTask*) deleteProjectUserWithProjectId: (NSString*) projectId
    userId: (NSString*) userId
        completionHandler: (void (^)(OAIProjectUserDeleteResponse* output, NSError* error)) handler;
```

Deletes a user from the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* userId = @"userId_example"; // The ID of the user.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Deletes a user from the project.
[apiInstance deleteProjectUserWithProjectId:projectId
              userId:userId
          completionHandler: ^(OAIProjectUserDeleteResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->deleteProjectUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **userId** | **NSString***| The ID of the user. | 

### Return type

[**OAIProjectUserDeleteResponse***](OAIProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectApiKeys**
```objc
-(NSURLSessionTask*) listProjectApiKeysWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
        completionHandler: (void (^)(OAIProjectApiKeyListResponse* output, NSError* error)) handler;
```

Returns a list of API keys in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Returns a list of API keys in the project.
[apiInstance listProjectApiKeysWithProjectId:projectId
              limit:limit
              after:after
          completionHandler: ^(OAIProjectApiKeyListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->listProjectApiKeys: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**OAIProjectApiKeyListResponse***](OAIProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectRateLimits**
```objc
-(NSURLSessionTask*) listProjectRateLimitsWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
    before: (NSString*) before
        completionHandler: (void (^)(OAIProjectRateLimitListResponse* output, NSError* error)) handler;
```

Returns the rate limits per model for a project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSNumber* limit = @100; // A limit on the number of objects to be returned. The default is 100.  (optional) (default to @100)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSString* before = @"before_example"; // A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (optional)

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Returns the rate limits per model for a project.
[apiInstance listProjectRateLimitsWithProjectId:projectId
              limit:limit
              after:after
              before:before
          completionHandler: ^(OAIProjectRateLimitListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->listProjectRateLimits: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to @100]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **NSString***| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**OAIProjectRateLimitListResponse***](OAIProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectServiceAccounts**
```objc
-(NSURLSessionTask*) listProjectServiceAccountsWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
        completionHandler: (void (^)(OAIProjectServiceAccountListResponse* output, NSError* error)) handler;
```

Returns a list of service accounts in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Returns a list of service accounts in the project.
[apiInstance listProjectServiceAccountsWithProjectId:projectId
              limit:limit
              after:after
          completionHandler: ^(OAIProjectServiceAccountListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->listProjectServiceAccounts: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**OAIProjectServiceAccountListResponse***](OAIProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjectUsers**
```objc
-(NSURLSessionTask*) listProjectUsersWithProjectId: (NSString*) projectId
    limit: (NSNumber*) limit
    after: (NSString*) after
        completionHandler: (void (^)(OAIProjectUserListResponse* output, NSError* error)) handler;
```

Returns a list of users in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Returns a list of users in the project.
[apiInstance listProjectUsersWithProjectId:projectId
              limit:limit
              after:after
          completionHandler: ^(OAIProjectUserListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->listProjectUsers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**OAIProjectUserListResponse***](OAIProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listProjects**
```objc
-(NSURLSessionTask*) listProjectsWithLimit: (NSNumber*) limit
    after: (NSString*) after
    includeArchived: (NSNumber*) includeArchived
        completionHandler: (void (^)(OAIProjectListResponse* output, NSError* error)) handler;
```

Returns a list of projects.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSNumber* limit = @20; // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to @20)
NSString* after = @"after_example"; // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
NSNumber* includeArchived = @(NO); // If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (optional) (default to @(NO))

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Returns a list of projects.
[apiInstance listProjectsWithLimit:limit
              after:after
              includeArchived:includeArchived
          completionHandler: ^(OAIProjectListResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->listProjects: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to @20]
 **after** | **NSString***| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **includeArchived** | **NSNumber***| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to @(NO)]

### Return type

[**OAIProjectListResponse***](OAIProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyProject**
```objc
-(NSURLSessionTask*) modifyProjectWithProjectId: (NSString*) projectId
    projectUpdateRequest: (OAIProjectUpdateRequest*) projectUpdateRequest
        completionHandler: (void (^)(OAIProject* output, NSError* error)) handler;
```

Modifies a project in the organization.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
OAIProjectUpdateRequest* projectUpdateRequest = [[OAIProjectUpdateRequest alloc] init]; // The project update request payload.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Modifies a project in the organization.
[apiInstance modifyProjectWithProjectId:projectId
              projectUpdateRequest:projectUpdateRequest
          completionHandler: ^(OAIProject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->modifyProject: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **projectUpdateRequest** | [**OAIProjectUpdateRequest***](OAIProjectUpdateRequest.md)| The project update request payload. | 

### Return type

[**OAIProject***](OAIProject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyProjectUser**
```objc
-(NSURLSessionTask*) modifyProjectUserWithProjectId: (NSString*) projectId
    userId: (NSString*) userId
    projectUserUpdateRequest: (OAIProjectUserUpdateRequest*) projectUserUpdateRequest
        completionHandler: (void (^)(OAIProjectUser* output, NSError* error)) handler;
```

Modifies a user's role in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* userId = @"userId_example"; // The ID of the user.
OAIProjectUserUpdateRequest* projectUserUpdateRequest = [[OAIProjectUserUpdateRequest alloc] init]; // The project user update request payload.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Modifies a user's role in the project.
[apiInstance modifyProjectUserWithProjectId:projectId
              userId:userId
              projectUserUpdateRequest:projectUserUpdateRequest
          completionHandler: ^(OAIProjectUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->modifyProjectUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **userId** | **NSString***| The ID of the user. | 
 **projectUserUpdateRequest** | [**OAIProjectUserUpdateRequest***](OAIProjectUserUpdateRequest.md)| The project user update request payload. | 

### Return type

[**OAIProjectUser***](OAIProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProject**
```objc
-(NSURLSessionTask*) retrieveProjectWithProjectId: (NSString*) projectId
        completionHandler: (void (^)(OAIProject* output, NSError* error)) handler;
```

Retrieves a project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Retrieves a project.
[apiInstance retrieveProjectWithProjectId:projectId
          completionHandler: ^(OAIProject* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->retrieveProject: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 

### Return type

[**OAIProject***](OAIProject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProjectApiKey**
```objc
-(NSURLSessionTask*) retrieveProjectApiKeyWithProjectId: (NSString*) projectId
    keyId: (NSString*) keyId
        completionHandler: (void (^)(OAIProjectApiKey* output, NSError* error)) handler;
```

Retrieves an API key in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* keyId = @"keyId_example"; // The ID of the API key.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Retrieves an API key in the project.
[apiInstance retrieveProjectApiKeyWithProjectId:projectId
              keyId:keyId
          completionHandler: ^(OAIProjectApiKey* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->retrieveProjectApiKey: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **keyId** | **NSString***| The ID of the API key. | 

### Return type

[**OAIProjectApiKey***](OAIProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProjectServiceAccount**
```objc
-(NSURLSessionTask*) retrieveProjectServiceAccountWithProjectId: (NSString*) projectId
    serviceAccountId: (NSString*) serviceAccountId
        completionHandler: (void (^)(OAIProjectServiceAccount* output, NSError* error)) handler;
```

Retrieves a service account in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* serviceAccountId = @"serviceAccountId_example"; // The ID of the service account.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Retrieves a service account in the project.
[apiInstance retrieveProjectServiceAccountWithProjectId:projectId
              serviceAccountId:serviceAccountId
          completionHandler: ^(OAIProjectServiceAccount* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->retrieveProjectServiceAccount: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **serviceAccountId** | **NSString***| The ID of the service account. | 

### Return type

[**OAIProjectServiceAccount***](OAIProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveProjectUser**
```objc
-(NSURLSessionTask*) retrieveProjectUserWithProjectId: (NSString*) projectId
    userId: (NSString*) userId
        completionHandler: (void (^)(OAIProjectUser* output, NSError* error)) handler;
```

Retrieves a user in the project.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* userId = @"userId_example"; // The ID of the user.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Retrieves a user in the project.
[apiInstance retrieveProjectUserWithProjectId:projectId
              userId:userId
          completionHandler: ^(OAIProjectUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->retrieveProjectUser: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **userId** | **NSString***| The ID of the user. | 

### Return type

[**OAIProjectUser***](OAIProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateProjectRateLimits**
```objc
-(NSURLSessionTask*) updateProjectRateLimitsWithProjectId: (NSString*) projectId
    rateLimitId: (NSString*) rateLimitId
    projectRateLimitUpdateRequest: (OAIProjectRateLimitUpdateRequest*) projectRateLimitUpdateRequest
        completionHandler: (void (^)(OAIProjectRateLimit* output, NSError* error)) handler;
```

Updates a project rate limit.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];


NSString* projectId = @"projectId_example"; // The ID of the project.
NSString* rateLimitId = @"rateLimitId_example"; // The ID of the rate limit.
OAIProjectRateLimitUpdateRequest* projectRateLimitUpdateRequest = [[OAIProjectRateLimitUpdateRequest alloc] init]; // The project rate limit update request payload.

OAIProjectsApi*apiInstance = [[OAIProjectsApi alloc] init];

// Updates a project rate limit.
[apiInstance updateProjectRateLimitsWithProjectId:projectId
              rateLimitId:rateLimitId
              projectRateLimitUpdateRequest:projectRateLimitUpdateRequest
          completionHandler: ^(OAIProjectRateLimit* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIProjectsApi->updateProjectRateLimits: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **NSString***| The ID of the project. | 
 **rateLimitId** | **NSString***| The ID of the rate limit. | 
 **projectRateLimitUpdateRequest** | [**OAIProjectRateLimitUpdateRequest***](OAIProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | 

### Return type

[**OAIProjectRateLimit***](OAIProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

