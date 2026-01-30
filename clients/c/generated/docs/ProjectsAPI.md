# ProjectsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProjectsAPI_archiveProject**](ProjectsAPI.md#ProjectsAPI_archiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**ProjectsAPI_createProject**](ProjectsAPI.md#ProjectsAPI_createProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**ProjectsAPI_createProjectServiceAccount**](ProjectsAPI.md#ProjectsAPI_createProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**ProjectsAPI_createProjectUser**](ProjectsAPI.md#ProjectsAPI_createProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**ProjectsAPI_deleteProjectApiKey**](ProjectsAPI.md#ProjectsAPI_deleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**ProjectsAPI_deleteProjectServiceAccount**](ProjectsAPI.md#ProjectsAPI_deleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**ProjectsAPI_deleteProjectUser**](ProjectsAPI.md#ProjectsAPI_deleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**ProjectsAPI_listProjectApiKeys**](ProjectsAPI.md#ProjectsAPI_listProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**ProjectsAPI_listProjectRateLimits**](ProjectsAPI.md#ProjectsAPI_listProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**ProjectsAPI_listProjectServiceAccounts**](ProjectsAPI.md#ProjectsAPI_listProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**ProjectsAPI_listProjectUsers**](ProjectsAPI.md#ProjectsAPI_listProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**ProjectsAPI_listProjects**](ProjectsAPI.md#ProjectsAPI_listProjects) | **GET** /organization/projects | Returns a list of projects.
[**ProjectsAPI_modifyProject**](ProjectsAPI.md#ProjectsAPI_modifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**ProjectsAPI_modifyProjectUser**](ProjectsAPI.md#ProjectsAPI_modifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**ProjectsAPI_retrieveProject**](ProjectsAPI.md#ProjectsAPI_retrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**ProjectsAPI_retrieveProjectApiKey**](ProjectsAPI.md#ProjectsAPI_retrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**ProjectsAPI_retrieveProjectServiceAccount**](ProjectsAPI.md#ProjectsAPI_retrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**ProjectsAPI_retrieveProjectUser**](ProjectsAPI.md#ProjectsAPI_retrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**ProjectsAPI_updateProjectRateLimits**](ProjectsAPI.md#ProjectsAPI_updateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **ProjectsAPI_archiveProject**
```c
// Archives a project in the organization. Archived projects cannot be used or updated.
//
project_t* ProjectsAPI_archiveProject(apiClient_t *apiClient, char *project_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 

### Return type

[project_t](project.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_createProject**
```c
// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
//
project_t* ProjectsAPI_createProject(apiClient_t *apiClient, project_create_request_t *project_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_create_request** | **[project_create_request_t](project_create_request.md) \*** | The project create request payload. | 

### Return type

[project_t](project.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_createProjectServiceAccount**
```c
// Creates a new service account in the project. This also returns an unredacted API key for the service account.
//
project_service_account_create_response_t* ProjectsAPI_createProjectServiceAccount(apiClient_t *apiClient, char *project_id, project_service_account_create_request_t *project_service_account_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**project_service_account_create_request** | **[project_service_account_create_request_t](project_service_account_create_request.md) \*** | The project service account create request payload. | 

### Return type

[project_service_account_create_response_t](project_service_account_create_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_createProjectUser**
```c
// Adds a user to the project. Users must already be members of the organization to be added to a project.
//
project_user_t* ProjectsAPI_createProjectUser(apiClient_t *apiClient, char *project_id, project_user_create_request_t *project_user_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**project_user_create_request** | **[project_user_create_request_t](project_user_create_request.md) \*** | The project user create request payload. | 

### Return type

[project_user_t](project_user.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_deleteProjectApiKey**
```c
// Deletes an API key from the project.
//
project_api_key_delete_response_t* ProjectsAPI_deleteProjectApiKey(apiClient_t *apiClient, char *project_id, char *key_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**key_id** | **char \*** | The ID of the API key. | 

### Return type

[project_api_key_delete_response_t](project_api_key_delete_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_deleteProjectServiceAccount**
```c
// Deletes a service account from the project.
//
project_service_account_delete_response_t* ProjectsAPI_deleteProjectServiceAccount(apiClient_t *apiClient, char *project_id, char *service_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**service_account_id** | **char \*** | The ID of the service account. | 

### Return type

[project_service_account_delete_response_t](project_service_account_delete_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_deleteProjectUser**
```c
// Deletes a user from the project.
//
project_user_delete_response_t* ProjectsAPI_deleteProjectUser(apiClient_t *apiClient, char *project_id, char *user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**user_id** | **char \*** | The ID of the user. | 

### Return type

[project_user_delete_response_t](project_user_delete_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_listProjectApiKeys**
```c
// Returns a list of API keys in the project.
//
project_api_key_list_response_t* ProjectsAPI_listProjectApiKeys(apiClient_t *apiClient, char *project_id, int *limit, char *after);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[project_api_key_list_response_t](project_api_key_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_listProjectRateLimits**
```c
// Returns the rate limits per model for a project.
//
project_rate_limit_list_response_t* ProjectsAPI_listProjectRateLimits(apiClient_t *apiClient, char *project_id, int *limit, char *after, char *before);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**limit** | **int \*** | A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**before** | **char \*** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[project_rate_limit_list_response_t](project_rate_limit_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_listProjectServiceAccounts**
```c
// Returns a list of service accounts in the project.
//
project_service_account_list_response_t* ProjectsAPI_listProjectServiceAccounts(apiClient_t *apiClient, char *project_id, int *limit, char *after);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[project_service_account_list_response_t](project_service_account_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_listProjectUsers**
```c
// Returns a list of users in the project.
//
project_user_list_response_t* ProjectsAPI_listProjectUsers(apiClient_t *apiClient, char *project_id, int *limit, char *after);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[project_user_list_response_t](project_user_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_listProjects**
```c
// Returns a list of projects.
//
project_list_response_t* ProjectsAPI_listProjects(apiClient_t *apiClient, int *limit, char *after, int *include_archived);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**limit** | **int \*** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
**after** | **char \*** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
**include_archived** | **int \*** | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false]

### Return type

[project_list_response_t](project_list_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_modifyProject**
```c
// Modifies a project in the organization.
//
project_t* ProjectsAPI_modifyProject(apiClient_t *apiClient, char *project_id, project_update_request_t *project_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**project_update_request** | **[project_update_request_t](project_update_request.md) \*** | The project update request payload. | 

### Return type

[project_t](project.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_modifyProjectUser**
```c
// Modifies a user's role in the project.
//
project_user_t* ProjectsAPI_modifyProjectUser(apiClient_t *apiClient, char *project_id, char *user_id, project_user_update_request_t *project_user_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**user_id** | **char \*** | The ID of the user. | 
**project_user_update_request** | **[project_user_update_request_t](project_user_update_request.md) \*** | The project user update request payload. | 

### Return type

[project_user_t](project_user.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_retrieveProject**
```c
// Retrieves a project.
//
project_t* ProjectsAPI_retrieveProject(apiClient_t *apiClient, char *project_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 

### Return type

[project_t](project.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_retrieveProjectApiKey**
```c
// Retrieves an API key in the project.
//
project_api_key_t* ProjectsAPI_retrieveProjectApiKey(apiClient_t *apiClient, char *project_id, char *key_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**key_id** | **char \*** | The ID of the API key. | 

### Return type

[project_api_key_t](project_api_key.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_retrieveProjectServiceAccount**
```c
// Retrieves a service account in the project.
//
project_service_account_t* ProjectsAPI_retrieveProjectServiceAccount(apiClient_t *apiClient, char *project_id, char *service_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**service_account_id** | **char \*** | The ID of the service account. | 

### Return type

[project_service_account_t](project_service_account.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_retrieveProjectUser**
```c
// Retrieves a user in the project.
//
project_user_t* ProjectsAPI_retrieveProjectUser(apiClient_t *apiClient, char *project_id, char *user_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**user_id** | **char \*** | The ID of the user. | 

### Return type

[project_user_t](project_user.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsAPI_updateProjectRateLimits**
```c
// Updates a project rate limit.
//
project_rate_limit_t* ProjectsAPI_updateProjectRateLimits(apiClient_t *apiClient, char *project_id, char *rate_limit_id, project_rate_limit_update_request_t *project_rate_limit_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**project_id** | **char \*** | The ID of the project. | 
**rate_limit_id** | **char \*** | The ID of the rate limit. | 
**project_rate_limit_update_request** | **[project_rate_limit_update_request_t](project_rate_limit_update_request.md) \*** | The project rate limit update request payload. | 

### Return type

[project_rate_limit_t](project_rate_limit.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

