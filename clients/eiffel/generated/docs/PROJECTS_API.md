# PROJECTS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**archive_project**](PROJECTS_API.md#archive_project) | **Post** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**create_project**](PROJECTS_API.md#create_project) | **Post** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**create_project_service_account**](PROJECTS_API.md#create_project_service_account) | **Post** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**create_project_user**](PROJECTS_API.md#create_project_user) | **Post** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**delete_project_api_key**](PROJECTS_API.md#delete_project_api_key) | **Delete** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**delete_project_service_account**](PROJECTS_API.md#delete_project_service_account) | **Delete** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**delete_project_user**](PROJECTS_API.md#delete_project_user) | **Delete** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**list_project_api_keys**](PROJECTS_API.md#list_project_api_keys) | **Get** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**list_project_rate_limits**](PROJECTS_API.md#list_project_rate_limits) | **Get** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**list_project_service_accounts**](PROJECTS_API.md#list_project_service_accounts) | **Get** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**list_project_users**](PROJECTS_API.md#list_project_users) | **Get** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**list_projects**](PROJECTS_API.md#list_projects) | **Get** /organization/projects | Returns a list of projects.
[**modify_project**](PROJECTS_API.md#modify_project) | **Post** /organization/projects/{project_id} | Modifies a project in the organization.
[**modify_project_user**](PROJECTS_API.md#modify_project_user) | **Post** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieve_project**](PROJECTS_API.md#retrieve_project) | **Get** /organization/projects/{project_id} | Retrieves a project.
[**retrieve_project_api_key**](PROJECTS_API.md#retrieve_project_api_key) | **Get** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieve_project_service_account**](PROJECTS_API.md#retrieve_project_service_account) | **Get** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieve_project_user**](PROJECTS_API.md#retrieve_project_user) | **Get** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**update_project_rate_limits**](PROJECTS_API.md#update_project_rate_limits) | **Post** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **archive_project**
> archive_project (project_id: STRING_32 ): detachable PROJECT


Archives a project in the organization. Archived projects cannot be used or updated.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]

### Return type

[**PROJECT**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project**
> create_project (project_create_request: PROJECT_CREATE_REQUEST ): detachable PROJECT


Create a new project in the organization. Projects can be created and archived, but cannot be deleted.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_create_request** | [**PROJECT_CREATE_REQUEST**](PROJECT_CREATE_REQUEST.md)| The project create request payload. | 

### Return type

[**PROJECT**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project_service_account**
> create_project_service_account (project_id: STRING_32 ; project_service_account_create_request: PROJECT_SERVICE_ACCOUNT_CREATE_REQUEST ): detachable PROJECT_SERVICE_ACCOUNT_CREATE_RESPONSE


Creates a new service account in the project. This also returns an unredacted API key for the service account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **project_service_account_create_request** | [**PROJECT_SERVICE_ACCOUNT_CREATE_REQUEST**](PROJECT_SERVICE_ACCOUNT_CREATE_REQUEST.md)| The project service account create request payload. | 

### Return type

[**PROJECT_SERVICE_ACCOUNT_CREATE_RESPONSE**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project_user**
> create_project_user (project_id: STRING_32 ; project_user_create_request: PROJECT_USER_CREATE_REQUEST ): detachable PROJECT_USER


Adds a user to the project. Users must already be members of the organization to be added to a project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **project_user_create_request** | [**PROJECT_USER_CREATE_REQUEST**](PROJECT_USER_CREATE_REQUEST.md)| The project user create request payload. | 

### Return type

[**PROJECT_USER**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_api_key**
> delete_project_api_key (project_id: STRING_32 ; key_id: STRING_32 ): detachable PROJECT_API_KEY_DELETE_RESPONSE


Deletes an API key from the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **key_id** | **STRING_32**| The ID of the API key. | [default to null]

### Return type

[**PROJECT_API_KEY_DELETE_RESPONSE**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_service_account**
> delete_project_service_account (project_id: STRING_32 ; service_account_id: STRING_32 ): detachable PROJECT_SERVICE_ACCOUNT_DELETE_RESPONSE


Deletes a service account from the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **service_account_id** | **STRING_32**| The ID of the service account. | [default to null]

### Return type

[**PROJECT_SERVICE_ACCOUNT_DELETE_RESPONSE**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_user**
> delete_project_user (project_id: STRING_32 ; user_id: STRING_32 ): detachable PROJECT_USER_DELETE_RESPONSE


Deletes a user from the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **user_id** | **STRING_32**| The ID of the user. | [default to null]

### Return type

[**PROJECT_USER_DELETE_RESPONSE**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_api_keys**
> list_project_api_keys (project_id: STRING_32 ; limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ): detachable PROJECT_API_KEY_LIST_RESPONSE


Returns a list of API keys in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**PROJECT_API_KEY_LIST_RESPONSE**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_rate_limits**
> list_project_rate_limits (project_id: STRING_32 ; limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ; before:  detachable STRING_32 ): detachable PROJECT_RATE_LIMIT_LIST_RESPONSE


Returns the rate limits per model for a project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **before** | **STRING_32**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] [default to null]

### Return type

[**PROJECT_RATE_LIMIT_LIST_RESPONSE**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_service_accounts**
> list_project_service_accounts (project_id: STRING_32 ; limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ): detachable PROJECT_SERVICE_ACCOUNT_LIST_RESPONSE


Returns a list of service accounts in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**PROJECT_SERVICE_ACCOUNT_LIST_RESPONSE**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_users**
> list_project_users (project_id: STRING_32 ; limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ): detachable PROJECT_USER_LIST_RESPONSE


Returns a list of users in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]

### Return type

[**PROJECT_USER_LIST_RESPONSE**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_projects**
> list_projects (limit:  detachable INTEGER_32 ; after:  detachable STRING_32 ; include_archived:  detachable BOOLEAN ): detachable PROJECT_LIST_RESPONSE


Returns a list of projects.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **STRING_32**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] [default to null]
 **include_archived** | **BOOLEAN**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false]

### Return type

[**PROJECT_LIST_RESPONSE**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_project**
> modify_project (project_id: STRING_32 ; project_update_request: PROJECT_UPDATE_REQUEST ): detachable PROJECT


Modifies a project in the organization.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **project_update_request** | [**PROJECT_UPDATE_REQUEST**](PROJECT_UPDATE_REQUEST.md)| The project update request payload. | 

### Return type

[**PROJECT**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_project_user**
> modify_project_user (project_id: STRING_32 ; user_id: STRING_32 ; project_user_update_request: PROJECT_USER_UPDATE_REQUEST ): detachable PROJECT_USER


Modifies a user's role in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **user_id** | **STRING_32**| The ID of the user. | [default to null]
 **project_user_update_request** | [**PROJECT_USER_UPDATE_REQUEST**](PROJECT_USER_UPDATE_REQUEST.md)| The project user update request payload. | 

### Return type

[**PROJECT_USER**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project**
> retrieve_project (project_id: STRING_32 ): detachable PROJECT


Retrieves a project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]

### Return type

[**PROJECT**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project_api_key**
> retrieve_project_api_key (project_id: STRING_32 ; key_id: STRING_32 ): detachable PROJECT_API_KEY


Retrieves an API key in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **key_id** | **STRING_32**| The ID of the API key. | [default to null]

### Return type

[**PROJECT_API_KEY**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project_service_account**
> retrieve_project_service_account (project_id: STRING_32 ; service_account_id: STRING_32 ): detachable PROJECT_SERVICE_ACCOUNT


Retrieves a service account in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **service_account_id** | **STRING_32**| The ID of the service account. | [default to null]

### Return type

[**PROJECT_SERVICE_ACCOUNT**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project_user**
> retrieve_project_user (project_id: STRING_32 ; user_id: STRING_32 ): detachable PROJECT_USER


Retrieves a user in the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **user_id** | **STRING_32**| The ID of the user. | [default to null]

### Return type

[**PROJECT_USER**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_project_rate_limits**
> update_project_rate_limits (project_id: STRING_32 ; rate_limit_id: STRING_32 ; project_rate_limit_update_request: PROJECT_RATE_LIMIT_UPDATE_REQUEST ): detachable PROJECT_RATE_LIMIT


Updates a project rate limit.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **STRING_32**| The ID of the project. | [default to null]
 **rate_limit_id** | **STRING_32**| The ID of the rate limit. | [default to null]
 **project_rate_limit_update_request** | [**PROJECT_RATE_LIMIT_UPDATE_REQUEST**](PROJECT_RATE_LIMIT_UPDATE_REQUEST.md)| The project rate limit update request payload. | 

### Return type

[**PROJECT_RATE_LIMIT**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

