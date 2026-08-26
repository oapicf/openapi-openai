# ProjectsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archive_project**](ProjectsApi.md#archive_project) | **POST** /organization/projects/{project_id}/archive | Archives a project in the organization. Archived projects cannot be used or updated.
[**create_project**](ProjectsApi.md#create_project) | **POST** /organization/projects | Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
[**create_project_service_account**](ProjectsApi.md#create_project_service_account) | **POST** /organization/projects/{project_id}/service_accounts | Creates a new service account in the project. This also returns an unredacted API key for the service account.
[**create_project_user**](ProjectsApi.md#create_project_user) | **POST** /organization/projects/{project_id}/users | Adds a user to the project. Users must already be members of the organization to be added to a project.
[**delete_project_api_key**](ProjectsApi.md#delete_project_api_key) | **DELETE** /organization/projects/{project_id}/api_keys/{key_id} | Deletes an API key from the project.
[**delete_project_service_account**](ProjectsApi.md#delete_project_service_account) | **DELETE** /organization/projects/{project_id}/service_accounts/{service_account_id} | Deletes a service account from the project.
[**delete_project_user**](ProjectsApi.md#delete_project_user) | **DELETE** /organization/projects/{project_id}/users/{user_id} | Deletes a user from the project.
[**list_project_api_keys**](ProjectsApi.md#list_project_api_keys) | **GET** /organization/projects/{project_id}/api_keys | Returns a list of API keys in the project.
[**list_project_rate_limits**](ProjectsApi.md#list_project_rate_limits) | **GET** /organization/projects/{project_id}/rate_limits | Returns the rate limits per model for a project.
[**list_project_service_accounts**](ProjectsApi.md#list_project_service_accounts) | **GET** /organization/projects/{project_id}/service_accounts | Returns a list of service accounts in the project.
[**list_project_users**](ProjectsApi.md#list_project_users) | **GET** /organization/projects/{project_id}/users | Returns a list of users in the project.
[**list_projects**](ProjectsApi.md#list_projects) | **GET** /organization/projects | Returns a list of projects.
[**modify_project**](ProjectsApi.md#modify_project) | **POST** /organization/projects/{project_id} | Modifies a project in the organization.
[**modify_project_user**](ProjectsApi.md#modify_project_user) | **POST** /organization/projects/{project_id}/users/{user_id} | Modifies a user&#39;s role in the project.
[**retrieve_project**](ProjectsApi.md#retrieve_project) | **GET** /organization/projects/{project_id} | Retrieves a project.
[**retrieve_project_api_key**](ProjectsApi.md#retrieve_project_api_key) | **GET** /organization/projects/{project_id}/api_keys/{key_id} | Retrieves an API key in the project.
[**retrieve_project_service_account**](ProjectsApi.md#retrieve_project_service_account) | **GET** /organization/projects/{project_id}/service_accounts/{service_account_id} | Retrieves a service account in the project.
[**retrieve_project_user**](ProjectsApi.md#retrieve_project_user) | **GET** /organization/projects/{project_id}/users/{user_id} | Retrieves a user in the project.
[**update_project_rate_limits**](ProjectsApi.md#update_project_rate_limits) | **POST** /organization/projects/{project_id}/rate_limits/{rate_limit_id} | Updates a project rate limit.


# **archive_project**
> `archive_project`(_api::`ProjectsApi`, `project_id`::`String`; _mediaType=nothing) -> `Project`, `OpenAPI.Clients.ApiResponse` <br/>
> `archive_project`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`; _mediaType=nothing) -> `Channel`{ `Project` }, `OpenAPI.Clients.ApiResponse`

Archives a project in the organization. Archived projects cannot be used or updated.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |

### Return type

[**`Project`**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_project**
> `create_project`(_api::`ProjectsApi`, `project_create_request`::`ProjectCreateRequest`; _mediaType=nothing) -> `Project`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_project`(_api::`ProjectsApi`, response_stream::`Channel`, `project_create_request`::`ProjectCreateRequest`; _mediaType=nothing) -> `Channel`{ `Project` }, `OpenAPI.Clients.ApiResponse`

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_create_request`** | [**`ProjectCreateRequest`**](ProjectCreateRequest.md) | The project create request payload. |

### Return type

[**`Project`**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_project_service_account**
> `create_project_service_account`(_api::`ProjectsApi`, `project_id`::`String`, `project_service_account_create_request`::`ProjectServiceAccountCreateRequest`; _mediaType=nothing) -> `ProjectServiceAccountCreateResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_project_service_account`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `project_service_account_create_request`::`ProjectServiceAccountCreateRequest`; _mediaType=nothing) -> `Channel`{ `ProjectServiceAccountCreateResponse` }, `OpenAPI.Clients.ApiResponse`

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`project_service_account_create_request`** | [**`ProjectServiceAccountCreateRequest`**](ProjectServiceAccountCreateRequest.md) | The project service account create request payload. |

### Return type

[**`ProjectServiceAccountCreateResponse`**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **create_project_user**
> `create_project_user`(_api::`ProjectsApi`, `project_id`::`String`, `project_user_create_request`::`ProjectUserCreateRequest`; _mediaType=nothing) -> `ProjectUser`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_project_user`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `project_user_create_request`::`ProjectUserCreateRequest`; _mediaType=nothing) -> `Channel`{ `ProjectUser` }, `OpenAPI.Clients.ApiResponse`

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`project_user_create_request`** | [**`ProjectUserCreateRequest`**](ProjectUserCreateRequest.md) | The project user create request payload. |

### Return type

[**`ProjectUser`**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_project_api_key**
> `delete_project_api_key`(_api::`ProjectsApi`, `project_id`::`String`, `key_id`::`String`; _mediaType=nothing) -> `ProjectApiKeyDeleteResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_project_api_key`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `key_id`::`String`; _mediaType=nothing) -> `Channel`{ `ProjectApiKeyDeleteResponse` }, `OpenAPI.Clients.ApiResponse`

Deletes an API key from the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`key_id`** | **`String`** | The ID of the API key. |

### Return type

[**`ProjectApiKeyDeleteResponse`**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_project_service_account**
> `delete_project_service_account`(_api::`ProjectsApi`, `project_id`::`String`, `service_account_id`::`String`; _mediaType=nothing) -> `ProjectServiceAccountDeleteResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_project_service_account`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `service_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `ProjectServiceAccountDeleteResponse` }, `OpenAPI.Clients.ApiResponse`

Deletes a service account from the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`service_account_id`** | **`String`** | The ID of the service account. |

### Return type

[**`ProjectServiceAccountDeleteResponse`**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_project_user**
> `delete_project_user`(_api::`ProjectsApi`, `project_id`::`String`, `user_id`::`String`; _mediaType=nothing) -> `ProjectUserDeleteResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `delete_project_user`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `user_id`::`String`; _mediaType=nothing) -> `Channel`{ `ProjectUserDeleteResponse` }, `OpenAPI.Clients.ApiResponse`

Deletes a user from the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`user_id`** | **`String`** | The ID of the user. |

### Return type

[**`ProjectUserDeleteResponse`**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_project_api_keys**
> `list_project_api_keys`(_api::`ProjectsApi`, `project_id`::`String`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `ProjectApiKeyListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_project_api_keys`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `Channel`{ `ProjectApiKeyListResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of API keys in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`ProjectApiKeyListResponse`**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_project_rate_limits**
> `list_project_rate_limits`(_api::`ProjectsApi`, `project_id`::`String`; `limit`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `ProjectRateLimitListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_project_rate_limits`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`; `limit`=nothing, `after`=nothing, `before`=nothing, _mediaType=nothing) -> `Channel`{ `ProjectRateLimitListResponse` }, `OpenAPI.Clients.ApiResponse`

Returns the rate limits per model for a project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. The default is 100.  | [default to 100]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`before`** | **`String`** | A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [default to nothing]

### Return type

[**`ProjectRateLimitListResponse`**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_project_service_accounts**
> `list_project_service_accounts`(_api::`ProjectsApi`, `project_id`::`String`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `ProjectServiceAccountListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_project_service_accounts`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `Channel`{ `ProjectServiceAccountListResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of service accounts in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`ProjectServiceAccountListResponse`**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_project_users**
> `list_project_users`(_api::`ProjectsApi`, `project_id`::`String`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `ProjectUserListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_project_users`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`; `limit`=nothing, `after`=nothing, _mediaType=nothing) -> `Channel`{ `ProjectUserListResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of users in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]

### Return type

[**`ProjectUserListResponse`**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **list_projects**
> `list_projects`(_api::`ProjectsApi`; `limit`=nothing, `after`=nothing, `include_archived`=nothing, _mediaType=nothing) -> `ProjectListResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `list_projects`(_api::`ProjectsApi`, response_stream::`Channel`; `limit`=nothing, `after`=nothing, `include_archived`=nothing, _mediaType=nothing) -> `Channel`{ `ProjectListResponse` }, `OpenAPI.Clients.ApiResponse`

Returns a list of projects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [default to 20]
 **`after`** | **`String`** | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [default to nothing]
 **`include_archived`** | **`Bool`** | If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [default to false]

### Return type

[**`ProjectListResponse`**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_project**
> `modify_project`(_api::`ProjectsApi`, `project_id`::`String`, `project_update_request`::`ProjectUpdateRequest`; _mediaType=nothing) -> `Project`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_project`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `project_update_request`::`ProjectUpdateRequest`; _mediaType=nothing) -> `Channel`{ `Project` }, `OpenAPI.Clients.ApiResponse`

Modifies a project in the organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`project_update_request`** | [**`ProjectUpdateRequest`**](ProjectUpdateRequest.md) | The project update request payload. |

### Return type

[**`Project`**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **modify_project_user**
> `modify_project_user`(_api::`ProjectsApi`, `project_id`::`String`, `user_id`::`String`, `project_user_update_request`::`ProjectUserUpdateRequest`; _mediaType=nothing) -> `ProjectUser`, `OpenAPI.Clients.ApiResponse` <br/>
> `modify_project_user`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `user_id`::`String`, `project_user_update_request`::`ProjectUserUpdateRequest`; _mediaType=nothing) -> `Channel`{ `ProjectUser` }, `OpenAPI.Clients.ApiResponse`

Modifies a user's role in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`user_id`** | **`String`** | The ID of the user. |
**`project_user_update_request`** | [**`ProjectUserUpdateRequest`**](ProjectUserUpdateRequest.md) | The project user update request payload. |

### Return type

[**`ProjectUser`**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_project**
> `retrieve_project`(_api::`ProjectsApi`, `project_id`::`String`; _mediaType=nothing) -> `Project`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_project`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`; _mediaType=nothing) -> `Channel`{ `Project` }, `OpenAPI.Clients.ApiResponse`

Retrieves a project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |

### Return type

[**`Project`**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_project_api_key**
> `retrieve_project_api_key`(_api::`ProjectsApi`, `project_id`::`String`, `key_id`::`String`; _mediaType=nothing) -> `ProjectApiKey`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_project_api_key`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `key_id`::`String`; _mediaType=nothing) -> `Channel`{ `ProjectApiKey` }, `OpenAPI.Clients.ApiResponse`

Retrieves an API key in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`key_id`** | **`String`** | The ID of the API key. |

### Return type

[**`ProjectApiKey`**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_project_service_account**
> `retrieve_project_service_account`(_api::`ProjectsApi`, `project_id`::`String`, `service_account_id`::`String`; _mediaType=nothing) -> `ProjectServiceAccount`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_project_service_account`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `service_account_id`::`String`; _mediaType=nothing) -> `Channel`{ `ProjectServiceAccount` }, `OpenAPI.Clients.ApiResponse`

Retrieves a service account in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`service_account_id`** | **`String`** | The ID of the service account. |

### Return type

[**`ProjectServiceAccount`**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **retrieve_project_user**
> `retrieve_project_user`(_api::`ProjectsApi`, `project_id`::`String`, `user_id`::`String`; _mediaType=nothing) -> `ProjectUser`, `OpenAPI.Clients.ApiResponse` <br/>
> `retrieve_project_user`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `user_id`::`String`; _mediaType=nothing) -> `Channel`{ `ProjectUser` }, `OpenAPI.Clients.ApiResponse`

Retrieves a user in the project.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`user_id`** | **`String`** | The ID of the user. |

### Return type

[**`ProjectUser`**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **update_project_rate_limits**
> `update_project_rate_limits`(_api::`ProjectsApi`, `project_id`::`String`, `rate_limit_id`::`String`, `project_rate_limit_update_request`::`ProjectRateLimitUpdateRequest`; _mediaType=nothing) -> `ProjectRateLimit`, `OpenAPI.Clients.ApiResponse` <br/>
> `update_project_rate_limits`(_api::`ProjectsApi`, response_stream::`Channel`, `project_id`::`String`, `rate_limit_id`::`String`, `project_rate_limit_update_request`::`ProjectRateLimitUpdateRequest`; _mediaType=nothing) -> `Channel`{ `ProjectRateLimit` }, `OpenAPI.Clients.ApiResponse`

Updates a project rate limit.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ProjectsApi`** | API context | 
**`project_id`** | **`String`** | The ID of the project. |
**`rate_limit_id`** | **`String`** | The ID of the rate limit. |
**`project_rate_limit_update_request`** | [**`ProjectRateLimitUpdateRequest`**](ProjectRateLimitUpdateRequest.md) | The project rate limit update request payload. |

### Return type

[**`ProjectRateLimit`**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

