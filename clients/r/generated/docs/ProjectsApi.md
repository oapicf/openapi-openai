# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ArchiveProject**](ProjectsApi.md#ArchiveProject) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**CreateProject**](ProjectsApi.md#CreateProject) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**CreateProjectServiceAccount**](ProjectsApi.md#CreateProjectServiceAccount) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**CreateProjectUser**](ProjectsApi.md#CreateProjectUser) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**DeleteProjectApiKey**](ProjectsApi.md#DeleteProjectApiKey) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**DeleteProjectServiceAccount**](ProjectsApi.md#DeleteProjectServiceAccount) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**DeleteProjectUser**](ProjectsApi.md#DeleteProjectUser) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**ListProjectApiKeys**](ProjectsApi.md#ListProjectApiKeys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**ListProjectRateLimits**](ProjectsApi.md#ListProjectRateLimits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**ListProjectServiceAccounts**](ProjectsApi.md#ListProjectServiceAccounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**ListProjectUsers**](ProjectsApi.md#ListProjectUsers) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**ListProjects**](ProjectsApi.md#ListProjects) | **GET** /organization/projects | Returns a list of projects.
[**ModifyProject**](ProjectsApi.md#ModifyProject) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**ModifyProjectUser**](ProjectsApi.md#ModifyProjectUser) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**RetrieveProject**](ProjectsApi.md#RetrieveProject) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**RetrieveProjectApiKey**](ProjectsApi.md#RetrieveProjectApiKey) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**RetrieveProjectServiceAccount**](ProjectsApi.md#RetrieveProjectServiceAccount) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**RetrieveProjectUser**](ProjectsApi.md#RetrieveProjectUser) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**UpdateProjectRateLimits**](ProjectsApi.md#UpdateProjectRateLimits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **ArchiveProject**
> Project ArchiveProject(project_id)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example
```R
library(openapi)

# Archives a project in the organization. Archived projects cannot be used or updated.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ArchiveProject(var_project_iddata_file = "result.txt")
result <- api_instance$ArchiveProject(var_project_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project archived successfully. |  -  |

# **CreateProject**
> Project CreateProject(project_create_request)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example
```R
library(openapi)

# Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
#
# prepare function argument(s)
var_project_create_request <- ProjectCreateRequest$new("name_example") # ProjectCreateRequest | The project create request payload.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateProject(var_project_create_requestdata_file = "result.txt")
result <- api_instance$CreateProject(var_project_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_create_request** | [**ProjectCreateRequest**](ProjectCreateRequest.md)| The project create request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project created successfully. |  -  |

# **CreateProjectServiceAccount**
> ProjectServiceAccountCreateResponse CreateProjectServiceAccount(project_id, project_service_account_create_request)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example
```R
library(openapi)

# Creates a new service account in the project. This also returns an unredacted API key for the service account.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_project_service_account_create_request <- ProjectServiceAccountCreateRequest$new("name_example") # ProjectServiceAccountCreateRequest | The project service account create request payload.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateProjectServiceAccount(var_project_id, var_project_service_account_create_requestdata_file = "result.txt")
result <- api_instance$CreateProjectServiceAccount(var_project_id, var_project_service_account_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **project_service_account_create_request** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | 

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account created successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

# **CreateProjectUser**
> ProjectUser CreateProjectUser(project_id, project_user_create_request)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example
```R
library(openapi)

# Adds a user to the project. Users must already be members of the organization to be added to a project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_project_user_create_request <- ProjectUserCreateRequest$new("user_id_example", "owner") # ProjectUserCreateRequest | The project user create request payload.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateProjectUser(var_project_id, var_project_user_create_requestdata_file = "result.txt")
result <- api_instance$CreateProjectUser(var_project_id, var_project_user_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **project_user_create_request** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User added to project successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

# **DeleteProjectApiKey**
> ProjectApiKeyDeleteResponse DeleteProjectApiKey(project_id, key_id)

Deletes an API key from the project.

### Example
```R
library(openapi)

# Deletes an API key from the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_key_id <- "key_id_example" # character | The ID of the API key.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteProjectApiKey(var_project_id, var_key_iddata_file = "result.txt")
result <- api_instance$DeleteProjectApiKey(var_project_id, var_key_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **key_id** | **character**| The ID of the API key. | 

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key deleted successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

# **DeleteProjectServiceAccount**
> ProjectServiceAccountDeleteResponse DeleteProjectServiceAccount(project_id, service_account_id)

Deletes a service account from the project.

### Example
```R
library(openapi)

# Deletes a service account from the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_service_account_id <- "service_account_id_example" # character | The ID of the service account.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteProjectServiceAccount(var_project_id, var_service_account_iddata_file = "result.txt")
result <- api_instance$DeleteProjectServiceAccount(var_project_id, var_service_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **service_account_id** | **character**| The ID of the service account. | 

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account deleted successfully. |  -  |

# **DeleteProjectUser**
> ProjectUserDeleteResponse DeleteProjectUser(project_id, user_id)

Deletes a user from the project.

### Example
```R
library(openapi)

# Deletes a user from the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_user_id <- "user_id_example" # character | The ID of the user.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteProjectUser(var_project_id, var_user_iddata_file = "result.txt")
result <- api_instance$DeleteProjectUser(var_project_id, var_user_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **user_id** | **character**| The ID of the user. | 

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user deleted successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

# **ListProjectApiKeys**
> ProjectApiKeyListResponse ListProjectApiKeys(project_id, limit = 20, after = var.after)

Returns a list of API keys in the project.

### Example
```R
library(openapi)

# Returns a list of API keys in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListProjectApiKeys(var_project_id, limit = var_limit, after = var_afterdata_file = "result.txt")
result <- api_instance$ListProjectApiKeys(var_project_id, limit = var_limit, after = var_after)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API keys listed successfully. |  -  |

# **ListProjectRateLimits**
> ProjectRateLimitListResponse ListProjectRateLimits(project_id, limit = 100, after = var.after, before = var.before)

Returns the rate limits per model for a project.

### Example
```R
library(openapi)

# Returns the rate limits per model for a project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_limit <- 100 # integer | A limit on the number of objects to be returned. The default is 100.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_before <- "before_example" # character | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  (Optional)

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListProjectRateLimits(var_project_id, limit = var_limit, after = var_after, before = var_beforedata_file = "result.txt")
result <- api_instance$ListProjectRateLimits(var_project_id, limit = var_limit, after = var_after, before = var_before)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **limit** | **integer**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **character**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limits listed successfully. |  -  |

# **ListProjectServiceAccounts**
> ProjectServiceAccountListResponse ListProjectServiceAccounts(project_id, limit = 20, after = var.after)

Returns a list of service accounts in the project.

### Example
```R
library(openapi)

# Returns a list of service accounts in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListProjectServiceAccounts(var_project_id, limit = var_limit, after = var_afterdata_file = "result.txt")
result <- api_instance$ListProjectServiceAccounts(var_project_id, limit = var_limit, after = var_after)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service accounts listed successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

# **ListProjectUsers**
> ProjectUserListResponse ListProjectUsers(project_id, limit = 20, after = var.after)

Returns a list of users in the project.

### Example
```R
library(openapi)

# Returns a list of users in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListProjectUsers(var_project_id, limit = var_limit, after = var_afterdata_file = "result.txt")
result <- api_instance$ListProjectUsers(var_project_id, limit = var_limit, after = var_after)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project users listed successfully. |  -  |
| **400** | Error response when project is archived. |  -  |

# **ListProjects**
> ProjectListResponse ListProjects(limit = 20, after = var.after, include_archived = FALSE)

Returns a list of projects.

### Example
```R
library(openapi)

# Returns a list of projects.
#
# prepare function argument(s)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)
var_include_archived <- FALSE # character | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default. (Optional)

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListProjects(limit = var_limit, after = var_after, include_archived = var_include_archiveddata_file = "result.txt")
result <- api_instance$ListProjects(limit = var_limit, after = var_after, include_archived = var_include_archived)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **include_archived** | **character**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to FALSE]

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Projects listed successfully. |  -  |

# **ModifyProject**
> Project ModifyProject(project_id, project_update_request)

Modifies a project in the organization.

### Example
```R
library(openapi)

# Modifies a project in the organization.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_project_update_request <- ProjectUpdateRequest$new("name_example") # ProjectUpdateRequest | The project update request payload.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyProject(var_project_id, var_project_update_requestdata_file = "result.txt")
result <- api_instance$ModifyProject(var_project_id, var_project_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **project_update_request** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project updated successfully. |  -  |
| **400** | Error response when updating the default project. |  -  |

# **ModifyProjectUser**
> ProjectUser ModifyProjectUser(project_id, user_id, project_user_update_request)

Modifies a user's role in the project.

### Example
```R
library(openapi)

# Modifies a user's role in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_user_id <- "user_id_example" # character | The ID of the user.
var_project_user_update_request <- ProjectUserUpdateRequest$new("owner") # ProjectUserUpdateRequest | The project user update request payload.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ModifyProjectUser(var_project_id, var_user_id, var_project_user_update_requestdata_file = "result.txt")
result <- api_instance$ModifyProjectUser(var_project_id, var_user_id, var_project_user_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **user_id** | **character**| The ID of the user. | 
 **project_user_update_request** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user&#39;s role updated successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

# **RetrieveProject**
> Project RetrieveProject(project_id)

Retrieves a project.

### Example
```R
library(openapi)

# Retrieves a project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveProject(var_project_iddata_file = "result.txt")
result <- api_instance$RetrieveProject(var_project_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project retrieved successfully. |  -  |

# **RetrieveProjectApiKey**
> ProjectApiKey RetrieveProjectApiKey(project_id, key_id)

Retrieves an API key in the project.

### Example
```R
library(openapi)

# Retrieves an API key in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_key_id <- "key_id_example" # character | The ID of the API key.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveProjectApiKey(var_project_id, var_key_iddata_file = "result.txt")
result <- api_instance$RetrieveProjectApiKey(var_project_id, var_key_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **key_id** | **character**| The ID of the API key. | 

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project API key retrieved successfully. |  -  |

# **RetrieveProjectServiceAccount**
> ProjectServiceAccount RetrieveProjectServiceAccount(project_id, service_account_id)

Retrieves a service account in the project.

### Example
```R
library(openapi)

# Retrieves a service account in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_service_account_id <- "service_account_id_example" # character | The ID of the service account.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveProjectServiceAccount(var_project_id, var_service_account_iddata_file = "result.txt")
result <- api_instance$RetrieveProjectServiceAccount(var_project_id, var_service_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **service_account_id** | **character**| The ID of the service account. | 

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project service account retrieved successfully. |  -  |

# **RetrieveProjectUser**
> ProjectUser RetrieveProjectUser(project_id, user_id)

Retrieves a user in the project.

### Example
```R
library(openapi)

# Retrieves a user in the project.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_user_id <- "user_id_example" # character | The ID of the user.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveProjectUser(var_project_id, var_user_iddata_file = "result.txt")
result <- api_instance$RetrieveProjectUser(var_project_id, var_user_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **user_id** | **character**| The ID of the user. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project user retrieved successfully. |  -  |

# **UpdateProjectRateLimits**
> ProjectRateLimit UpdateProjectRateLimits(project_id, rate_limit_id, project_rate_limit_update_request)

Updates a project rate limit.

### Example
```R
library(openapi)

# Updates a project rate limit.
#
# prepare function argument(s)
var_project_id <- "project_id_example" # character | The ID of the project.
var_rate_limit_id <- "rate_limit_id_example" # character | The ID of the rate limit.
var_project_rate_limit_update_request <- ProjectRateLimitUpdateRequest$new(123, 123, 123, 123, 123, 123) # ProjectRateLimitUpdateRequest | The project rate limit update request payload.

api_instance <- ProjectsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateProjectRateLimits(var_project_id, var_rate_limit_id, var_project_rate_limit_update_requestdata_file = "result.txt")
result <- api_instance$UpdateProjectRateLimits(var_project_id, var_rate_limit_id, var_project_rate_limit_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **character**| The ID of the project. | 
 **rate_limit_id** | **character**| The ID of the rate limit. | 
 **project_rate_limit_update_request** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | 

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Project rate limit updated successfully. |  -  |
| **400** | Error response for various conditions. |  -  |

