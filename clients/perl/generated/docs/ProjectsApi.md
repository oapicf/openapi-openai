# WWW::OpenAPIClient::ProjectsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ProjectsApi;
```

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
> Project archive_project(project_id => $project_id)

Archives a project in the organization. Archived projects cannot be used or updated.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.

eval {
    my $result = $api_instance->archive_project(project_id => $project_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->archive_project: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project**
> Project create_project(project_create_request => $project_create_request)

Create a new project in the organization. Projects can be created and archived, but cannot be deleted.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_create_request = WWW::OpenAPIClient::Object::ProjectCreateRequest->new(); # ProjectCreateRequest | The project create request payload.

eval {
    my $result = $api_instance->create_project(project_create_request => $project_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->create_project: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project_service_account**
> ProjectServiceAccountCreateResponse create_project_service_account(project_id => $project_id, project_service_account_create_request => $project_service_account_create_request)

Creates a new service account in the project. This also returns an unredacted API key for the service account.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $project_service_account_create_request = WWW::OpenAPIClient::Object::ProjectServiceAccountCreateRequest->new(); # ProjectServiceAccountCreateRequest | The project service account create request payload.

eval {
    my $result = $api_instance->create_project_service_account(project_id => $project_id, project_service_account_create_request => $project_service_account_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->create_project_service_account: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **project_service_account_create_request** | [**ProjectServiceAccountCreateRequest**](ProjectServiceAccountCreateRequest.md)| The project service account create request payload. | 

### Return type

[**ProjectServiceAccountCreateResponse**](ProjectServiceAccountCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_project_user**
> ProjectUser create_project_user(project_id => $project_id, project_user_create_request => $project_user_create_request)

Adds a user to the project. Users must already be members of the organization to be added to a project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $project_user_create_request = WWW::OpenAPIClient::Object::ProjectUserCreateRequest->new(); # ProjectUserCreateRequest | The project user create request payload.

eval {
    my $result = $api_instance->create_project_user(project_id => $project_id, project_user_create_request => $project_user_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->create_project_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **project_user_create_request** | [**ProjectUserCreateRequest**](ProjectUserCreateRequest.md)| The project user create request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_api_key**
> ProjectApiKeyDeleteResponse delete_project_api_key(project_id => $project_id, key_id => $key_id)

Deletes an API key from the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $key_id = "key_id_example"; # string | The ID of the API key.

eval {
    my $result = $api_instance->delete_project_api_key(project_id => $project_id, key_id => $key_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->delete_project_api_key: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **key_id** | **string**| The ID of the API key. | 

### Return type

[**ProjectApiKeyDeleteResponse**](ProjectApiKeyDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_service_account**
> ProjectServiceAccountDeleteResponse delete_project_service_account(project_id => $project_id, service_account_id => $service_account_id)

Deletes a service account from the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $service_account_id = "service_account_id_example"; # string | The ID of the service account.

eval {
    my $result = $api_instance->delete_project_service_account(project_id => $project_id, service_account_id => $service_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->delete_project_service_account: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **service_account_id** | **string**| The ID of the service account. | 

### Return type

[**ProjectServiceAccountDeleteResponse**](ProjectServiceAccountDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_project_user**
> ProjectUserDeleteResponse delete_project_user(project_id => $project_id, user_id => $user_id)

Deletes a user from the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $user_id = "user_id_example"; # string | The ID of the user.

eval {
    my $result = $api_instance->delete_project_user(project_id => $project_id, user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->delete_project_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **user_id** | **string**| The ID of the user. | 

### Return type

[**ProjectUserDeleteResponse**](ProjectUserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_api_keys**
> ProjectApiKeyListResponse list_project_api_keys(project_id => $project_id, limit => $limit, after => $after)

Returns a list of API keys in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

eval {
    my $result = $api_instance->list_project_api_keys(project_id => $project_id, limit => $limit, after => $after);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->list_project_api_keys: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectApiKeyListResponse**](ProjectApiKeyListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_rate_limits**
> ProjectRateLimitListResponse list_project_rate_limits(project_id => $project_id, limit => $limit, after => $after, before => $before)

Returns the rate limits per model for a project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $limit = 100; # int | A limit on the number of objects to be returned. The default is 100. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $before = "before_example"; # string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 

eval {
    my $result = $api_instance->list_project_rate_limits(project_id => $project_id, limit => $limit, after => $after, before => $before);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->list_project_rate_limits: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **limit** | **int**| A limit on the number of objects to be returned. The default is 100.  | [optional] [default to 100]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ProjectRateLimitListResponse**](ProjectRateLimitListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_service_accounts**
> ProjectServiceAccountListResponse list_project_service_accounts(project_id => $project_id, limit => $limit, after => $after)

Returns a list of service accounts in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

eval {
    my $result = $api_instance->list_project_service_accounts(project_id => $project_id, limit => $limit, after => $after);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->list_project_service_accounts: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectServiceAccountListResponse**](ProjectServiceAccountListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_project_users**
> ProjectUserListResponse list_project_users(project_id => $project_id, limit => $limit, after => $after)

Returns a list of users in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

eval {
    my $result = $api_instance->list_project_users(project_id => $project_id, limit => $limit, after => $after);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->list_project_users: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ProjectUserListResponse**](ProjectUserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_projects**
> ProjectListResponse list_projects(limit => $limit, after => $after, include_archived => $include_archived)

Returns a list of projects.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $include_archived = false; # boolean | If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.

eval {
    my $result = $api_instance->list_projects(limit => $limit, after => $after, include_archived => $include_archived);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->list_projects: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **include_archived** | **boolean**| If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default. | [optional] [default to false]

### Return type

[**ProjectListResponse**](ProjectListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_project**
> Project modify_project(project_id => $project_id, project_update_request => $project_update_request)

Modifies a project in the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $project_update_request = WWW::OpenAPIClient::Object::ProjectUpdateRequest->new(); # ProjectUpdateRequest | The project update request payload.

eval {
    my $result = $api_instance->modify_project(project_id => $project_id, project_update_request => $project_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->modify_project: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **project_update_request** | [**ProjectUpdateRequest**](ProjectUpdateRequest.md)| The project update request payload. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_project_user**
> ProjectUser modify_project_user(project_id => $project_id, user_id => $user_id, project_user_update_request => $project_user_update_request)

Modifies a user's role in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $user_id = "user_id_example"; # string | The ID of the user.
my $project_user_update_request = WWW::OpenAPIClient::Object::ProjectUserUpdateRequest->new(); # ProjectUserUpdateRequest | The project user update request payload.

eval {
    my $result = $api_instance->modify_project_user(project_id => $project_id, user_id => $user_id, project_user_update_request => $project_user_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->modify_project_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **user_id** | **string**| The ID of the user. | 
 **project_user_update_request** | [**ProjectUserUpdateRequest**](ProjectUserUpdateRequest.md)| The project user update request payload. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project**
> Project retrieve_project(project_id => $project_id)

Retrieves a project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.

eval {
    my $result = $api_instance->retrieve_project(project_id => $project_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->retrieve_project: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 

### Return type

[**Project**](Project.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project_api_key**
> ProjectApiKey retrieve_project_api_key(project_id => $project_id, key_id => $key_id)

Retrieves an API key in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $key_id = "key_id_example"; # string | The ID of the API key.

eval {
    my $result = $api_instance->retrieve_project_api_key(project_id => $project_id, key_id => $key_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->retrieve_project_api_key: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **key_id** | **string**| The ID of the API key. | 

### Return type

[**ProjectApiKey**](ProjectApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project_service_account**
> ProjectServiceAccount retrieve_project_service_account(project_id => $project_id, service_account_id => $service_account_id)

Retrieves a service account in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $service_account_id = "service_account_id_example"; # string | The ID of the service account.

eval {
    my $result = $api_instance->retrieve_project_service_account(project_id => $project_id, service_account_id => $service_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->retrieve_project_service_account: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **service_account_id** | **string**| The ID of the service account. | 

### Return type

[**ProjectServiceAccount**](ProjectServiceAccount.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_project_user**
> ProjectUser retrieve_project_user(project_id => $project_id, user_id => $user_id)

Retrieves a user in the project.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $user_id = "user_id_example"; # string | The ID of the user.

eval {
    my $result = $api_instance->retrieve_project_user(project_id => $project_id, user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->retrieve_project_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **user_id** | **string**| The ID of the user. | 

### Return type

[**ProjectUser**](ProjectUser.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_project_rate_limits**
> ProjectRateLimit update_project_rate_limits(project_id => $project_id, rate_limit_id => $rate_limit_id, project_rate_limit_update_request => $project_rate_limit_update_request)

Updates a project rate limit.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ProjectsApi;
my $api_instance = WWW::OpenAPIClient::ProjectsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $project_id = "project_id_example"; # string | The ID of the project.
my $rate_limit_id = "rate_limit_id_example"; # string | The ID of the rate limit.
my $project_rate_limit_update_request = WWW::OpenAPIClient::Object::ProjectRateLimitUpdateRequest->new(); # ProjectRateLimitUpdateRequest | The project rate limit update request payload.

eval {
    my $result = $api_instance->update_project_rate_limits(project_id => $project_id, rate_limit_id => $rate_limit_id, project_rate_limit_update_request => $project_rate_limit_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ProjectsApi->update_project_rate_limits: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project_id** | **string**| The ID of the project. | 
 **rate_limit_id** | **string**| The ID of the rate limit. | 
 **project_rate_limit_update_request** | [**ProjectRateLimitUpdateRequest**](ProjectRateLimitUpdateRequest.md)| The project rate limit update request payload. | 

### Return type

[**ProjectRateLimit**](ProjectRateLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

