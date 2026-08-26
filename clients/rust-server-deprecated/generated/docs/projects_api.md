# projects_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
**create-project**](projects_api.md#create-project) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
**list-projects**](projects_api.md#list-projects) | **GET** /organization/projects | Returns a list of projects.
**archive-project**](projects_api.md#archive-project) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
**create-project-service-account**](projects_api.md#create-project-service-account) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
**create-project-user**](projects_api.md#create-project-user) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
**list-project-api-keys**](projects_api.md#list-project-api-keys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
**list-project-rate-limits**](projects_api.md#list-project-rate-limits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
**list-project-service-accounts**](projects_api.md#list-project-service-accounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
**list-project-users**](projects_api.md#list-project-users) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
**modify-project**](projects_api.md#modify-project) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
**retrieve-project**](projects_api.md#retrieve-project) | **GET** /organization/projects/{project_id} | Retrieves a project.
**delete-project-api-key**](projects_api.md#delete-project-api-key) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
**delete-project-service-account**](projects_api.md#delete-project-service-account) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
**delete-project-user**](projects_api.md#delete-project-user) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
**modify-project-user**](projects_api.md#modify-project-user) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user's role in the project.
**retrieve-project-api-key**](projects_api.md#retrieve-project-api-key) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
**retrieve-project-service-account**](projects_api.md#retrieve-project-service-account) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
**retrieve-project-user**](projects_api.md#retrieve-project-user) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
**update-project-rate-limits**](projects_api.md#update-project-rate-limits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **create-project**
> models::Project create-project(ctx, project_create_request)
Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_create_request** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | 

### Return type

[**models::Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list-projects**
> models::ProjectListResponse list-projects(ctx, optional)
Returns a list of projects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **include_archived** | **bool**| If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. | [default to false]

### Return type

[**models::ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **archive-project**
> models::Project archive-project(ctx, project_id)
Archives a project in the organization. Archived projects cannot be used or updated.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 

### Return type

[**models::Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create-project-service-account**
> models::ProjectServiceAccountCreateResponse create-project-service-account(ctx, project_id, project_service_account_create_request)
Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **project_service_account_create_request** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | 

### Return type

[**models::ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create-project-user**
> models::ProjectUser create-project-user(ctx, project_id, project_user_create_request)
Adds a user to the project. Users must already be members of the organization to be added to a project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **project_user_create_request** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | 

### Return type

[**models::ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list-project-api-keys**
> models::ProjectApiKeyListResponse list-project-api-keys(ctx, project_id, optional)
Returns a list of API keys in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **String**| The ID of the project. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 

### Return type

[**models::ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list-project-rate-limits**
> models::ProjectRateLimitListResponse list-project-rate-limits(ctx, project_id, optional)
Returns the rate limits per model for a project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **String**| The ID of the project. | 
 **limit** | **i32**| A limit on the number of objects to be returned. The default is 100.  | [default to 100]
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 
 **before** | **String**| A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  | 

### Return type

[**models::ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list-project-service-accounts**
> models::ProjectServiceAccountListResponse list-project-service-accounts(ctx, project_id, optional)
Returns a list of service accounts in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **String**| The ID of the project. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 

### Return type

[**models::ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list-project-users**
> models::ProjectUserListResponse list-project-users(ctx, project_id, optional)
Returns a list of users in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **String**| The ID of the project. | 
 **limit** | **i32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **after** | **String**| A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  | 

### Return type

[**models::ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify-project**
> models::Project modify-project(ctx, project_id, project_update_request)
Modifies a project in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **project_update_request** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | 

### Return type

[**models::Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve-project**
> models::Project retrieve-project(ctx, project_id)
Retrieves a project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 

### Return type

[**models::Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete-project-api-key**
> models::ProjectApiKeyDeleteResponse delete-project-api-key(ctx, project_id, key_id)
Deletes an API key from the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **key_id** | **String**| The ID of the API key. | 

### Return type

[**models::ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete-project-service-account**
> models::ProjectServiceAccountDeleteResponse delete-project-service-account(ctx, project_id, service_account_id)
Deletes a service account from the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **service_account_id** | **String**| The ID of the service account. | 

### Return type

[**models::ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete-project-user**
> models::ProjectUserDeleteResponse delete-project-user(ctx, project_id, user_id)
Deletes a user from the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **user_id** | **String**| The ID of the user. | 

### Return type

[**models::ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify-project-user**
> models::ProjectUser modify-project-user(ctx, project_id, user_id, project_user_update_request)
Modifies a user's role in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **user_id** | **String**| The ID of the user. | 
  **project_user_update_request** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | 

### Return type

[**models::ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve-project-api-key**
> models::ProjectApiKey retrieve-project-api-key(ctx, project_id, key_id)
Retrieves an API key in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **key_id** | **String**| The ID of the API key. | 

### Return type

[**models::ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve-project-service-account**
> models::ProjectServiceAccount retrieve-project-service-account(ctx, project_id, service_account_id)
Retrieves a service account in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **service_account_id** | **String**| The ID of the service account. | 

### Return type

[**models::ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve-project-user**
> models::ProjectUser retrieve-project-user(ctx, project_id, user_id)
Retrieves a user in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **user_id** | **String**| The ID of the user. | 

### Return type

[**models::ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update-project-rate-limits**
> models::ProjectRateLimit update-project-rate-limits(ctx, project_id, rate_limit_id, project_rate_limit_update_request)
Updates a project rate limit.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **project_id** | **String**| The ID of the project. | 
  **rate_limit_id** | **String**| The ID of the rate limit. | 
  **project_rate_limit_update_request** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | 

### Return type

[**models::ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

